package edu.cnm.deepdive.fizzbuzz;

import edu.cnm.deepdive.fizzbuzz.service.FizzBuzz;

public class Main {

  public static void main(String[] args) {
    // TODO Invoke main loop to print fizzbuzz values & numbers.

    for (int counter = 1; counter <= 100; counter++) {
      String value = FizzBuzz.evaluate(counter);
      System.out.printf("%s ", value);
//      System.out.printf("%s%n", FizzBuzz.evaluate(counter));
      if (value.contentEquals("fizzbuzz")){
        System.out.printf("%n");
      }
    }
  }
}
