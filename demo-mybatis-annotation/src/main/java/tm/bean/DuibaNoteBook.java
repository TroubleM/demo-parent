package tm.bean;

import java.util.Date;

public class DuibaNoteBook {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 图书名称
     */
    private String name;

    /**
     * 背景图片地址
     */
    private String bgPicUrl;

    /**
     * 图书创建类型：0扫描生成；1自定义生成
     */
    private Integer type;

    /**
     * 出版方
     */
    private String publisher;

    /**
     * 出版日期
     */
    private String publishDate;

    /**
     * 作者
     */
    private String author;

    /**
     * 笔记总页数
     */
    private Integer noteTotalPage;

    /**
     * 创建人
     */
    private Long creatorId;

    /**
     * 图书创建时间
     */
    private Date createTime;

    /**
     * 图书更新时间
     */
    private Date updateTime;

    /**
     * 图书库图书id
     */
    private Long bookLibBid;

    /**
     * app类型，4 会计帮 ，5教书帮 ，25金融帮
     */
    private Integer appType;

    /**
     * 0表示未加入索引，1表示已加入索引
     */
    private Integer esIndex;

    /**
     * 主键id
     * @return id 主键id
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键id
     * @param id 主键id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 图书名称
     * @return name 图书名称
     */
    public String getName() {
        return name;
    }

    /**
     * 图书名称
     * @param name 图书名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 背景图片地址
     * @return bg_pic_url 背景图片地址
     */
    public String getBgPicUrl() {
        return bgPicUrl;
    }

    /**
     * 背景图片地址
     * @param bgPicUrl 背景图片地址
     */
    public void setBgPicUrl(String bgPicUrl) {
        this.bgPicUrl = bgPicUrl == null ? null : bgPicUrl.trim();
    }

    /**
     * 图书创建类型：0扫描生成；1自定义生成
     * @return type 图书创建类型：0扫描生成；1自定义生成
     */
    public Integer getType() {
        return type;
    }

    /**
     * 图书创建类型：0扫描生成；1自定义生成
     * @param type 图书创建类型：0扫描生成；1自定义生成
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 出版方
     * @return publisher 出版方
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * 出版方
     * @param publisher 出版方
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    /**
     * 出版日期
     * @return publish_date 出版日期
     */
    public String getPublishDate() {
        return publishDate;
    }

    /**
     * 出版日期
     * @param publishDate 出版日期
     */
    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate == null ? null : publishDate.trim();
    }

    /**
     * 作者
     * @return author 作者
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 作者
     * @param author 作者
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * 笔记总页数
     * @return note_total_page 笔记总页数
     */
    public Integer getNoteTotalPage() {
        return noteTotalPage;
    }

    /**
     * 笔记总页数
     * @param noteTotalPage 笔记总页数
     */
    public void setNoteTotalPage(Integer noteTotalPage) {
        this.noteTotalPage = noteTotalPage;
    }

    /**
     * 创建人
     * @return creator_id 创建人
     */
    public Long getCreatorId() {
        return creatorId;
    }

    /**
     * 创建人
     * @param creatorId 创建人
     */
    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * 图书创建时间
     * @return create_time 图书创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 图书创建时间
     * @param createTime 图书创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 图书更新时间
     * @return update_time 图书更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 图书更新时间
     * @param updateTime 图书更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 图书库图书id
     * @return book_lib_bid 图书库图书id
     */
    public Long getBookLibBid() {
        return bookLibBid;
    }

    /**
     * 图书库图书id
     * @param bookLibBid 图书库图书id
     */
    public void setBookLibBid(Long bookLibBid) {
        this.bookLibBid = bookLibBid;
    }

    /**
     * app类型，4 会计帮 ，5教书帮 ，25金融帮
     * @return app_type app类型，4 会计帮 ，5教书帮 ，25金融帮
     */
    public Integer getAppType() {
        return appType;
    }

    /**
     * app类型，4 会计帮 ，5教书帮 ，25金融帮
     * @param appType app类型，4 会计帮 ，5教书帮 ，25金融帮
     */
    public void setAppType(Integer appType) {
        this.appType = appType;
    }

    /**
     * 0表示未加入索引，1表示已加入索引
     * @return es_index 0表示未加入索引，1表示已加入索引
     */
    public Integer getEsIndex() {
        return esIndex;
    }

    /**
     * 0表示未加入索引，1表示已加入索引
     * @param esIndex 0表示未加入索引，1表示已加入索引
     */
    public void setEsIndex(Integer esIndex) {
        this.esIndex = esIndex;
    }
}