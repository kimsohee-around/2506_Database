package exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.OracleConnection;

public class TBLStudentTest {
  public static void main(String[] args) {
    insert();
  }

  private static void insert() {
    Connection conn = OracleConnection.getConnection();
    PreparedStatement pstat = null;
    String sql = "insert into tbl_student(stuno,name,age,address) values (?,?,?,?)";
    try {
      conn.setAutoCommit(false);
      pstat = conn.prepareStatement(sql);
      String stuno = "2025011";
      String name = "김다현";
      int age = 23;
      pstat.setString(1, stuno);
      pstat.setString(2, name);
      pstat.setInt(3, age);
      pstat.executeUpdate();
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
