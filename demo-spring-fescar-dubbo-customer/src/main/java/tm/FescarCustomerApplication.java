package tm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations={"classpath:dubbo-customer.xml"})
public class FescarCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FescarCustomerApplication.class, args);
        System.out.println("success");
    }

}
