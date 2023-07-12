public class SpiralMatrix {
        // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
        public int[] spiralOrder(final int[][] A) {
            int n = A.length;
            int m = A[0].length;
            int[] newArr = new int[n*m];

            int mincol = 0, minrow = 0;
            int maxcol = A[0].length - 1, maxrow = A.length -1;

            int count = 0;

            while(count < n*m) {
                for(int i = mincol; i<= maxcol && count < n * m; i++) {
                    newArr[count] = A[minrow][i];
                    count ++;
                }
                minrow++;
                for(int i= minrow; i <= maxrow && count < n * m; i++){
                    newArr[count] = A[i][maxcol];
                    count++;
                }
                maxcol--;
                for(int i = maxcol; i >= mincol && count < n * m; i--) {
                    newArr[count] = A[maxrow][i];
                    count ++;
                }
                maxrow--;
                for(int i = maxrow; i>= minrow && count < n * m; i--) {
                    newArr[count] = A[i][mincol];
                    count ++;
                }
                mincol++;
            }

            return newArr;
        }
    }


