package tm.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import tm.request.MicroServiceRequest;
import tm.response.MicroServiceResponse;

/**
 * @auther: zhangyi
 * @date: 2018/12/27
 * @Description: 微服务实际实现层
 */
@Component("microService")
@Service(timeout = 5000,version = "1.0.0",interfaceClass = MicroService.class)
public class MicroServiceImpl implements MicroService {

    private static final Logger logger = LoggerFactory.getLogger(MicroServiceImpl.class);

    /*@Autowired
    private DuibaAdMapper duibaAdMapper;*/

    @Override
    public MicroServiceResponse execute(MicroServiceRequest microServiceRequest) {

        //处理请求参数
        logger.info("用户名:" + microServiceRequest.getUserName());
        logger.info("密码:" + microServiceRequest.getPassword());

        //模拟数据库持久化操作
        /*DuibaAd duibaAd = new DuibaAd();
        duibaAd.setAdImgUrl("1111");
        duibaAd.setAdLink("2222");
        duibaAd.setAdType(3333);
        duibaAd.setCodeId("4444");
        duibaAd.setCreateTime(new Date());
        duibaAd.setCreator(5555);
        duibaAd.setSlogan("6666");
        duibaAd.setStatus(7777);
        duibaAd.setTerminal(8888);
        duibaAd.setAdId("9999");
        duibaAdMapper.insert(duibaAd);*/

        //封装返回参数
        MicroServiceResponse microServiceResponse = new MicroServiceResponse();

        microServiceResponse.setName("微服务返回对象");
        microServiceResponse.setVersion("1.0.0");

        return microServiceResponse;
    }
}
