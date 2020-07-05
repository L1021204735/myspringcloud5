package com.en.controller;

import com.en.po.ProductPo;
import com.en.service.IProductService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Resource
    private IProductService iProductService;

    @RequestMapping(value="/getInfoById/{id}")
    public Object get(@PathVariable("id") long id) {
        return this.iProductService.getInfoById(id) ;
    }
    @RequestMapping(value="/addInfo")
    public Object add(@RequestBody ProductPo productPo) {
        return this.iProductService.addInfo(productPo) ;
    }
    @RequestMapping(value="/getAllInfo")
    public Object list() {
        return this.iProductService.getAllInfo() ;
    }

}