package com.test.spring.aop.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class LogAspect {

  private Logger log = LoggerFactory.getLogger(LogAspect.class);

  @Before("execution(String com.test.spring.aop.service.EchoService.echo(String))")
  public void beforeOp(){
    log.debug("Interceptor executed before echo");
  }

  @After("execution(String com.test.spring.aop.service.EchoService.echo(String))")
  public void afterOp(){
    log.debug("Interceptor executed after echo");
  }

  @AfterReturning("execution(String com.test.spring.aop.service.EchoService.echo(String))")
  public void afterReturningOp(){
    log.debug("Interceptor executed after returning echo");
  }

}
