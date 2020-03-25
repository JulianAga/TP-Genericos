public class Main {

  public static void main(String[] args) {
    System.out.println("sad");

    GenericArray<Persona> genericArray = new GenericArray<Persona>();
    GenericArray<Integer> numeros = new GenericArray<Integer>();

    numeros.add(1);
    numeros.add(2);
    numeros.add(3);
    numeros.add(4);

    Persona p = new Persona("franco",1000);
    Persona p1 = new Persona("asd",2000);

    Persona p2 = new Persona("Julian",5000);

    genericArray.add(p);
    genericArray.add(p1);
    genericArray.add(new Persona("fdfdf",500));
    genericArray.add(p2);
    genericArray.add(new Persona("dieguez",200));
    genericArray.add(new Persona("eliminable",100));

    genericArray.findMin();
    genericArray.findMax();
    numeros.findMax();
    numeros.findMin();

    System.out.println(genericArray.deleteLast());
    System.out.println(genericArray.toString());

    Stack<Persona> personaStack = new Stack<>();

    System.out.println(personaStack.pop());

    personaStack.push(p);
    personaStack.push(p1);
    personaStack.push(p1);
    personaStack.push(p1);
    personaStack.push(p2);

    System.out.println(personaStack.size());
    System.out.println(personaStack.pop().toString());

  }
}
