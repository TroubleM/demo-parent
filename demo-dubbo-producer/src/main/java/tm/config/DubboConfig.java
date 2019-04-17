/*
package tm.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.AnnotationBean;

*/
/**
 * @auther: zhangyi
 * @date: 2019/4/17
 * @Description: 公共Dubbo服务相关配置类
 *//*

@Configuration
public class DubboConfig {

    */
/**
     * @Author zhangyi
     * @Description: 服务应用名，详细配置见ApplicationConfig类
     * @Date  2019/4/17
     * @return com.alibaba.dubbo.config.ApplicationConfig
     **//*

    @Bean
    @ConfigurationProperties(prefix="spring.application")
    public ApplicationConfig applicationConfig() {
        System.out.println("生产者内部自定义dubbo配置");
        ApplicationConfig applicationConfig = new ApplicationConfig();
        return applicationConfig;
    }

    */
/**
     * @Author zhangyi
     * @Description: 服务注册类型，注册中心地址，详细配置见RegistryConfig类
     * @Date  2019/4/17
     * @return com.alibaba.dubbo.config.RegistryConfig
     **//*

    @Bean
    @ConfigurationProperties(prefix="spring.dubbo.registry")
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        return registryConfig;
    }

    */
/**
     * @Author zhangyi
     * @Description: 服务协议配置，详细配置见ProtocolConfig类
     * @Date  2019/4/17
     * @return com.alibaba.dubbo.config.ProtocolConfig
     **//*

    @Bean
    @ConfigurationProperties(prefix="spring.dubbo.protocol")
    public ProtocolConfig protocolConfig() {
        ProtocolConfig protocolConfig = new ProtocolConfig();
        return protocolConfig;
    }

    */
/**
     * @Author zhangyi
     * @Description: 服务注解扫描包，详细配置见AnnotationBean类
     * @Date  2019/4/17
     * @return com.alibaba.dubbo.config.spring.AnnotationBean
     **//*

    @Bean
    @ConfigurationProperties(prefix="spring.dubbo.annotation")
    public AnnotationBean annotationBean() {
        AnnotationBean annotationBean = new AnnotationBean();
        return annotationBean;
    }

}
*/
