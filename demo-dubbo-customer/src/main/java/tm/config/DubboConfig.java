package tm.config;

import org.springframework.context.annotation.Bean;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;

//@Configuration
public class DubboConfig {


    @Bean
    public RegistryConfig registry() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("localhost:2181");
        registryConfig.setProtocol("zookeeper");
        return registryConfig;
    }

    @Bean
    public ApplicationConfig application() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("demo-dubbox-customer");
        return applicationConfig;
    }

    @Bean
    public ProtocolConfig protocol() {
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setPort(20882);
        return protocolConfig;
    }
}
