package com.en.service.fallback;


import com.en.po.ProductPo;
import com.en.service.IProductClientService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class IProductClientServiceFallbackFactory implements FallbackFactory<IProductClientService> {
    @Override
    public IProductClientService create(Throwable throwable) {
        return  new IProductClientService() {
            @Override
            public ProductPo getProduct(long id) {
                ProductPo product = new ProductPo();
                product.setProductId(999999L);
                product.setProductName("feign-hystrixName");
                product.setProductDesc("feign-hystrixDesc");
                return  product;
            }

            @Override
            public List<ProductPo> listProduct() {
                return null;
            }

            @Override
            public boolean addPorduct(ProductPo product) {
                return false;
            }
        };
    }
}