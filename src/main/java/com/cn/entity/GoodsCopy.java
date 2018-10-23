package com.cn.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author xun.guo123
 * @since 2018-09-23
 */
@TableName("goods_copy")
public class GoodsCopy extends Model<GoodsCopy> {

    private static final long serialVersionUID = 1L;

    private String id;
    private String gname;
    /**
     * 商品价格
     */
    private Float price;
    /**
     * 商品类型
     */
    private String gtype;
    /**
     * 寄送方式
     */
    private String sendtype;
    /**
     * 发货方
     */
    private String gshipper;
    /**
     * 销量
     */
    private Integer gsales;
    private String description;


    public String getId() {
        return id;
    }

    public GoodsCopy setId(String id) {
        this.id = id;
        return this;
    }

    public String getGname() {
        return gname;
    }

    public GoodsCopy setGname(String gname) {
        this.gname = gname;
        return this;
    }

    public Float getPrice() {
        return price;
    }

    public GoodsCopy setPrice(Float price) {
        this.price = price;
        return this;
    }

    public String getGtype() {
        return gtype;
    }

    public GoodsCopy setGtype(String gtype) {
        this.gtype = gtype;
        return this;
    }

    public String getSendtype() {
        return sendtype;
    }

    public GoodsCopy setSendtype(String sendtype) {
        this.sendtype = sendtype;
        return this;
    }

    public String getGshipper() {
        return gshipper;
    }

    public GoodsCopy setGshipper(String gshipper) {
        this.gshipper = gshipper;
        return this;
    }

    public Integer getGsales() {
        return gsales;
    }

    public GoodsCopy setGsales(Integer gsales) {
        this.gsales = gsales;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public GoodsCopy setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "GoodsCopy{" +
        "id=" + id +
        ", gname=" + gname +
        ", price=" + price +
        ", gtype=" + gtype +
        ", sendtype=" + sendtype +
        ", gshipper=" + gshipper +
        ", gsales=" + gsales +
        ", description=" + description +
        "}";
    }
}
