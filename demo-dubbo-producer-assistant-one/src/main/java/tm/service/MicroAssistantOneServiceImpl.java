package tm.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tm.dao.DuibaAdMapper;
import tm.entity.DuibaAd;
import tm.request.MicroServiceRequest;
import tm.response.MicroServiceResponse;

import java.util.Date;

@Component("microAssistantOneService")
@Service(timeout = 5000,version = "1.0.0",interfaceClass = MicroAssistantOneService.class)
public class MicroAssistantOneServiceImpl implements MicroAssistantOneService{


    private static final Logger logger = LoggerFactory.getLogger(MicroAssistantOneServiceImpl.class);

    @Autowired
    private DuibaAdMapper duibaAdMapper;

    @Override
    public MicroServiceResponse execute(MicroServiceRequest microServiceRequest) {

        //处理请求参数
        logger.info("用户名:" + microServiceRequest.getUserName());
        logger.info("密码:" + microServiceRequest.getPassword());

        //模拟数据库持久化操作
        DuibaAd duibaAd = new DuibaAd();
        duibaAd.setAdImgUrl("11111");
        duibaAd.setAdLink("22222");
        duibaAd.setAdType(33333);
        duibaAd.setCodeId("44444");
        duibaAd.setCreateTime(new Date());
        duibaAd.setCreator(55555);
        duibaAd.setSlogan("66666");
        duibaAd.setStatus(77777);
        duibaAd.setTerminal(88888);
        duibaAd.setAdId("99999");
        duibaAdMapper.insert(duibaAd);

        //封装返回参数
        MicroServiceResponse microServiceResponse = new MicroServiceResponse();

        microServiceResponse.setName("微服务返回对象副手");
        microServiceResponse.setVersion("1.0.0");

        return microServiceResponse;
    }
}
