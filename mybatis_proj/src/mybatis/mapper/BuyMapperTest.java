package mybatis.mapper;

public class BuyMapperTest {
  public static void main(String[] args) {
    BuyMapperDao dao = new BuyMapperDao();
    String pcode = "APLE5kg"; // DOWON123a, JINRMn5 , APLE5kg ,
    System.out.println(pcode + " 상품의 고객 구매 내역 : " + dao.selectByPcode(pcode));
    System.out.println(pcode + " 상품의 구매 수량 합계 : " + dao.selectSumByPcode(pcode));
    System.out.println(" 2024 년도 상품 구매 내역 : " + dao.selectByYear("2024"));
    String cutomerId = "wonder"; // mina012, twice, hongGD , wonder
    System.out.println(cutomerId + "고객의 상품 구매 내역 : " + dao.selectByCustomer(cutomerId));
  }
}
