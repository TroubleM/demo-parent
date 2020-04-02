package tm.service;

import tm.request.MicroServiceRequest;
import tm.response.MicroServiceResponse;

/**
 * @auther: zhangyi
 * @date: 2018/12/27
 * @Description: 生产者
 */
public interface MicroService {

    /**
     * @Author zhangyi
     * @Description: 微服务定义执行接口方法
     * @Date  2018/12/27
     * @Param [microServiceRequest]
     * @return tm.response.MicroServiceResponse
     **/
    MicroServiceResponse execute(MicroServiceRequest microServiceRequest);

    MicroServiceResponse testOne(Object object);

}
