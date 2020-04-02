package tm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by wenjl on 2015/8/5.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"tm.disconf"})
@PropertySource({"classpath:application.properties"})
@ImportResource({"classpath:disconf.xml"})//引入disconf
public class DisconfApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(DisconfApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

        return application.sources(DisconfApplication.class);
    }

}
