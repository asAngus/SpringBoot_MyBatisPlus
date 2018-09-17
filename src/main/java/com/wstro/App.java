package com.wstro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * SpringBoot
 *
 * @author weipeng
 * @Email weipeng@symdata.cn
 */
@ServletComponentScan
@SpringBootApplication(scanBasePackages = {"com.wstro"})
public class App extends SpringBootServletInitializer {

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
//        SpringApplication.setBannerMode(Mode.CONSOLE);
        SpringApplication.run(App.class, args);
    }

    /**
     * 部署Tomcat
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(App.class);
    }

}
