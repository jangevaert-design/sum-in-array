import java.util.Arrays;

public class SumInArray {
// find pairs of integer in an array that add up as a sum to the given int k.

  //Brute force method with high time complexity.
  public static void main(String[] args) {
    int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };
    int[] numbersWithDuplicates = { 2, 4, 3, 5, 6, -2, 4, 7, 8, 9 };
    prettyPrint(numbers, 7);
    prettyPrint(numbersWithDuplicates, 7);
  }

  public static void printPairs(int[] array, int sum) {
    for (int i = 0; i < array.length ; i++) {
      int first = array[i];
      for (int j = i + 1; j < array.length; j++) {
        int second = array[j];

        if (first + second == sum) {
          System.out.printf("(%d, %d) %n", first,second);
        }
      }

    }
  }

  public static void prettyPrint(int[] givenArray, int givenSum) {
    System.out.println("Given array: " + Arrays.toString(givenArray));
    System.out.println("Given sum: " + givenSum);
    System.out.println("Integers who's sum is equal to the given sum:" + givenSum);
    printPairs(givenArray, givenSum);
  }
}
