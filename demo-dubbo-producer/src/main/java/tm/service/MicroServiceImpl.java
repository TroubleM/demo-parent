package tm.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import tm.request.MicroServiceRequest;
import tm.response.MicroServiceResponse;

/**
 * @auther: zhangyi
 * @date: 2018/12/27
 * @Description: 微服务实际实现层
 */
@Service("microService")
public class MicroServiceImpl implements MicroService {


    private static final Logger logger = LoggerFactory.getLogger(MicroServiceImpl.class);

    @Override
    public MicroServiceResponse execute(MicroServiceRequest microServiceRequest) {

        //处理请求参数
        logger.info("用户名:" + microServiceRequest.getUserName());
        logger.info("密码:" + microServiceRequest.getPassword());

        System.out.println("执行业务");

        //封装返回参数
        MicroServiceResponse microServiceResponse = new MicroServiceResponse();

        microServiceResponse.setName("微服务返回对象");
        microServiceResponse.setVersion("1.0.0");

        return microServiceResponse;
    }
}
