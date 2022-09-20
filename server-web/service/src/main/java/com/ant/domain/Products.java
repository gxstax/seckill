package com.ant.domain;

import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

/**
 * <p>
 * 商品表实体
 * </p>
 *
 * @author Ant
 * @since 2021/10/9 8:31 下午
 */
public class Products {

    private @Id Long id;

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
    private String normalPrice;

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
    private Integer deletedAt;

    /**
     * 创建时间
     */
    private Integer createdAt;

    /**
     * 更新时间
     */
    private Integer updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getNormalPrice() {
        return normalPrice;
    }

    public void setNormalPrice(String normalPrice) {
        this.normalPrice = normalPrice;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Integer deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", no='" + no + '\'' +
                ", name='" + name + '\'' +
                ", pictureUrl='" + pictureUrl + '\'' +
                ", normalPrice='" + normalPrice + '\'' +
                ", mark=" + mark +
                ", state=" + state +
                '}';
    }
}
