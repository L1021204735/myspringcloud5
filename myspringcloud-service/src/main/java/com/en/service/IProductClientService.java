package com.en.service;


import com.en.feign.FeignClientConfig;
import com.en.po.ProductPo;
import com.en.service.fallback.IProductClientServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "MYSPRINGCLOUD-PROVIDER-PRODUCT",configuration = FeignClientConfig.class,fallbackFactory = IProductClientServiceFallbackFactory.class)
public interface IProductClientService {

    @RequestMapping("/product/getInfoById/{id}")
    ProductPo getProduct(@PathVariable("id")long id);

    @RequestMapping("/product/getAllInfo")
    List<ProductPo> listProduct() ;

    @RequestMapping("/product/addInfo")
    boolean addPorduct(ProductPo productPo) ;

}
