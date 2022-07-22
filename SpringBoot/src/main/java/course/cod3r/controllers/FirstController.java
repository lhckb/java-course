package course.cod3r.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

  @GetMapping(path = {"", "/ola"})
  public String hello() {
    return "hello springboot";
  }
}
