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

  void sayHello() {
    System.out.println("Hello World 2!");
  }

  void notCovered() {
    System.out.println("This method is not covered by unit tests");
  }

  public void setName(String name) {
    name = name;
  }

}
