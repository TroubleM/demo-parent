package tm.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.AnnotationBean;


//注解配置拓展性调研不足，先不推荐
//@Configuration
//@ConfigurationProperties
//@PropertySource(value = "config.properties")
public class DubboConfig {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${dubbo.registry.address1}")
    private String dubboRegistryAddress1;

    @Value("${dubbo.registry.address2}")
    private String dubboRegistryAddress2;

    @Value("${dubbo.service.package}")
    private String dubboServicePackage;

    @Bean
    public ApplicationConfig applicationConfig() {
        System.out.println("applicationName" + applicationName);
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName(applicationName);
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig1() {
        System.out.println("dubboRegistryAddress1" + dubboRegistryAddress1);
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress(dubboRegistryAddress1);
        return registryConfig;
    }

    @Bean
    public RegistryConfig registryConfig2() {
        System.out.println("dubboRegistryAddress2" + dubboRegistryAddress2);
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress(dubboRegistryAddress2);
        return registryConfig;
    }

    @Bean
    public AnnotationBean annotationBean() {
        System.out.println("dubboServicePackage" + dubboServicePackage);
        AnnotationBean annotationBean = new AnnotationBean();
        annotationBean.setPackage(dubboServicePackage);
        return annotationBean;
    }

}
