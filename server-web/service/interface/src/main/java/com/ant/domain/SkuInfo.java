package com.ant.domain;


import java.io.Serializable;

/**
 * <p>
 *  SkuInfo 实体
 * </p>
 *
 * @author Ant
 * @date 2022/10/05 01:04
 */
public class SkuInfo implements Serializable {

    private static final long serialVersionUID = 6794715351831628727L;

    private String skuId;

    private String skuName;

    public SkuInfo() {}

    public SkuInfo(String skuId) {
        this.skuId = skuId;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    @Override
    public String toString() {
        return "SkuInfo{" +
                "skuId='" + skuId + '\'' +
                ", skuName='" + skuName + '\'' +
                '}';
    }
}
