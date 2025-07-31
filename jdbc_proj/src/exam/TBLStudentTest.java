package exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.OracleConnection;

public class TBLStudentTest {
  public static void main(String[] args) {
    String stuno = System.console().readLine("학번 >>> ");
    String name = System.console().readLine("이름 >>> ");
    String temp = System.console().readLine("나이 >>> ");
    String address = System.console().readLine("주소 >>> ");

    if (stuno.length() == 0 || name.length() == 0) {
      System.out.println("필수 입력입니다.");
    } else {
      if (address.length() == 0)
        address = null;
        
      insert(stuno, name, age, address);
    }
  }

  private static void insert(String stuno, String name, int age, String address) {
    Connection conn = OracleConnection.getConnection();
    PreparedStatement pstat = null;
    String sql = "insert into tbl_student(stuno,name,age,address) values (?,?,?,?)";
    try {
      conn.setAutoCommit(false);
      pstat = conn.prepareStatement(sql);

      pstat.setString(1, stuno);
      pstat.setString(2, name);
      pstat.setInt(3, age);
      pstat.setString(4, null);
      pstat.execute();
      // conn.commit();
      System.out.println("1개 행이 저장되었습니다.");
    } catch (SQLException e) {
      System.out.println("insert 예외 : " + e.getMessage());
    } finally {
      OracleConnection.close(conn);
      try {
        if (pstat != null)
          pstat.close();
      } catch (SQLException e) {
      }
    }
  }
}
