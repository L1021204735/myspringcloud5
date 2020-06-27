package com.en.service.impl;


import com.en.mapper.ProductMapper;
import com.en.po.ProductPo;
import com.en.service.IProductService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Resource
    private ProductMapper productMapper;

    @Override
    public ProductPo getInfoById(long id) {
        return productMapper.getInfoById(id);
    }

    @Override
    public boolean addInfo(ProductPo productPo) {
        return productMapper.addInfo(productPo);
    }

    @Override
    public List<ProductPo> getAllInfo() {
        return productMapper.getAllInfo();
    }
}