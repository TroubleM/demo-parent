package tm.request;

/**
 * @auther: zhangyi
 * @date: 2018/10/26
 * @Description: 对啊帮广告web请求参数对象
 */
public class DuibaAdRequest {

    /**
     * @auther: zhangyi
     * @date: 2018/10/26
     * @Description: 广告位显示终端，0、web；1、app
     */
    private Integer terminal;

    /**
     * @auther: zhangyi
     * @date: 2018/10/31
     * @Description: 页码
     */
    private Integer pageNum;

    /**
     * @auther: zhangyi
     * @date: 2018/10/31
     * @Description: 每页条数
     */
    private Integer pageSize;

    public Integer getTerminal() {
        return terminal;
    }

    public void setTerminal(Integer terminal) {
        this.terminal = terminal;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
