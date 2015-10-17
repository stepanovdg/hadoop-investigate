package org.stepanovdg.yammer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ImportResource;

/**
 * User: Stepanov Dmitriy
 * Date: 16.10.2015
 * Time: 22:50
 */
@SpringBootApplication
@EnableDiscoveryClient
@ImportResource({"classpath*:yammer-service.xml"})
public class YammerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(YammerServiceApplication.class, args);
      }
}
