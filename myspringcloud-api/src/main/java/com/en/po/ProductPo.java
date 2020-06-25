package com.en.po;

import lombok.Data;
import java.io.Serializable;

@Data
public class ProductPo implements Serializable {

    private Long productId;
    private String productName;
    private String productDesc;

}