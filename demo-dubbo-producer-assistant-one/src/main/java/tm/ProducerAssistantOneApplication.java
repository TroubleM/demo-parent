package tm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
/*@ImportResource(locations={"classpath:dubbo-produce-assistant-one.xml"})*/
@MapperScan("tm.dao")
public class ProducerAssistantOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProducerAssistantOneApplication.class, args);
        System.out.println("success");
    }

}
