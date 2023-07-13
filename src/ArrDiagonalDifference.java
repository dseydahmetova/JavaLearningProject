    /*
     * Problem Statement:
     * You are given a square matrix of size N×N. Calculate the absolute difference
     * of the sums across the two main diagonals.
     *
     * Input Format:
     * The first line contains a single integer N. The next N lines contain N
     * integers (each) describing the matrix.
     *
     * Constraints:
     * 1 <= N <= 100
     * -100 <= A[i] <= 100
     *
     * Output Format:
     * Output a single integer equal to the absolute difference in the sums across
     * the diagonals.
     *
     * Sample Input:
     * 3
     * 11 2 4
     * 4 5 6
     * 10 8 -12
     *
     * Sample Output:
     * 15
     */

    import java.util.*;
    public class ArrDiagonalDifference {

       public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           int rowcol = sc.nextInt();
           int[][] arr = new int[rowcol][rowcol];

          for(int i=0; i<rowcol; i++){
              for(int j=0; j< rowcol; j++){
                  arr[i][j]=sc.nextInt();
              }
          }
          sc.close();

          int sum1=0;
          int index=0;
          while(index<arr.length) {
              sum1+=arr[index][index];
              index++;
          }

          int sum2=0;
          for(int row=0, col=arr.length-1; row<arr.length; row++, col--){
              sum2+= arr[row][col];
          }
           System.out.println(Math.abs(sum1-sum2));
       }
    }

