package com.commute.apigateway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.discovery.PatternServiceRouteMapper;
import org.springframework.context.annotation.Bean;

@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class ApiGatewayApp {
  public static void main(String[] args) {
    SpringApplication.run(ApiGatewayApp.class, args);
  }
  @Bean
  public PatternServiceRouteMapper patternServiceRouteMapper() {
    return new PatternServiceRouteMapper("commute-(?<service>.*)", "${service}");
  }
}
