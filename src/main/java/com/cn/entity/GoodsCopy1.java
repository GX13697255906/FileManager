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
@TableName("goods_copy1")
public class GoodsCopy1 extends Model<GoodsCopy1> {

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
    private String brandID;
    private String sizeID;
    private String pixelsID;
    private String numcoresID;
    private String networktypeID;
    private String description;


    public String getId() {
        return id;
    }

    public GoodsCopy1 setId(String id) {
        this.id = id;
        return this;
    }

    public String getGname() {
        return gname;
    }

    public GoodsCopy1 setGname(String gname) {
        this.gname = gname;
        return this;
    }

    public Float getPrice() {
        return price;
    }

    public GoodsCopy1 setPrice(Float price) {
        this.price = price;
        return this;
    }

    public String getGtype() {
        return gtype;
    }

    public GoodsCopy1 setGtype(String gtype) {
        this.gtype = gtype;
        return this;
    }

    public String getSendtype() {
        return sendtype;
    }

    public GoodsCopy1 setSendtype(String sendtype) {
        this.sendtype = sendtype;
        return this;
    }

    public String getGshipper() {
        return gshipper;
    }

    public GoodsCopy1 setGshipper(String gshipper) {
        this.gshipper = gshipper;
        return this;
    }

    public Integer getGsales() {
        return gsales;
    }

    public GoodsCopy1 setGsales(Integer gsales) {
        this.gsales = gsales;
        return this;
    }

    public String getBrandID() {
        return brandID;
    }

    public GoodsCopy1 setBrandID(String brandID) {
        this.brandID = brandID;
        return this;
    }

    public String getSizeID() {
        return sizeID;
    }

    public GoodsCopy1 setSizeID(String sizeID) {
        this.sizeID = sizeID;
        return this;
    }

    public String getPixelsID() {
        return pixelsID;
    }

    public GoodsCopy1 setPixelsID(String pixelsID) {
        this.pixelsID = pixelsID;
        return this;
    }

    public String getNumcoresID() {
        return numcoresID;
    }

    public GoodsCopy1 setNumcoresID(String numcoresID) {
        this.numcoresID = numcoresID;
        return this;
    }

    public String getNetworktypeID() {
        return networktypeID;
    }

    public GoodsCopy1 setNetworktypeID(String networktypeID) {
        this.networktypeID = networktypeID;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public GoodsCopy1 setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "GoodsCopy1{" +
        "id=" + id +
        ", gname=" + gname +
        ", price=" + price +
        ", gtype=" + gtype +
        ", sendtype=" + sendtype +
        ", gshipper=" + gshipper +
        ", gsales=" + gsales +
        ", brandID=" + brandID +
        ", sizeID=" + sizeID +
        ", pixelsID=" + pixelsID +
        ", numcoresID=" + numcoresID +
        ", networktypeID=" + networktypeID +
        ", description=" + description +
        "}";
    }
}
