package rasmus.deletelater;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication
public class DeleteLaterApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeleteLaterApplication.class, args);
    }

}
