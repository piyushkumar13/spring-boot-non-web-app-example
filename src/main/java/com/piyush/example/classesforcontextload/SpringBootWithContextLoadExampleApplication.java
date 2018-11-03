package com.piyush.example.classesforcontextload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Piyush Kumar.
 * @since 11/3/18.
 */
@SpringBootApplication
public class SpringBootWithContextLoadExampleApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootWithContextLoadExampleApplication.class, args);


        AutoDiscoverableBean1 bean1 = context.getBean(AutoDiscoverableBean1.class);
        AutoDiscoverableBean2 bean2 = context.getBean(AutoDiscoverableBean2.class);

        System.out.println("Running non-web application using simply loading context.");

        System.out.println("The bean1 is :: " + bean1.getName());
        System.out.println("The bean2 is ::: " + bean2.getName());
    }

}


