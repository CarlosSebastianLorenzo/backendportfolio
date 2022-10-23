package com.PortfolioCSL.PortfolioV2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class PortfolioV2Application {

    public static void main(String[] args) {
        SpringApplication.run(PortfolioV2Application.class, args);
    }

     @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("http://localhost:4200/").allowedMethods("*").allowedHeaders("*");
           }
        };
     }
    
    //@Configuration
    //@EnableWebMvc
    //public class WebConfig implements WebMvcConfigurer {
//
       // @Override
       // public void addCorsMappings(CorsRegistry registry) {
    //       registry.addMapping("/**").allowedOrigins("*").allowedMethods("*");
     //   }
    //}

}
