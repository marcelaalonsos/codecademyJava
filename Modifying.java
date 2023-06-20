import java.util.Arrays;

public class Modifying {
  public static void main(String[] args) {
    //using the provided 2D array
    int[][] intMatrix = {{1, 1, 1, 1, 1}, {2, 4, 6, 8, 0}, {9, 8, 7, 6, 5}};

    //replace the number 4 in the 2D array with the number 0
    intMatrix[1][1] = 0;

    //declare and initialize a new empty 2x2 integer 2D array called subMatrix
    int[][] subMatrix;
    subMatrix = new int[2][2];

    //using 4 lines of code, multiply each of the elements in the 2x2 top left corner of intMatrix by 5 and store the results in the subMatrix you created.
    subMatrix[0][0] = intMatrix[0][0] * 5;
    subMatrix[0][1] = intMatrix[0][1] * 5;
    subMatrix[1][0] = intMatrix[1][0] * 5;
    subMatrix[1][1] = intMatrix[1][1] * 5;

    //afterwards, uncomment the provided print statement below
    System.out.println(Arrays.deepToString(subMatrix));

  }
}
