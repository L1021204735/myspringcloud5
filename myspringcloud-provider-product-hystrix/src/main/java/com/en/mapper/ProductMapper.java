package com.en.mapper;

import com.en.po.ProductPo;
import java.util.List;

public interface ProductMapper {
    /**
     * @Description  添加数据
     * @Param [productPo]
     * @return boolean
     * @throws
     **/
    boolean addInfo(ProductPo product);
    /**
     * @Description 根据ID获取信息
     * @Param [id]
     * @return com.en.po.ProductPo
     * @throws
     **/
    ProductPo getInfoById(Long id);
    /**
     * @Description 查询数据库所有信息
     * @Param []
     * @return java.util.List<com.en.po.ProductPo>
     * @throws
     **/
    List<ProductPo> getAllInfo();
}