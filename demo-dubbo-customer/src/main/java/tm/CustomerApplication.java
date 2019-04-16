package tm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//dubbo注解配置拓展性调研不足，故采用xml配置
@SpringBootApplication
/*@ImportResource(locations={"classpath:dubbo-customer-bak.xml"})*/
public class CustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
        System.out.println("success");
    }

}
