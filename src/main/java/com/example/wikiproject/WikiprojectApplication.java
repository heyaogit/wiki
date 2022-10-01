package com.example.wikiproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

//@ComponentScan("com.example")
@SpringBootApplication
public class WikiprojectApplication {
    private static final Logger LOG= LoggerFactory.getLogger(WikiprojectApplication.class);

    public static void main(String[] args) {
        SpringApplication app=new SpringApplication(WikiprojectApplication.class);
        Environment env=app.run(args).getEnvironment();
        LOG.info("启动成功！");
        LOG.info("地址:\t http127.0.0.1:{}",env.getProperty("server.port") );
    }

}
