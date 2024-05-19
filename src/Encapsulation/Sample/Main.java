package Encapsulation.Sample;

public class Main {
  public static void main(String[] args) {
      Person person = new Person("John", 30);
      person.printDescription();  

      person.setName("");  // print error
      person.setAge(150);  // print error

      person.printDescription();  
  }
}

