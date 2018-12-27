package tm.vo;

import java.util.Date;

/**
 * @auther: zhangyi
 * @date: 2018/10/26
 * @Description: 广告信息扩展类
 */
public class DuibaAdVo {

    /**
     * @auther: zhangyi
     * @date: 2018/10/26
     * @Description: 广告id
     */
    private Integer id;

    /**
     * @auther: zhangyi
     * @date: 2018/10/26
     * @Description: 广告位id
     */
    private String adId;

    /**
     * @auther: zhangyi
     * @date: 2018/10/26
     * @Description: 广告创建时间
     */
    private Date createTime;

    /**
     * @auther: zhangyi
     * @date: 2018/10/26
     * @Description: 广告图片链接地址
     */
    private String adImgUrl;

    /**
     * @auther: zhangyi
     * @date: 2018/10/26
     * @Description: 广告链接地址
     */
    private String adLink;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdId() {
        return adId;
    }

    public void setAdId(String adId) {
        this.adId = adId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getAdImgUrl() {
        return adImgUrl;
    }

    public void setAdImgUrl(String adImgUrl) {
        this.adImgUrl = adImgUrl;
    }

    public String getAdLink() {
        return adLink;
    }

    public void setAdLink(String adLink) {
        this.adLink = adLink;
    }
}
