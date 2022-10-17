package com.ant.facade.domain.product.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 商品实体
 * </p>
 *
 * @Author Ant
 * @Date 2022/10/15 12:09
 */
@Data
public class Product implements Serializable {

    /**
     * 商品ID
     */
    private Long id;

    /**
     * 商品编号
     */
    private String no;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 图片
     */
    private String pictureUrl;

    /**
     * 正常价格
     */
    private Integer normalPrice;

    /**
     * 商品标识
     */
    private Integer mark;

    /**
     * 账户状态（0:正常 1:锁定）
     */
    private Integer state;

    /**
     * 版本号
     */
    private Integer version;
}
