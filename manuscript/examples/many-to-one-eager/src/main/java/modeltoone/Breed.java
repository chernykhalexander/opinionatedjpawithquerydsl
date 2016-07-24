package modeltoone;

import javax.persistence.*;

@Entity
public class Breed {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String name;

  @ManyToOne
  private Breed derivedFrom;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Breed getDerivedFrom() {
    return derivedFrom;
  }

  public void setDerivedFrom(Breed derivedFrom) {
    this.derivedFrom = derivedFrom;
  }

  @Override
  public String toString() {
    return "Breed{" +
      "id=" + id +
      ", name='" + name + '\'' +
      '}';
  }
}