package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.OracleConnection;

public class TBLStudentTest {

  public static void main(String[] args) {
    updateAddress("2025005", "서울시 구로구 구로동2222");
  }

  public static void addStudent() {
    String stuno = System.console().readLine("학번 >>> "); // not null
    String name = System.console().readLine("이름 >>> "); // not null
    String age = System.console().readLine("나이 >>> "); // null 허용
    String address = System.console().readLine("주소 >>> "); // null 허용

    if (stuno.length() == 0 || name.length() == 0) {
      System.out.println("필수 입력입니다.");
    } else {
      if (age.length() == 0) {
        age = null;
      }
      if (address.length() == 0)
        address = null;

      insert(stuno, name, age, address);
    }
  }

  private static void updateAddress(String stuno, String address) {

    String sql = "update tbl_student set address = ? where stuno = ?";
    try ( // try with resources : 자동 close
        Connection connection = DriverManager.getConnection(OracleConnection.URL, OracleConnection.USERNAME,
            OracleConnection.PASSWORD);
        PreparedStatement pstat = connection.prepareStatement(sql);) {
      connection.setAutoCommit(false);
      pstat.setString(1, address);
      pstat.setString(2, stuno);
      pstat.executeUpdate();
    } catch (SQLException e) {
      System.out.println("SQL 예외 : " + e.getMessage());
    } // finally 없음. 자동 close 구문

  }

  private static void insert(String stuno, String name, String age, String address) {
    Connection conn = OracleConnection.getConnection();
    PreparedStatement pstat = null;
    String sql = "insert into tbl_student(stuno,name,age,address) values (?,?,?,?)";
    try {
      conn.setAutoCommit(false);
      // ✅ 직접 commit 을 해야 테이블에 반영. '오라클'은 commit 은 자동, rollback 은 명령어로.
      System.out.println("conn :" + conn.getAutoCommit());
      pstat = conn.prepareStatement(sql);

      pstat.setString(1, stuno);
      pstat.setString(2, name);
      pstat.setString(3, age); // setInt(3,null) 불가. 오라클에서는 문자열을 number 타입으로 자동캐스팅
      pstat.setString(4, address);
      pstat.executeUpdate();
      // conn.rollback(); -- insert 명령이 테이블에 반영이 안됩니다.
      System.out.println("1개 행이 저장되었습니다.");
    } catch (SQLException e) {
      System.out.println("insert 예외 : " + e.getMessage());
    } finally {
      // OracleConnection.close(conn); // close 가 없으면 세션이 유지. commit 안됨.
      try {
        if (pstat != null)
          pstat.close();
      } catch (SQLException e) {
      }
    }
  }
}
