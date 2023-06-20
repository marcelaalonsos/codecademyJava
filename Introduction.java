public class Introduction {
  public static void main(String[] args) {
    //given the provided 2D array
    int[][] intMatrix = {
				{ 4,  6,  8, 10, 12, 14, 16},
				{18, 20, 22, 24, 26, 28, 30},
				{32, 34, 36, 38, 40, 42, 44},
				{46, 48, 50, 52, 54, 56, 58},
				{60, 62, 64, 66, 68, 70, 79}
		};

    //store the number of subarrays of intMtrix into a variable called numSubArrays
    int numSubArrays = intMatrix.length;
    // store the length of the subArrays using the first subarray in intMatrix.
    //store it in a variable called SubArrayLength
    int SubArrayLength = intMatrix[0].length;
    //store the number of columns in intMatrix into a variable called 'columns'
    int columns = SubArrayLength;
    //store the number of rows in intMatrix into a variable called 'rows'
    int rows = numSubArrays;
    //replace the outer and inner for loop headers to iterate through the entire 2D array
    // use the iterators 'i' for the outer loop, and 'j' for the inner loop
    int sum = 0;
    for (int i = 0; i < intMatrix.length; i++) {
      for (int j = 0; j < intMatrix[i].length; j++) {
        //insert a line of code to increase the variable sum by each accessed element
        sum += intMatrix[i][j];
      }
    }
    System.out.println(sum);
  }
}
