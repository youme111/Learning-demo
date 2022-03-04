package com.example.demo.proxy;

public class TestProxy {
    public static void main(String[] args) {
        SmsService smsService = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
        smsService.send("jdk动态代理");

        SmsService smsServiceCglib = (SmsService) CglibProxyFactory.getProxy(SmsServiceImpl.class);
        smsServiceCglib.send("cglib动态代理");
    }
}
