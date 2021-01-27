package edu.cnm.deepdive;

public class StaticMethodsAndFields {

  public static int myNumber = 10;

  public static void main(String[] args) {
    System.out.println(myNumber);//we can access the data variable directly without creating an
    //instance like this: "StaticMethodsAndFields test = new StaticMethodsAndFields();" because
    //the field has been declared static which means it is accessible throughout the class.

  }
}
