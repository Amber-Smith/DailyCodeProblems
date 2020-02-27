// Given a list of numbers and a number k, return whether any two
// numbers from the list add up to k.
// For example: given [10,15,3,7] and k is 17, return true since 10 + 7 = 17
import java.util.*;

public class findValue {

  public static void main(String[] args) {

    int key = 17;
    boolean flag = false;
    Integer numbers[] = new Integer[4];
    numbers[0] = 10;
    numbers[1] = 15;
    numbers[2] = 3;
    numbers[3] = 7;

    HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(numbers));

    for (int i = 0; i < numbers.length; i++) {
      if (hashSet.contains(key - numbers[i]))
        flag = true;
      hashSet.add(numbers[i]);
    }
    if (flag) {
      System.out.println("Sum is present.");
    } else {
      System.out.println("sum is not prsent");
    }

  }
}
