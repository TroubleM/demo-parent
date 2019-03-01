package tm.entity;

import java.util.Date;

public class DuibaAd {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 广告位ID
     */
    private String adId;

    /**
     * 广告显示终端 0 WEB 1 APP
     */
    private Integer terminal;

    /**
     * 广告栏位ID
     */
    private String codeId;

    /**
     * 编辑者ID
     */
    private Integer creator;

    /**
     * 编辑时间
     */
    private Date createTime;

    /**
     * 广告图片地址
     */
    private String adImgUrl;

    /**
     * 广告跳转地址
     */
    private String adLink;

    /**
     * 广告语
     */
    private String slogan;

    /**
     * 启用状态 0 未启用 1 启用
     */
    private Integer status;

    /**
     * 广告内容类型 0 随机配（url） 1 小能ID 2 普通帖子ID 3 商品 4分享帖ID
     */
    private Integer adType;

    /**
     * 主键
     * 
     * @return id 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     * 
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 广告位ID
     * 
     * @return ad_id 广告位ID
     */
    public String getAdId() {
        return adId;
    }

    /**
     * 广告位ID
     * 
     * @param adId 广告位ID
     */
    public void setAdId(String adId) {
        this.adId = adId == null ? null : adId.trim();
    }

    /**
     * 广告显示终端 0 WEB 1 APP
     * 
     * @return terminal 广告显示终端 0 WEB 1 APP
     */
    public Integer getTerminal() {
        return terminal;
    }

    /**
     * 广告显示终端 0 WEB 1 APP
     * 
     * @param terminal 广告显示终端 0 WEB 1 APP
     */
    public void setTerminal(Integer terminal) {
        this.terminal = terminal;
    }

    /**
     * 广告栏位ID
     * 
     * @return code_id 广告栏位ID
     */
    public String getCodeId() {
        return codeId;
    }

    /**
     * 广告栏位ID
     * 
     * @param codeId 广告栏位ID
     */
    public void setCodeId(String codeId) {
        this.codeId = codeId == null ? null : codeId.trim();
    }

    /**
     * 编辑者ID
     * 
     * @return creator 编辑者ID
     */
    public Integer getCreator() {
        return creator;
    }

    /**
     * 编辑者ID
     * 
     * @param creator 编辑者ID
     */
    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    /**
     * 编辑时间
     * 
     * @return create_time 编辑时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 编辑时间
     * 
     * @param createTime 编辑时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 广告图片地址
     * 
     * @return ad_img_url 广告图片地址
     */
    public String getAdImgUrl() {
        return adImgUrl;
    }

    /**
     * 广告图片地址
     * 
     * @param adImgUrl 广告图片地址
     */
    public void setAdImgUrl(String adImgUrl) {
        this.adImgUrl = adImgUrl == null ? null : adImgUrl.trim();
    }

    /**
     * 广告跳转地址
     * 
     * @return ad_link 广告跳转地址
     */
    public String getAdLink() {
        return adLink;
    }

    /**
     * 广告跳转地址
     * 
     * @param adLink 广告跳转地址
     */
    public void setAdLink(String adLink) {
        this.adLink = adLink == null ? null : adLink.trim();
    }

    /**
     * 广告语
     * 
     * @return slogan 广告语
     */
    public String getSlogan() {
        return slogan;
    }

    /**
     * 广告语
     * 
     * @param slogan 广告语
     */
    public void setSlogan(String slogan) {
        this.slogan = slogan == null ? null : slogan.trim();
    }

    /**
     * 启用状态 0 未启用 1 启用
     * 
     * @return status 启用状态 0 未启用 1 启用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 启用状态 0 未启用 1 启用
     * 
     * @param status 启用状态 0 未启用 1 启用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 广告内容类型 0 随机配（url） 1 小能ID 2 普通帖子ID 3 商品 4分享帖ID
     * 
     * @return ad_type 广告内容类型 0 随机配（url） 1 小能ID 2 普通帖子ID 3 商品 4分享帖ID
     */
    public Integer getAdType() {
        return adType;
    }

    /**
     * 广告内容类型 0 随机配（url） 1 小能ID 2 普通帖子ID 3 商品 4分享帖ID
     * 
     * @param adType 广告内容类型 0 随机配（url） 1 小能ID 2 普通帖子ID 3 商品 4分享帖ID
     */
    public void setAdType(Integer adType) {
        this.adType = adType;
    }
}
