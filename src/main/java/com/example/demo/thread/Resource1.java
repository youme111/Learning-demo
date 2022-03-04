package com.example.demo.thread;

public class Resource1 {

    private String name;

    public String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }
}
