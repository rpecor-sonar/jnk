package com.acme.basic;

public class HelloWorld {

  void sayHello() {
    System.out.println("Hello World!");
  }

  void notCovered() {
    System.out.println("This method is not covered by unit tests");
  }

}

public class HelloWorld2 {

  public static void main(String[] args) {
    try {
      doSomethingWhichThrowsException();
      System.out.println("OK");   // incorrect "OK" message is printed
    } catch (RuntimeException e) {
      System.out.println("ERROR");  // this message is not shown
    }
  }
  
  public static void doSomethingWhichThrowsException() {
    try {
      throw new RuntimeException();
    } finally {
      for (int i = 0; i < 10; i ++) {
        //...
        if (q == i) {
          break; // ignored
        }
      }
  
      /* ... */
      return;      // Noncompliant - prevents the RuntimeException from being propagated
    }
  }

}
