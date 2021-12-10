package top.mphy.mallbackend.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import top.mphy.mallbackend.entity.Product;

import java.math.BigInteger;
import java.util.List;

@Mapper
public interface ProductMapper {
    // 查询所有商品信息
    @Select("SELECT * FROM `product`")
    List<Product> findAll();

}
