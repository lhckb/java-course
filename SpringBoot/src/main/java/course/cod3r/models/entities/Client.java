package course.cod3r.models.entities;

public class Client {

  private int id;
  private String name;
  private String cpf;

  public Client(int id, String name, String cpf) {
    this.id = id;
    this.name = name;
    this.cpf = cpf;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getName() {
    return this.name;
  }

  public int getId() {
    return this.id;
  }

  public String getCpf() {
    return this.cpf;
  }

}
