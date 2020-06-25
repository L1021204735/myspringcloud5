package com.en.controller;

import com.en.po.ProductPo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/consumer")
public class ConsumerProductController {
    public static final String PRODUCT_GET_URL = "http://localhost:8081/prodcut/getInfoById/";
    public static final String PRODUCT_LIST_URL="http://localhost:8081/prodcut/getAllInfo/";
    public static final String PRODUCT_ADD_URL = "http://localhost:8081/prodcut/addInfo/";
    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/product/getInfoById")
    public Object getProduct(long id) {

        return restTemplate.getForObject(PRODUCT_GET_URL + id, ProductPo.class);
    }

    @RequestMapping("/product/getAllInfo")
    public  Object listProduct() {

        return restTemplate.getForObject(PRODUCT_LIST_URL, List.class);
    }

    @RequestMapping("/product/addInfo")
    public Object addPorduct(ProductPo productPo) {

        return restTemplate.postForObject(PRODUCT_ADD_URL, productPo, Boolean.class);
    }
}
