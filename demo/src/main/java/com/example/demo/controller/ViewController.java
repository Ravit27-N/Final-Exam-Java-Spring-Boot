package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("")
public class ViewController {
 
  @GetMapping("")
  public String Login() {
    return "login";
  }

  @PostMapping("/save")
  public String save() {
    return "redirect:/home";
  }

  @GetMapping("/home")
  public String Home() {
    return "home";
  }

}
