import mybatis.dao.MybatisReCustomerDao;
import mybatis.vo.CustomerVo;

public class App {
    public static void main(String[] args) throws Exception {
        MybatisReCustomerDao dao = new MybatisReCustomerDao();
        int result = dao.insert(
                new CustomerVo("hongGS22", "홍길순22", "hgs22@a.com", 22, null));
        System.out.println("insert result : " + result);

        System.out.println(dao.selectByPk("hongGS")); // 있는 PK 값
        System.out.println(dao.selectByPk("hongGSS")); // 없는 PK 값
    }
}
