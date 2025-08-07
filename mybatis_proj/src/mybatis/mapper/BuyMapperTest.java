package mybatis.mapper;

import java.util.Map;

public class BuyMapperTest {

  public static void main(String[] args) {
    BuyMapperDao dao = new BuyMapperDao();
    String cutomerId = "hongGD"; // mina012, twice, hongGD , wonder
    System.out.println(cutomerId + "고객 구매 내역 집계 : " + dao.saleByCustomer(cutomerId));
    // 리턴타입이 Map
    String year = "2024";
    Map<String, Integer> result = dao.countByYear(year);
    System.out.println(year + " 년도 구매 건수 : " + result);
    // 2024 년도 구매 건수 : {YEAR=2024, COUNT=3} :
    // year는 key, 2024는 값(value) ,count는 key, 3은 값(value)
    System.out.println(result.get("YEAR"));
    System.out.println(result.get("COUNT"));

  }
  /*
   * public static void main(String[] args) {
   * BuyMapperDao dao = new BuyMapperDao();
   * String pcode = "APLE5kg"; // DOWON123a, JINRMn5 , APLE5kg ,
   * System.out.println(pcode + " 상품의 고객 구매 내역 : " + dao.selectByPcode(pcode));
   * System.out.println(pcode + " 상품의 구매 수량 합계 : " + dao.selectSumByPcode(pcode));
   * System.out.println(" 2024 년도 상품 구매 내역 : " + dao.selectByYear("2024"));
   * String cutomerId = "wonder"; // mina012, twice, hongGD , wonder
   * System.out.println(cutomerId + "고객의 상품 구매 내역 : " +
   * dao.selectByCustomer(cutomerId));
   * }
   */
}
