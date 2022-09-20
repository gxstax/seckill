package com.ant.domain;

/**
 * <p>
 * Sku信息
 * </p>
 *
 * @author GaoXin
 * @since 2021/10/19 5:56 下午
 */
public class SkuInfo {

    private Long id;

    private String skuNo;

    private String skuName;

    public SkuInfo() {}

    public SkuInfo(Long id, String skuNo, String skuName) {
        this.id = id;
        this.skuNo = skuNo;
        this.skuName = skuName;
    }


    public Long getId() {
        return id;
    }

    public String getSkuNo() {
        return skuNo;
    }

    public String getSkuName() {
        return skuName;
    }

}
