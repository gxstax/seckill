package com.ant.domain.dto;

import java.io.Serializable;

/**
 * <p>
 * 商品详情DTO
 * </p>
 *
 * @Author Ant
 * @Date 2022/10/13 23:39
 */
public class ProductDetailDTO implements Serializable {

    private String productName;
    private String productPrice;
    private String productPictureUrl;
    private Integer tag;
    private Integer isAvailable;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductPictureUrl() {
        return productPictureUrl;
    }

    public void setProductPictureUrl(String productPictureUrl) {
        this.productPictureUrl = productPictureUrl;
    }

    public Integer getTag() {
        return tag;
    }

    public void setTag(Integer tag) {
        this.tag = tag;
    }

    public Integer getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Integer isAvailable) {
        this.isAvailable = isAvailable;
    }


    public ProductDetailDTO mock() {
        this.productName = "华为 mate 50";
        this.isAvailable = 1;
        this.tag = 0;
        this.productPrice = "5999.00";
        this.productPictureUrl = "";
        return this;
    }
}
