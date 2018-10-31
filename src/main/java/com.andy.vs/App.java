package com.andy.vs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.andy.vs.dao")
public class App {
    public static void main (String [] args){
        SpringApplication.run(App.class,args);
    }
}
