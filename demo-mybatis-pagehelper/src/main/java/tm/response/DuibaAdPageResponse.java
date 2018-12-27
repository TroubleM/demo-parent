package tm.response;

import tm.vo.DuibaAdVo;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @auther: zhangyi
 * @date: 2018/10/26
 * @Description: 此处应存在一个公共的分页返回对象
 */
public class DuibaAdPageResponse implements Serializable {

    private static final long serialVersionUID = 7906199345246924845L;

    /**
     * @auther: zhangyi
     * @date: 2018/10/26
     * @Description: 每页条数
     */
    private Integer pageSize;

    /**
     * @auther: zhangyi
     * @date: 2018/10/26
     * @Description: 当前页码
     */
    private Integer pageNum;

    /**
     * @auther: zhangyi
     * @date: 2018/10/26
     * @Description: 数据总量
     */
    private Long total;

    /**
     * @auther: zhangyi
     * @date: 2018/10/26
     * @Description: 总页数
     */
    private Integer pages;

    /**
     * @auther: zhangyi
     * @date: 2018/10/26
     * @Description: 广告返回对象列表
     */
    private List<DuibaAdResponse> duibaAdResponses;

    /**
     * @auther: zhangyi
     * @date: 2018/10/31
     * @Description: 广告Vo对象列表
     */
    private List<DuibaAdVo> duibaAdVos;

    /**
     * @auther: zhangyi
     * @date: 2018/10/31
     * @Description: 广告事例List转枚举Map对象
     */
    private Map<Integer, Integer> duibaAdEnumMap;

    public Map<Integer, Integer> getDuibaAdEnumMap() {
        return duibaAdEnumMap;
    }

    public void setDuibaAdEnumMap(Map<Integer, Integer> duibaAdEnumMap) {
        this.duibaAdEnumMap = duibaAdEnumMap;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public List<DuibaAdResponse> getDuibaAdResponses() {
        return duibaAdResponses;
    }

    public void setDuibaAdResponses(List<DuibaAdResponse> duibaAdResponses) {
        this.duibaAdResponses = duibaAdResponses;
    }

    public List<DuibaAdVo> getDuibaAdVos() {
        return duibaAdVos;
    }

    public void setDuibaAdVos(List<DuibaAdVo> duibaAdVos) {
        this.duibaAdVos = duibaAdVos;
    }
}
