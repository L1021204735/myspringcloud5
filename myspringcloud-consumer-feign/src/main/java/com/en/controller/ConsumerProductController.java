package com.en.controller;

import com.en.po.ProductPo;
import com.en.service.IProductClientService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
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

    @Resource
    private IProductClientService iProductClientService;

    @RequestMapping("/product/getInfoById")
    public Object getProduct(long id) {

        return  iProductClientService.getProduct(id);
    }

    @RequestMapping("/product/getAllInfo")
    public  Object listProduct() {

        return iProductClientService.listProduct();
    }

    @RequestMapping("/product/addInfo")
    public Object addPorduct(ProductPo productPo) {

        return  iProductClientService.addPorduct(productPo);
    }
}