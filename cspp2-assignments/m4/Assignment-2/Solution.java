import java.util.*;
public class Solution {
    /* Fill the main function to print resultant of addition of matrices*/
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        

        int[][] a = new int[m][n];
        

        for (int i=0; i<m; i++) { 
            for (int j=0; j<n; j++) { 
                a[i][j] = s.nextInt();
                }
        }

        // System.out.println("--------------------------");
        
        // for (int i=0; i<m; i++) { 
        //     for (int j=0; j<n; j++) { 
        //         System.out.print(a[i][j] + " ");
        //         }
        //         System.out.println();
                
        // }
        // System.out.println("--------------------------");
        int p = s.nextInt();
        int q = s.nextInt();
        int[][] b = new int[p][q];
        for (int i=0; i<p; i++) { 
            for (int j=0; j<q; j++) { 
                b[i][j] = s.nextInt();
                }
        }
        // System.out.println("--------------------------");
        // for (int i=0; i<p; i++) { 
        //     for (int j=0; j<q; j++) { 
        //         System.out.print(b[i][j] + " ");
        //         }
        //         System.out.println();
                
        // }
        if (m == p && n == q) {
            int[][] c = new int[m][n];
            for(int i=0;i<m;i++){    
            for(int j=0;j<n;j++){    
                c[i][j]=a[i][j]+b[i][j];
            }
            }
            for(int i=0;i<m;i++){    
            for(int j=0;j<n-1;j++){    
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println(c[i][n-1]);//new line 
            }
        }
        else{
            System.out.println("not possible");
        
            
        
        }
        
    }
}