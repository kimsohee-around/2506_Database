import mybatis.dao.MybatisReCustomerDao;
import mybatis.vo.CustomerVo;

public class App {
    public static void main(String[] args) throws Exception {
        MybatisReCustomerDao dao = new MybatisReCustomerDao();
        int result = dao.insert(
                new CustomerVo("hongGS", "hong gilS", "hgs@a.com", 22, null));
        System.out.println("insert result : " + result);
    }
}
