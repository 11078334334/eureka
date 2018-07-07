package com.slj.controller;


import com.slj.pojo.User;
import com.slj.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
  @Autowired
  private UserFeignClient userFeignClient;

  @GetMapping("/user/{id}")
  public User findById(@PathVariable Long id) {
    return userFeignClient.findById(id);
  }
}
