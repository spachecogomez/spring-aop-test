package com.test.spring.aop.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class EchoServiceImpl implements EchoService{

  private Logger log = LoggerFactory.getLogger(EchoServiceImpl.class);

  public String echo(String name){
    log.debug("Service echo executed");
    return "Echo ".concat(name);
  }

  public String echo2(String name){
    log.debug("Service echo2 executed");
    return "Echo 2".concat(name);
  }

}
