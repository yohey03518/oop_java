package Encapsulation.Sample;

public class Main {
  public static void main(String[] args) {
      Person person = new Person("John", 30);
      person.printDescription();  

      person.setName("");  // error
      person.setAge(150);  // error

      // check result
      person.printDescription();  
  }
}

