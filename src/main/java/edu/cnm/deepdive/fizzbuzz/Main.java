package edu.cnm.deepdive.fizzbuzz;

import edu.cnm.deepdive.fizzbuzz.service.FizzBuzz;
import edu.cnm.deepdive.fizzbuzz.service.FizzBuzz.Value;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

public class Main {

  private static final Map<Set<Value>, String> DISPLAY_TABLE = Map.of(
      Set.of(Value.FIZZ), "fizz",
      Set.of(Value.BUZZ), "buzz",
      EnumSet.allOf(Value.class), "fizz-buzz"
  );
  public static void main(String[] args) {
    // TODO Invoke main loop to print fizzbuzz values & numbers.

    for (int counter = 1; counter <= 100; counter++) {
      Set<FizzBuzz.Value> value = FizzBuzz.evaluate(counter);
      String representation = DISPLAY_TABLE.getOrDefault(value, String.valueOf(counter));
      System.out.printf("%s ", representation);
      System.out.printf("%n");

    }
  }
}
