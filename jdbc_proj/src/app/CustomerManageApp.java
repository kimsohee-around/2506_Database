package app;

import dao.TblCustomerDao;
import vo.CustomerVo;

public class CustomerManageApp {

  public static void main(String[] args) {
    System.out.println("========= 고객 관리 App ==========");
    boolean run = true;
    while (run) {
      System.out.println("선택 메뉴 : 1. 고객 등록   2. 고객 정보 조회");
      String menu = System.console().readLine("메뉴 선택 >>>> ");
      switch (menu) {
        case "1":
          register();
          break;
        case "2":

          break;
        default:
          System.out.println("없는 메뉴 입니다.");
          break;
      }
    }
  }

  private static void register() {
    System.out.println("\t :: 고객 등록 ::");
    String customerId = System.console().readLine("사용할 아이디 >>> ");
    // customerId는 PK - 중복 검사 필요
    String name = System.console().readLine("성명 >>> ");
    String email = System.console().readLine("이메일 >>> ");
    String temp = System.console().readLine("나이 >>> ");
    int age = Integer.parseInt(temp);
    // 예외 처리 NumberFormatException 필요

    // 🔥 dao 의 insert 실행
    CustomerVo vo = new CustomerVo(customerId, name, email, age, null);
    TblCustomerDao dao = new TblCustomerDao();
    if (dao.insert(vo) == 0)
      System.out.println("고객 등록 실패!!!");
    else
      System.out.println("고객 등록 완료!!");
  }
}
