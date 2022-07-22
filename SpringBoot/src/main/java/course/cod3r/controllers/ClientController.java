package course.cod3r.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import course.cod3r.models.entities.Client;

@RestController
@RequestMapping(path = "/clients")
public class ClientController {
  
  @GetMapping(path = "/any")
  public Client getClient() {
    return new Client(12, "luis", "123.456.789-01");
  }

  @GetMapping(path = "/{id}")
  public Client getClientById(@PathVariable int id) {
    return new Client(id, "maria", "122.122.122-12");
  }

  @GetMapping
  public Client getClientById2(@RequestParam(name = "id", defaultValue = "1") int id) {
    return new Client(id, "Joao", "232.323.232-32");
  }
  
}
