
import java.util.Arrays;

public class seabinary{
    public static void main(String[] args){
        int[][] arr= {{2,3,5},
                     {9,4,8},
                     {6,1,7}};
        int[] ans = max(arr);
    //    System.out.println("The maximum element in the 2D array is: "+an s[0]);
        System.out.println(Arrays.toString(ans));

    }
    static int[] max(int[][] arr){
        int max = arr[0][0];
        int i=0;
        int j=0;

        for(int row =0;row<arr.length;row++){
            for(int col = 0;col<arr[i].length;col++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                   i=row;
                    j=col;
                    
                }
                return new int[]{i,j};
            
            }
        } 
        return new int[]{i,j};
}}