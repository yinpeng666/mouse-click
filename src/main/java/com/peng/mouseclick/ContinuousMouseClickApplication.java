package com.peng.mouseclick;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ContinuousMouseClickApplication {

    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(ContinuousMouseClickApplication.class);
        //SpringApplication.run(SystemctlApplication.class, args);
        builder.headless(false)
                // .web(WebApplicationType.NONE)
                // .bannerMode(Banner.Mode.OFF)
                .run(args);
    }

}
