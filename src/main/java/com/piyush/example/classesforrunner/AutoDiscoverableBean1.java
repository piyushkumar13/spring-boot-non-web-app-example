package com.piyush.example.classesforrunner;

import org.springframework.stereotype.Component;

/**
 * @author Piyush Kumar.
 * @since 11/3/18.
 */
@Component
public class AutoDiscoverableBean1 {

    private String name = "Piyush Kumar in bean 1";
    private String address = "Bangalore";

    public String getName() {
        return name;
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
