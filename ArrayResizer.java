public class ArrayResizer
{
  /** Returns true if and only if every value of row r in array2D is nonzero.
   * Precondition: r is a valid row of array2D.
   * Postcondition: array2D is unchanged.
   */
  public static boolean isNonZeroRow(int[][] array2D, int r)
  {
      for (int col = 0; col < array2D[r].length; col++) {
        if (array2D[r][col] == 0) {
          return false;      
        }
      }

      //if done with that row, 

    return true;
  }

  /** Returns the number of rows of array2D that contain all nonzero values.
   * Postcondition: array2D is unchanged.
   */
  public static int numNonZeroRow(int[][] array2D)
  {
    int count = 0;
    for (int row = 0; row < array2D.length; row++)
    {
       if (isNonZeroRow(array2D, row))
       {
          count++;
       }
    }
    return count;
  }

  /** Returns a new, possibly smaller, two-dimensional array that contains only rows
   * from array2D with no zeros, as described in part (b).
   */
  public static int[][] resize(int[][] array2D)
  {
    int count = 0; 
    int numRows = numNonZeroRow(array2D); //set the amount of nonzero rows there are in the array
    int[][] resizedList = new int[numRows][]; //make a new list with the num of nonzero rows
    for (int row = 0; row < array2D.length; row++) { 
      if(isNonZeroRow(array2D, row)) { //loop through the array and see if there are nonzero rows
        resizedList[count] = array2D[row]; //add the nonzero rows into the resize array
        count++; //onto next row
      }

    }
    /* to be implemented in part (b) */
    return resizedList;
  }
}
