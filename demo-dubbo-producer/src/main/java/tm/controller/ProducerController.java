package tm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tm.request.MicroServiceRequest;
import tm.response.MicroServiceResponse;
import tm.service.MicroService;

/**
 * @auther: zhangyi
 * @date: 2018/12/27
 * @Description: 生产者自给自足控制层调用微服务层
 */
@RestController
@RequestMapping(value = "producer")
public class ProducerController {

    private static final Logger logger = LoggerFactory.getLogger(ProducerController.class);

    /*@Autowired
    private MicroService microService;

    *//**
     * @Author zhangyi
     * @Description: 非分布式微服务远程调用
     * @Date  2018/12/27
     * @Param [microServiceRequest]
     * @return tm.response.MicroServiceResponse
     **//*
    @GetMapping(value = "producerRequest")
    public MicroServiceResponse producerRequest(MicroServiceRequest microServiceRequest){
        try {
            logger.info("classType:{}",microService);
            return microService.execute(microServiceRequest);
        }catch (Exception e){
            logger.error("执行异常",e);
        }
        return null;
    }*/

}
