package tm.service;

import tm.request.DuibaAdRequest;
import tm.response.DuibaAdPageResponse;

/**
 * @auther: zhangyi
 * @date: 2018/10/26
 * @Description: 对啊帮广告业务层
 */
public interface IDuibaAdService {

    /**
     * @Author zhangyi
     * @Description: 分页查找广告信息
     * @Date 2018/10/26
     * @Param [duibaAdQuery]
     * @return tm.response.DuibaAdPageResponse
     **/
    DuibaAdPageResponse findDuibaAdList(DuibaAdRequest duibaAdRequest);

}
