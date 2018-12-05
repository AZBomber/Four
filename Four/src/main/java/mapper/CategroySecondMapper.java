package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pojo.CategroyAndSecond;
import pojo.Product;

public interface CategroySecondMapper {
public List<CategroyAndSecond> findCategroySecondbycid();
public List<Product> findProductListByCid(@Param("cid")int cid,@Param("begin")int begin,@Param("limit")int limit);
public int findcountbycid(int cid);
public int findcountbycsid(int csid);
public List<Product> findProductListBycsid(@Param("csid")int csid,@Param("begin")int begin,@Param("limit")int limit);
}
