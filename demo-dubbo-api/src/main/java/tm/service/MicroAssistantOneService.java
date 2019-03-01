package tm.service;

import tm.request.MicroServiceRequest;
import tm.response.MicroServiceResponse;

/**
 * @auther: zhangyi
 * @date: 2019/2/27
 * @Description: 生产者副手使用的service接口类
 */
public interface MicroAssistantOneService {

    /**
     * @Author zhangyi
     * @Description: 微服务定义执行接口方法
     * @Date  2018/12/27
     * @Param [microServiceRequest]
     * @return tm.response.MicroServiceResponse
     **/
    MicroServiceResponse execute(MicroServiceRequest microServiceRequest);

}
