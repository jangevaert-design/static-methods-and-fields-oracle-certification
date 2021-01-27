package edu.cnm.deepdive;

public class Launcher {

  public static void main(String[] args) {
    StaticMethodsAndFields.main(args);//we can call a main class from another class because it is static.
    //prints 10 because that is what the method is within that main method.
    System.out.println(StaticMethodsAndFields.myNumber);// we can call a static field.
    //prints 10 because that is what the field is instantiated to.
   AnotherClass.main(args);//prints the String that we created inside the main method.
    
  }
}
