package com.example.demo.thread;

public class Resource2 {

    private String name;

    public String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }
}
