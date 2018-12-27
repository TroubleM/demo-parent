package tm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tm.request.DuibaAdRequest;
import tm.response.DuibaAdPageResponse;
import tm.service.IDuibaAdService;

/**
 * @auther: zhangyi
 * @date: 2018/10/26
 * @Description: 对啊帮广告控制层
 */
@RestController
@RequestMapping("ad")
public class DuibaAdController {

    @Autowired
    private IDuibaAdService duibaAdService;


    /**
     * @Author zhangyi
     * @Description:
     * @Date 2018/10/26
     * @Param [duibaAdRequest]
     * @return tm.response.DuibaAdPageResponse
     **/
    @GetMapping("findDuibaAdList")
    public DuibaAdPageResponse findDuibaAdList(DuibaAdRequest duibaAdRequest) {
        return duibaAdService.findDuibaAdList(duibaAdRequest);
    }

}
