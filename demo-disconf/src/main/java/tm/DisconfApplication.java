package tm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:disconf.xml"})//引入disconf
public class DisconfApplication {

    public static void main(String[] args) {

        SpringApplication.run(DisconfApplication.class, args);
        System.out.println("success");
    }

}
