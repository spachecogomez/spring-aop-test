package com.test.spring.aop;

import com.test.spring.aop.aspects.LogAspect;
import com.test.spring.aop.service.EchoService;
import com.test.spring.aop.service.EchoServiceImpl;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class Config {

  @Bean
  public LogAspect logAspect(){
    return new LogAspect();
  }

  @Bean
  public EchoService echoService(){
    return new EchoServiceImpl();
  }

}
