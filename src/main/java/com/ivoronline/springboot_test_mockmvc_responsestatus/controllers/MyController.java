package com.ivoronline.springboot_test_mockmvc_responsestatus.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  @ResponseBody
  @GetMapping("/Hello")
  public String hello() {
    return "Hello from Controller";
  }

}
