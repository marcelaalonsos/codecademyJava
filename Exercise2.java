public class Exercise2 {
  public static void main(String[] args) {

    //declare a 2d array of flat values called floatTwoD
    float[][] floatTwoD;

    // initalize the 2d array from the last step to an emoty 2d array consisting of 4 arrays with 10 elements each
    floatTwoD = new float[4][10];

    // declare and initialize an empty 2d array of integer consisting of 15 rows and 8 columns called dataChart
    int[][] dataChart = new int[15][8];

    //create a 2d char array called ticTacToe representing the provided tac-tac-toe board. use the characters 'X', 'O' and ' '
    char[][] ticTacToe = {{'X', 'O', 'O'}, {'O', 'X', ' '}, {'X', ' ', 'X'}};

    //when no one is looking, you want to modify the game to where you, 'O' wins the game. Replace the game board so that all X's are O's and all O's are X's. do this in one line with initializer lists
    ticTacToe = new char[][] {{'O', 'X', 'X'}, {'X', 'O', ' '}, {'O', ' ', 'O'}};
  }
}
