package tm.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.AnnotationBean;

import tm.exception.DubboConfigException;


//注解配置拓展性调研不足，先不推荐
@Configuration
public class DubboConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(DubboConfig.class);

    /**
     * @auther: zhangyi
     * @date: 2019/4/16
     * @Description: 原生properties对象
     */
    private Properties properties;

    /**
     * @auther: zhangyi
     * @date: 2019/4/16
     * @Description: 是否已加载properties文件
     */
    private Boolean isLoadProperties = false;

    /**
     * @Author zhangyi
     * @Description: 根据key获取对应配置
     * @Date  2019/4/16
     * @Param [key]
     * @return java.lang.String
     **/
    public String getParameterByKey(String key){
        if(!isLoadProperties){
            InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("application.properties");
            properties = new Properties();
            try {
                properties.load(inputStream);
            }catch (IOException e){
                LOGGER.error("解析文件：application.properties发生错误,{}",e);
            }
            isLoadProperties = true;
        }
        Object object = properties.get(key);
        if(null == object){
            throw new DubboConfigException("配置：" + key + " 配置内容为空");
        }
        return object.toString();
    }

    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName(this.getParameterByKey("spring.application.name"));
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig1() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress(this.getParameterByKey("dubbo.registry.address1"));
        return registryConfig;
    }

    @Bean
    public RegistryConfig registryConfig2() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress(this.getParameterByKey("dubbo.registry.address2"));
        return registryConfig;
    }

    @Bean
    public AnnotationBean annotationBean(){
        AnnotationBean annotationBean = new AnnotationBean();
        annotationBean.setPackage(this.getParameterByKey("dubbo.service.package"));
        return annotationBean;
    }

}
