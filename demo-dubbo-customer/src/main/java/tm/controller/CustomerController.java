package tm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tm.request.MicroServiceRequest;
import tm.response.MicroServiceResponse;
import tm.service.DuibaAdProducer;
import tm.service.MicroService;


/**
 * @auther: zhangyi
 * @date: 2018/12/27
 * @Description: 消费者控制层
 */
@RestController
@RequestMapping(value = "customer")
public class CustomerController {

    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private MicroService microService;

/*    @Autowired
    private DuibaAdProducer duibaAdProducer;*/

    /**
     * @Author zhangyi
     * @Description: 分布式微服务远程调用
     * @Date  2018/12/27
     * @Param [microServiceRequest]
     * @return tm.response.MicroServiceResponse
     **/
    @GetMapping(value = "customerRequest")
    public MicroServiceResponse customerRequest(MicroServiceRequest microServiceRequest){
        try {
            logger.info("classType:{}",microService);
/*            logger.info("findDuibaAdList:{}",duibaAdProducer.findDuibaAdList());*/
            return microService.execute(microServiceRequest);
        }catch (Exception e){
            logger.error("异常",e);
        }
        return null;
    }

}
