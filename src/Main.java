public class Main {
    public static void main(String[] args) {

        int A[] = new int[5];// array declaration
        int B[]= { 2,4,8,5,7};// array with values
        int C[];
        C = new int[10];//we declare and initialize the array object later
        B[1]= 15;
//       for(int i=0; i<B.length;i++){// we can modify using counter control for loop
//           System.out.println(B[i]++);
//       }
////       for(int x: B){
////           System.out.println(x);// we cant modify values by using for each loop
////
////       }
        System.out.println(B.length);
        System.out.println(B);





    }
}