package com.jim.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by qiao on 15/7/6.
 */
@Component
public class Bean {
    @Value("${spring.application.name}")
    private String name;
    @Value("${spring.datasource.driverClassName}")
    private String driverClassName;
    @Value("${spring.datasource.url}")
    private String url;
    @Value("${server.port}")
    private String serverPort;

    @Override
    public String toString() {
        return "Bean{" +
                "name='" + name + '\'' +
                ", driverClassName='" + driverClassName + '\'' +
                ", url='" + url + '\'' +
                ", serverPort=" + serverPort +
                '}';
    }
}
