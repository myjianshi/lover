package edu.gyc.lover;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("edu.gyc.lover.dao")
@SpringBootApplication
public class LoverApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoverApplication.class, args);
    }

}
