package tm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@MapperScan("tm.dao")
//@ImportResource(locations = {"classpath:dubbo-producer.xml"})
public class PageHelperApplication {

    public static void main(String[] args) {
        SpringApplication.run(PageHelperApplication.class, args);
        System.out.println("success");
    }

}
