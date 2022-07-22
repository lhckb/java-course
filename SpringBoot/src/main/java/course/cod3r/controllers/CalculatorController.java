package course.cod3r.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// /calculator/sum/numx/numy
// /calculator/sub?numx=X&numy=Y

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {

  protected String getParsedResult(int x, int y) {
    Integer sum = x + y;
    String res = sum.toString();
    return res;
  }
  
  @GetMapping("/sum/{x}/{y}")
  public String sum(@PathVariable int x, @PathVariable int y) {
    String response = getParsedResult(x, y);
    return response;
  }

  @GetMapping("/sub")
  public String sub(@RequestParam(name = "x") int x, @RequestParam(name = "y") int y) {
    String response = getParsedResult(x, y);
    return response;
  }
  
}
