package com.en.controller;

import com.en.po.ProductPo;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import javax.annotation.Resource;
import java.util.List;
/**
 * @ClassName ConsumerProductController
 * @Description 服务消费方控制器
 * @Author liuxiaobai
 * @Date 2020年6月26日09:18:41
 * @Version 1.0
 **/
@RestController
@RequestMapping("/consumer")
public class ConsumerProductController {

    private static final String PRODUCT_GET_URL = "http://localhost:8081/prodcut/getInfoById/";
    private static final String PRODUCT_LIST_URL="http://localhost:8081/prodcut/getAllInfo/";
    private static final String PRODUCT_ADD_URL = "http://localhost:8081/prodcut/addInfo/";
    @Resource
    private RestTemplate restTemplate;
    @Resource
    private HttpHeaders httpHeaders;

    @RequestMapping("/product/getInfoById")
    public Object getProduct(long id) {

        return  restTemplate.exchange(PRODUCT_GET_URL + id,HttpMethod.GET,new HttpEntity<>(httpHeaders), ProductPo.class).getBody();
    }

    @RequestMapping("/product/getAllInfo")
    public  Object listProduct() {

        return restTemplate.exchange(PRODUCT_LIST_URL,HttpMethod.GET,new HttpEntity<>(httpHeaders), List.class).getBody();
    }

    @RequestMapping("/product/addInfo")
    public Object addPorduct(ProductPo productPo) {

        return  restTemplate.exchange(PRODUCT_ADD_URL, HttpMethod.POST,new HttpEntity<>(productPo,httpHeaders), Boolean.class).getBody();
    }
}