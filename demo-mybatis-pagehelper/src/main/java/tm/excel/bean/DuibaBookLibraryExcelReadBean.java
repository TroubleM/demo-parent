package tm.excel.bean;

import com.tm.excel.annotation.ExcelColumn;
import com.tm.excel.annotation.ExcelReadBean;
import com.tm.excel.base.BaseReadExcel;

/**
 * @auther: zhangyi
 * @date: 2019/1/4
 * @Description: excel读取数据封装对象
 */
@ExcelReadBean
public class DuibaBookLibraryExcelReadBean implements BaseReadExcel {
    	//出版社	出版日期	作者	isbn编码	图片地址

    @ExcelColumn(name = "书名")
    private String name;

    @ExcelColumn(name = "出版社")
    private String publisher;

    @ExcelColumn(name = "出版日期")
    private String publishDate;

    @ExcelColumn(name = "作者")
    private String author;

    @ExcelColumn(name = "isbn编码")
    private String isbnCode;

    @ExcelColumn(name = "图片地址")
    private String bgPicUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbnCode() {
        return isbnCode;
    }

    public void setIsbnCode(String isbnCode) {
        this.isbnCode = isbnCode;
    }

    public String getBgPicUrl() {
        return bgPicUrl;
    }

    public void setBgPicUrl(String bgPicUrl) {
        this.bgPicUrl = bgPicUrl;
    }

    @Override
    public String toString() {
        return "DuibaBookLibraryExcelReadBean{" +
                "name='" + name + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publishDate='" + publishDate + '\'' +
                ", author='" + author + '\'' +
                ", isbnCode='" + isbnCode + '\'' +
                ", bgPicUrl='" + bgPicUrl + '\'' +
                '}';
    }
}

