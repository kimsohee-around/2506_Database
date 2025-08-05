package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import sql.PreparedStatementTest;
import vo.ProductVo;

public class TblProductDao {

  private static final String URL = "jdbc:oracle:thin:@//localhost:1521/xe";
  private static final String USERNAME = "c##idev";
  private static final String PASSWORD = "1234";

  private Connection getConnection() throws SQLException {
    return DriverManager.getConnection(URL, USERNAME, PASSWORD);
  }

  // 상품 조회 : 키워드로 조회 (0~n개 행 조회)
  // 예시 : select * from tbl_product where pname like '%kg%'
  public List<ProductVo> searchByKeyword(String keyword) {
    String sql = "select * from tbl_product where pname like '%' || ? ||'%'";
    List<ProductVo> list = new ArrayList<>();
    try ( // 자동 close
        Connection connection = getConnection(); // 커넥션
        PreparedStatement pstat = connection.prepareStatement(sql); // sql 실행 준비
    ) {
      // sql 매개변수
      pstat.setString(1, keyword);
      // select 실행
      ResultSet rs = pstat.executeQuery();
      // rs 결과를 활용
      ProductVo vo = null;
      while (rs.next()) {  // rs의 행집합은 n개 -> 반복으로 접근
        vo = new ProductVo(rs.getString(1),
            rs.getString(2),
            rs.getString(3),
            rs.getInt(4));
        // vo는 list에 추가
        list.add(vo);
      }

    } catch (Exception e) {
      System.out.println("예외 : " + e.getMessage());
      e.printStackTrace(); // 임시 (상세한 예외 원인 파악)
    }
    return list;
  }

}
