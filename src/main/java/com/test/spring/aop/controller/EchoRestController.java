package com.test.spring.aop.controller;

import com.test.spring.aop.service.EchoServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoRestController {

  private Logger log = LoggerFactory.getLogger(EchoRestController.class);

  private EchoServiceImpl echoService;

  public EchoRestController(EchoServiceImpl echoService){
    this.echoService = echoService;
  }

  @RequestMapping(value = "/echo", method = RequestMethod.GET)
  public ResponseEntity echo(){
    log.debug("Transfer method invoked in the controller");
    return ResponseEntity.ok(echoService.echo("Mock"));
  }

  @RequestMapping(value = "/echo2", method = RequestMethod.GET)
  public ResponseEntity echo2(){
    log.debug("Transfer method invoked in the controller");
    return ResponseEntity.ok(echoService.echo2("Mock"));
  }

}
