package tm.disconf.config;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baidu.disconf.client.DisconfMgrBean;
import com.baidu.disconf.client.DisconfMgrBeanSecond;
import com.baidu.disconf.client.addons.properties.ReloadablePropertiesFactoryBean;
import com.baidu.disconf.client.addons.properties.ReloadingPropertyPlaceholderConfigurer;

/**
 * @auther: zhangyi
 * @date: 2019/6/11
 * @Description: disconf配置类
 */
//@Configuration
public class DisconfConfig {

    @Bean(destroyMethod = "destroy")
    @AutoConfigureOrder
    public DisconfMgrBean disconfMgrBean(){
        DisconfMgrBean disconfMgrBean = new DisconfMgrBean();
        disconfMgrBean.setScanPackage("com.joker");
        return disconfMgrBean;
    }

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public DisconfMgrBeanSecond disconfMgrBeanSecond(){
        return new DisconfMgrBeanSecond();
    }

    @Bean("propertiesFactoryBean")
    public ReloadablePropertiesFactoryBean reloadablePropertiesFactoryBean(){
        ReloadablePropertiesFactoryBean reloadablePropertiesFactoryBean = new ReloadablePropertiesFactoryBean();
        List<String> locations = new ArrayList<>();
        locations.add("disconf-demo-application.properties");
        reloadablePropertiesFactoryBean.setLocations(locations);
        return reloadablePropertiesFactoryBean;
    }

    @Bean("propertyPlaceholderConfigurer")
    public ReloadingPropertyPlaceholderConfigurer reloadingPropertyPlaceholderConfigurer(@Qualifier("propertiesFactoryBean") ReloadablePropertiesFactoryBean reloadablePropertiesFactoryBean){
        ReloadingPropertyPlaceholderConfigurer reloadingPropertyPlaceholderConfigurer = new ReloadingPropertyPlaceholderConfigurer();
        reloadingPropertyPlaceholderConfigurer.setIgnoreResourceNotFound(true);
        reloadingPropertyPlaceholderConfigurer.setIgnoreUnresolvablePlaceholders(true);
        try {
            reloadingPropertyPlaceholderConfigurer.setProperties(reloadablePropertiesFactoryBean.getObject());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return reloadingPropertyPlaceholderConfigurer;
    }

}
