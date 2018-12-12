package com.company;

public class Main {
  public static void main(String[] args)
  {
    Digits digits1 = new Digits(7);
    System.out.println(digits1.isStricklyIncreasing());
    
    Digits digits2 = new Digits(65310);
    System.out.println(digits2.isStricklyIncreasing());
    
    System.out.println(new Digits(1356).isStricklyIncreasing());
    System.out.println(new Digits(1336).isStricklyIncreasing());
    System.out.println(new Digits(1536).isStricklyIncreasing());
    
    System.out.println(digits2.getDigitList());
  }
}
