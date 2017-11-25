package com.wanq.springboot.async;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.concurrent.Future;

@SpringBootApplication
@EnableAsync
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        try {
            Task task = new Task();
            Future<String> future = task.doTaskOne();
            future.cancel(true);
            task.doTaskTwo();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
