package com.en.service;


import com.en.feign.FeignClientConfig;
import com.en.po.ProductPo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "MYSPRINGCLOUD-PROVIDER-PRODUCT",configuration = FeignClientConfig.class)
public interface IProductClientService {

    @RequestMapping("/prodcut/getInfoById/{id}")
    ProductPo getProduct(@PathVariable("id")long id);

    @RequestMapping("/prodcut/getAllInfo")
    List<ProductPo> listProduct() ;

    @RequestMapping("/prodcut/addInfo")
    boolean addPorduct(ProductPo productPo) ;

}
