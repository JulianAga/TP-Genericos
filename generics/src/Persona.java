import java.util.Comparator;
import java.util.Objects;

public class Persona implements Comparable<Persona> {

  public Persona(String nombre,Integer salario) {
    this.nombre = nombre;
    this.salario = salario;
  }

  public String nombre;

  public Integer salario;

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setSalario(Integer salario) {
    this.salario = salario;
  }

  public Integer getSalario() {
    return salario;
  }


  @Override
  public String toString() {
    return "Persona{" +
        "nombre='" + nombre + '\'' +
        '}';
  }

  @Override
  public int hashCode() {
    return Objects.hash(salario);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Persona persona = (Persona) o;
    return Objects.equals(salario, persona.salario);
  }

  @Override
  public int compareTo(Persona o) {
    Persona p = (Persona)o;
    if(this.salario>p.getSalario()){
      return 1;
    }
    else{
      if (this.salario == p.getSalario()){
        return 0;}
      else{
        return -1;
      }
    }
  }
}
