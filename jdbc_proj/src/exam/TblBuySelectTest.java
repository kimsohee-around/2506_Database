package exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.OracleConnection;

public class TblBuySelectTest {
  public static void main(String[] args) {

  }

  public static void selectByPk() {
    String temp = System.console().readLine("구매 번호 입력 >>> ");
    String sql = ""; // buy_seq 컬럼 조회하기
    Connection connection = OracleConnection.getConnection();
    try (
        PreparedStatement pstat = connection.prepareStatement(sql); // 자동 close
    ) {
      // 매개변수값 전달하기

      // 실행한 결과 행집합 ResultSet 타입으로 참조하기

      // 결과 행 있으면 가져오기(1회) - 컬럼값들 출력
    } catch (SQLException | NumberFormatException e) {
      System.out.println("selectByPk 예외 : " + e.getMessage());
    } finally {
      OracleConnection.close(connection);
    }
  }

  public static void selectByCustomerId() {
    String customerid = System.console().readLine("구매 내역 조회 고객ID 입력 >>> ");
    String sql = ""; // customer_id 컬럼 조회하기
    Connection connection = OracleConnection.getConnection();
    try (
        PreparedStatement pstat = connection.prepareStatement(sql); // 자동 close
    ) {
      // 매개변수값 전달하기

      // 실행한 결과 행집합 ResultSet 타입으로 참조하기

      // 순차적으로 결과 행 가져오기(n 회) - 컬럼값들 출력
    } catch (SQLException | NumberFormatException e) {
      System.out.println("selectByPk 예외 : " + e.getMessage());
    } finally {
      OracleConnection.close(connection);
    }
  }
}
