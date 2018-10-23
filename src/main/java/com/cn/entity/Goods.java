package com.cn.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author xun.guo123
 * @since 2018-09-23
 */
public class Goods extends Model<Goods> {

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

    public Goods setId(String id) {
        this.id = id;
        return this;
    }

    public String getGname() {
        return gname;
    }

    public Goods setGname(String gname) {
        this.gname = gname;
        return this;
    }

    public Float getPrice() {
        return price;
    }

    public Goods setPrice(Float price) {
        this.price = price;
        return this;
    }

    public String getGtype() {
        return gtype;
    }

    public Goods setGtype(String gtype) {
        this.gtype = gtype;
        return this;
    }

    public String getSendtype() {
        return sendtype;
    }

    public Goods setSendtype(String sendtype) {
        this.sendtype = sendtype;
        return this;
    }

    public String getGshipper() {
        return gshipper;
    }

    public Goods setGshipper(String gshipper) {
        this.gshipper = gshipper;
        return this;
    }

    public Integer getGsales() {
        return gsales;
    }

    public Goods setGsales(Integer gsales) {
        this.gsales = gsales;
        return this;
    }

    public String getBrandID() {
        return brandID;
    }

    public Goods setBrandID(String brandID) {
        this.brandID = brandID;
        return this;
    }

    public String getSizeID() {
        return sizeID;
    }

    public Goods setSizeID(String sizeID) {
        this.sizeID = sizeID;
        return this;
    }

    public String getPixelsID() {
        return pixelsID;
    }

    public Goods setPixelsID(String pixelsID) {
        this.pixelsID = pixelsID;
        return this;
    }

    public String getNumcoresID() {
        return numcoresID;
    }

    public Goods setNumcoresID(String numcoresID) {
        this.numcoresID = numcoresID;
        return this;
    }

    public String getNetworktypeID() {
        return networktypeID;
    }

    public Goods setNetworktypeID(String networktypeID) {
        this.networktypeID = networktypeID;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Goods setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Goods{" +
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
