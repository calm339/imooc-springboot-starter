package com.imooc.pojo;

import javax.persistence.*;

public class Dishes {
    @Id
    private Integer id;

    /**
     * 餐品状态：0.供应 1.售罄 2.下架
     */
    private Integer state;

    /**
     * 菜品类别：特色，优惠
     */
    private String category;

    /**
     * 菜品名称
     */
    private String name;

    /**
     * 正常售价
     */
    @Column(name = "normalPrice")
    private String normalprice;

    /**
     *  优惠价格
     */
    @Column(name = "diccountPrice")
    private String diccountprice;

    /**
     * 成本价
     */
    @Column(name = "costPrice")
    private String costprice;

    /**
     * 菜品单位：份，串，斤
     */
    private String unit;

    /**
     * 是否需要称量：0.不需要 1.需要
     */
    @Column(name = "isWeighing")
    private Integer isweighing;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 辣度:0.不辣 1.微辣 2.中辣 3.重辣
     */
    private Integer pepper;

    /**
     * 菜品编号
     */
    @Column(name = "dishesNo")
    private String dishesno;

    /**
     * 图片
     */
    private String imgs;

    /**
     * 短视频
     */
    private String video;

    /**
     * 机构号
     */
    @Column(name = "organizationId")
    private Integer organizationid;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取餐品状态：0.供应 1.售罄 2.下架
     *
     * @return state - 餐品状态：0.供应 1.售罄 2.下架
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置餐品状态：0.供应 1.售罄 2.下架
     *
     * @param state 餐品状态：0.供应 1.售罄 2.下架
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取菜品类别：特色，优惠
     *
     * @return category - 菜品类别：特色，优惠
     */
    public String getCategory() {
        return category;
    }

    /**
     * 设置菜品类别：特色，优惠
     *
     * @param category 菜品类别：特色，优惠
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * 获取菜品名称
     *
     * @return name - 菜品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置菜品名称
     *
     * @param name 菜品名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取正常售价
     *
     * @return normalPrice - 正常售价
     */
    public String getNormalprice() {
        return normalprice;
    }

    /**
     * 设置正常售价
     *
     * @param normalprice 正常售价
     */
    public void setNormalprice(String normalprice) {
        this.normalprice = normalprice;
    }

    /**
     * 获取 优惠价格
     *
     * @return diccountPrice -  优惠价格
     */
    public String getDiccountprice() {
        return diccountprice;
    }

    /**
     * 设置 优惠价格
     *
     * @param diccountprice  优惠价格
     */
    public void setDiccountprice(String diccountprice) {
        this.diccountprice = diccountprice;
    }

    /**
     * 获取成本价
     *
     * @return costPrice - 成本价
     */
    public String getCostprice() {
        return costprice;
    }

    /**
     * 设置成本价
     *
     * @param costprice 成本价
     */
    public void setCostprice(String costprice) {
        this.costprice = costprice;
    }

    /**
     * 获取菜品单位：份，串，斤
     *
     * @return unit - 菜品单位：份，串，斤
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置菜品单位：份，串，斤
     *
     * @param unit 菜品单位：份，串，斤
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * 获取是否需要称量：0.不需要 1.需要
     *
     * @return isWeighing - 是否需要称量：0.不需要 1.需要
     */
    public Integer getIsweighing() {
        return isweighing;
    }

    /**
     * 设置是否需要称量：0.不需要 1.需要
     *
     * @param isweighing 是否需要称量：0.不需要 1.需要
     */
    public void setIsweighing(Integer isweighing) {
        this.isweighing = isweighing;
    }

    /**
     * 获取备注
     *
     * @return remarks - 备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注
     *
     * @param remarks 备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * 获取辣度:0.不辣 1.微辣 2.中辣 3.重辣
     *
     * @return pepper - 辣度:0.不辣 1.微辣 2.中辣 3.重辣
     */
    public Integer getPepper() {
        return pepper;
    }

    /**
     * 设置辣度:0.不辣 1.微辣 2.中辣 3.重辣
     *
     * @param pepper 辣度:0.不辣 1.微辣 2.中辣 3.重辣
     */
    public void setPepper(Integer pepper) {
        this.pepper = pepper;
    }

    /**
     * 获取菜品编号
     *
     * @return dishesNo - 菜品编号
     */
    public String getDishesno() {
        return dishesno;
    }

    /**
     * 设置菜品编号
     *
     * @param dishesno 菜品编号
     */
    public void setDishesno(String dishesno) {
        this.dishesno = dishesno;
    }

    /**
     * 获取图片
     *
     * @return imgs - 图片
     */
    public String getImgs() {
        return imgs;
    }

    /**
     * 设置图片
     *
     * @param imgs 图片
     */
    public void setImgs(String imgs) {
        this.imgs = imgs;
    }

    /**
     * 获取短视频
     *
     * @return video - 短视频
     */
    public String getVideo() {
        return video;
    }

    /**
     * 设置短视频
     *
     * @param video 短视频
     */
    public void setVideo(String video) {
        this.video = video;
    }

    /**
     * 获取机构号
     *
     * @return organizationId - 机构号
     */
    public Integer getOrganizationid() {
        return organizationid;
    }

    /**
     * 设置机构号
     *
     * @param organizationid 机构号
     */
    public void setOrganizationid(Integer organizationid) {
        this.organizationid = organizationid;
    }
}