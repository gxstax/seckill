package com.ant.domain.product.repository.po;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * <p>
 * 产品PO
 * </p>
 *
 * @Author Ant
 * @Date 2022/10/15 10:54
 */
@Entity
@Table(name = "products")
@Data
public class ProductsPO {

//    @GenericGenerator(name="idGenerator", strategy="uuid") //这个是hibernate的注解/生成32位UUID
//    @GeneratedValue(generator="idGenerator")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @Column(name = "picture_url")
    private String pictureUrl;

    /**
     * 正常价格
     */
    @Column(name = "normal_price")
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

    /**
     * 删除时间
     */
    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    /**
     * 创建时间
     */
    @Column(name = "created_at")
    private LocalDateTime createdAt;


    /**
     * 更新时间
     */
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

}
