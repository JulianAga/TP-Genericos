import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericArray<T extends Comparable> {

  private List<T> elementos = new ArrayList<>();

  public GenericArray(List<T> elementos) {
    this.elementos = elementos;
  }

  public GenericArray() {

  }

  public List<T> getElementos() {
    return elementos;
  }

  public void setElementos(List<T> elementos) {
    this.elementos = elementos;
  }

  public void add(T e) {
    this.elementos.add(e);
  }

  public void findMax() {
    System.out.println((T) Collections.max(getElementos()));
  }

  public void findMin() {
    System.out.println(Collections.min(getElementos()));
  }

  public T deleteLast() {
    return this.elementos.remove(elementos.size() - 1);
  }

  @Override
  public String toString() {
    return "GenericArray{" +
        "elementos=" + elementos +
        '}';
  }
}
