package com.curso.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.curso.example.client.OrderServiceClient;

@Configuration
@ComponentScan({"com.curso.example.service", "com.curso.example.client", "com.curso.example.dao"})
public class AppRunnerImplicitConstructor {

    public static void main (String... strings) {
        AnnotationConfigApplicationContext context =
                            new AnnotationConfigApplicationContext(
                                                AppRunnerImplicitConstructor.class);
        OrderServiceClient bean = context.getBean(OrderServiceClient.class);
        bean.showPendingOrderDetails("100");
        bean.showPendingOrderDetails("200");
    }


}