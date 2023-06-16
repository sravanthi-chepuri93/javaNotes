public class twoDarrayChallenge {
    public static void main(String[] args){
        int []D[] = new int[5][5];
        int[] E,F[];
        E= new int[5];
        F= new int[5][5];// here E 1D array
        // and F is 2D array
        int[] K,H,I,J; // all these are aD 1D arrays

        int[][] A = {{1,2,3,4},{5,6,7,8},{4,5,6,7}};
        System.out.println(A.length);
        System.out.println(A[0].length);
        System.out.println(A[0][0]);
        System.out.println(A[2][3]);

        F = new int[3][3];
        F[0][0] = 3;
        F[0][1] = 5;
        F[0][2] = 9;

        for(int x[]:F){
            for(int y:x){
                System.out.print(y+",");
            }
            System.out.println("");
        }
        // jagged array

        int[][] G;
        G= new int[3][];
        G[0] = new int[2];
        G[1]= new int [4];
        G[2]= new int[6];

        for(int i=0; i<G.length;i++){
            for(int j=0; j<G[i].length;j++){
                System.out.print(G[i][j]+",");
            }
            System.out.println("");

        }

        // for each loop

        for(int x[]:G){
            for(int y:x){
                System.out.print(y+",");
            }
            System.out.println("");
        }

    }

}
