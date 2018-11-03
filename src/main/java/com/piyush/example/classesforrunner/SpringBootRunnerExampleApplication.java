package com.piyush.example.classesforrunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Piyush Kumar.
 * @since 11/3/18.
 */
@SpringBootApplication
public class SpringBootRunnerExampleApplication implements ApplicationRunner {


    @Autowired
    private AutoDiscoverableBean1 bean1;

    @Autowired
    private AutoDiscoverableBean2 bean2;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRunnerExampleApplication.class);
    }

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {

        System.out.println("Running non-web application using Application Runner.");
        System.out.println("The bean1 is :: " + bean1.getName());
        System.out.println("The bean2 is ::: " + bean2.getName());

    }
}
