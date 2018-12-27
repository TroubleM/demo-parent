package tm.config;

import org.springframework.context.annotation.Bean;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.AnnotationBean;

//@Configuration
public class DubboConfig {

    @Bean
    public AnnotationBean annotation() {
        AnnotationBean bean = new AnnotationBean();
        bean.setPackage("tm.service");
        return bean;
    }

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
        applicationConfig.setName("demo-dubbox-producer");
        return applicationConfig;
    }

    @Bean
    public ProtocolConfig protocol() {
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setPort(20881);
        return protocolConfig;
    }
}
