public class SumRC    
{    
    public static void main(String[] args) {    
        int r, c, sumRow, sumCol;        
        int a[][] = {       
                        {1, 2, 3},    
                        {4, 5, 6},    
                        {7, 8, 9}    
                    };    
              
            
          r = a.length;    
        c= a[0].length;    
        for(int i = 0; i < r; i++){    
            sumRow = 0;    
            for(int j = 0; j < c ;j++){    
              sumRow = sumRow + a[i][j];    
            }    
            System.out.println("Sum of " + (i+1) +" r: " + sumRow);    
        }    
        for(int i = 0; i < c; i++){    
            sumCol = 0;    
            for(int j = 0; j < r; j++){    
              sumCol = sumCol + a[j][i];    
            }    
            System.out.println("Sum of " + (i+1) +" column: " + sumCol);    
        }    
    }    
}    