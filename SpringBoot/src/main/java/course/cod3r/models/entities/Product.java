package course.cod3r.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
public class Product {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @NotBlank
  private String name;

  @Min(0)
  private Double price;

  @Min(0)
  @Max(1)
  private Double discount;

  public Product() {}

  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public Double getPrice() {
    return this.price;
  }

  public Double getDiscount() {
    return this.discount;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public void setDiscount(Double discount) {
    this.discount = discount;
  }

}
