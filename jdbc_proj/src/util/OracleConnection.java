package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnection {
  // jdbc:oracle:thin: 는 jdbc 통신 프로토콜.
  // 참고로 mysql 은 jdbc:mysql://localhost:3306/데이터베이스이름
  public static final String URL = "jdbc:oracle:thin:@//localhost:1521/xe";
  public static final String USERNAME = "c##idev";
  public static final String PASSWORD = "1234";

  // Connection 은 인터페이스 타입. 드라이버 클래스를 통한 객체 생성은 DriverManager 가 실행함.
  // 생성된 객체 리턴. Connection 객체를 통해 SQL 실행합니다.
  public static Connection getConnection() {
    Connection connection = null;
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
      connection.setAutoCommit(false);
    } catch (SQLException | ClassNotFoundException e) {
      System.out.println("오라클 db 연결 실패 : " + e.getMessage());
    }

    return connection;
  }

  // SQL 실행이 끝나면 Connection 객체를 해제(close)
  public static void close(Connection connection) {
    try {
      if (connection != null)
        connection.close();
    } catch (SQLException e) {
      System.out.println("오라클 db close 실패 : " + e.getMessage());
    }
  }

  // Connection 생성 테스트
  public static void main(String[] args) {
    Connection conn = getConnection();
    System.out.println("Connection 객체 생성 상태 : " + conn); // null 아닌 참조값
    System.out.println("Connection 구현 클래스 : " + conn.getClass().getName());

    // Connection 객체 생성 상태 : oracle.jdbc.driver.T4CConnection@262b2c86
    // Connection 구현 클래스 : oracle.jdbc.driver.T4CConnection
  }
}
