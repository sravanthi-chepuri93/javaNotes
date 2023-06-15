public class Main {
    public static void main(String[] args) {

        int A[][] = new int[3][4];// one method of declaring of 2d array
        int B[][] = {{1,2,3,4},{6,3,4,7},{3,5,9,7}};// 2nd method of creating and declaring of 2d array
        int C[][];
        C= new int[3][4];// int C[][]:declares a reference variable C without assigning any value to it. This variable will hold a
                            // reference to the two-dimensional array.
        //C = new int[3][4]; creates a new two-dimensional array of
        // int type with 3 rows and 4 columns, and assigns its reference
        // to the variable C. This line initializes the array with default
        // values, which for int is 0.

        // traversing through 2D array

        for (int i =0; i<B.length;i++){
            for(int j=0;j<B[0].length;j++){
                System.out.print(B[i][j]+",");
            }
            System.out.print("\n");
        }

        // for each loop

        for(int x[]:B){
            for(int y:x){
                System.out.print(y+",");
            }
            System.out.print("\n");

        }

        // jagged array

        int D[][];
        D =  new int[3][];
        D[0]= new int[2];
        D[1]= new int[4];
        D[2] = new int[3];



    }
}