package mybatis.mapper;

import java.util.List;

import mybatis.vo.BuyVo;

public interface BuyMapper {
  List<BuyVo> selectByCustomer(String customer_id);

  List<BuyVo> selectByPcode(String pcode);

  List<BuyVo> selectByYear(String year);

  int selectSumByPcode(String pcode);

}
