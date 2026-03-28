import java.util.*;
public class printdiagonalelements {
    public static void main(String args[]){
        int [][]mat={{1,2,3},{10,20,30},{100,200,300}};
        int r=mat[0].length;
        int c=mat[0].length;
        for(int i=0;i<r;i++){
            int j=c-i-1;
                System.out.println(mat[i][j]);
           
        }

    }
    
}
