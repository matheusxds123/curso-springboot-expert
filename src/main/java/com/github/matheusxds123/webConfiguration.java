package com.github.matheusxds123;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class webConfiguration {

    @Bean(name = "applicationName")
    public String applicationName(){
        return "Sistema Web";
    }
}
