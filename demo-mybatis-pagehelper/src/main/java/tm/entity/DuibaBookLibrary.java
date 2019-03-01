package tm.entity;

public class DuibaBookLibrary {
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
     * 出版方
     */
    private String publisher;

    /**
     * 出版日期
     */
    private String publishDate;

    /**
     * 作者,多个以“,”隔开
     */
    private String author;

    /**
     * isbn码
     */
    private String isbnCode;

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
     * 作者,多个以“,”隔开
     * @return author 作者,多个以“,”隔开
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 作者,多个以“,”隔开
     * @param author 作者,多个以“,”隔开
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * isbn码
     * @return isbn_code isbn码
     */
    public String getIsbnCode() {
        return isbnCode;
    }

    /**
     * isbn码
     * @param isbnCode isbn码
     */
    public void setIsbnCode(String isbnCode) {
        this.isbnCode = isbnCode == null ? null : isbnCode.trim();
    }
}