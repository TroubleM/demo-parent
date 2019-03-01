package tm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations={"classpath:dubbo-storage-producer.xml","classpath:spring-db.xml"})
@MapperScan("tm.dao")
public class StorageProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StorageProducerApplication.class, args);
        System.out.println("success");
    }

}
