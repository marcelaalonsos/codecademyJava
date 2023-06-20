public class Exercise3 {
  public static void main(String[] args) {
    //using the provided 2D array
    int[][] intMatrix = {{1, 1, 1, 1, 1}, {2, 4, 6, 8, 0}, {9, 8, 7, 6, 5}};

    //access the integer at the first row and fourth column of intMatrix and store it in a variable called retrievedInt
    int retrievedInt = intMatrix[0][3];
    System.out.println(retrievedInt);

    // print 3 times the center value of intMatrix to the console
    int centerVal = intMatrix[1][2];
    System.out.println(centerVal * 3);

  }
}
