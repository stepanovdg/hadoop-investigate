package org.stepanovdg.twitter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * User: Stepanov Dmitriy
 * Date: 16.10.2015
 * Time: 22:50
 */
@SpringBootApplication
//@EnableDiscoveryClient
@ImportResource({"classpath*:twitter-service.xml"})
public class TwitterServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TwitterServiceApplication.class, args);
      }
}
