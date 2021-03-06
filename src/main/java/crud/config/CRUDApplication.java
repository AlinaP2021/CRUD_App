package crud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()
@ComponentScan("crud")
public class CRUDApplication {

    public static void main(String[] args) {
        SpringApplication.run(CRUDApplication.class, args);
    }
}
