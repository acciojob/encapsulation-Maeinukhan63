package com.driver;

public class Main {
  public static void main(String args[]){
    RWOnly rw=new RWOnly();
    // rw.name="John doe";  // ERROR: name has private access in RWOnly 
    // System.out.println(rw.name);// ERROR : name has private access in RWOnly

    rw.setName("john doe");
    System.out.println(rw.getName());
  }
}