package tm.disconf.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baidu.disconf.client.common.annotations.DisconfUpdateService;
import com.baidu.disconf.client.common.update.IDisconfUpdate;

import tm.disconf.config.SimpleConfig;


/**
 * 更新配置时的回调函数
 */
@Service
@DisconfUpdateService(classes = { SimpleConfig.class})
public class SimpleDemoServiceUpdateCallback implements IDisconfUpdate {

    protected static final Logger LOGGER = LoggerFactory
            .getLogger(SimpleDemoServiceUpdateCallback.class);

    @Autowired
    private SimpleDemoService simpleDemoService;

    public void reload() throws Exception {
        simpleDemoService.changeConfig();
    }

}