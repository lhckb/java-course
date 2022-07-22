package course.cod3r.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import course.cod3r.models.entities.Product;
import course.cod3r.models.repositories.ProductRepository;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {

  @Autowired
  private ProductRepository productRepository;

  @GetMapping
  public Iterable<Product> getProducts() {
    return productRepository.findAll();
  }

  @GetMapping(path = "/{id}")
  public Optional<Product> getProductById(@PathVariable int id) {
    return productRepository.findById(id);
  }

  @GetMapping(path = "/search/{name}")
  public Iterable<Product> getProductByName(@PathVariable String name) {
    return productRepository.findByNameContaining(name);
  }

  @GetMapping(path = "/page/{num}")
  public Iterable<Product> getProductsByPage(@PathVariable int num) {
    Pageable page = PageRequest.of(num-1, 5);
    return productRepository.findAll(page);
  }

  @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
  public Product createProduct(@Valid Product product) {
    productRepository.save(product);
    return product;
  }

  @DeleteMapping(path = "/{id}")
  public String deleteProductById(@PathVariable int id) {
    productRepository.deleteById(id);
    return "Deleted Successfully.";
  }

}
