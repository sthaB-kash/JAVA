//
//Write a program to display the values of 2D array as given below using for
//loop and for each loop.
//int p[][]={
//{5,6,7,8},
//{6,7,8,9},
//{9,8,7,6}
//};
// 
package Lab2;

 
 
public class q1 {
    public static void main(String args[]) {
        int p[][]={
            {5,6,7,8},
            {6,7,8,9},
            {9,8,7,6}
            };
        System.out.println("using for loops:");
        int i=0, j=0;
        for (;i<3; i++) {
            for (j=0; j<4; j++){
                System.out.println("p["+i + "][" + j + "] = " + p[i][j]);
            }
        }
        System.out.print("=====================================\nUsing for each loops::");
        for(int[] row: p){
            for(int col: row){
                System.out.println(col);
            }
        }
        
    }
    
}
