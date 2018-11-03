package com.piyush.example.classesforcontextload;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Piyush Kumar.
 * @since 11/3/18.
 */
@Component
public class AutoDiscoverableBean2 {

    private String name = "Piyush Kumar in Bean 2";
    private String address = "Bangalore-Bean2";

    @Autowired
    private AutoDiscoverableBean1 autoDiscoverableBean1;

    public String getName() {
        return autoDiscoverableBean1.getName() + name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
