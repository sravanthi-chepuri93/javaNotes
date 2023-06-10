public class Main {
    public static void main(String[] args) {

//        Challenge 1: Sum of all elements

//        int A[] = {2,5,3,4,7};
////        int sum =0;
////        for(int i=0; i<A.length;i++){
////            sum = sum+A[i];
////
////        }
////        System.out.println(sum);
//        int sum =0;
//        for(int x: A){
//            sum = sum+x;
//        }
//        System.out.println(sum);

//        challenge 2: Searching an element

        int[] numbers = {4,6,7,8,9,10,2,3};
        int key = 15;
        for(int i=0;i<numbers.length;i++){
            if(key == numbers[i]){
                System.out.println("number is found");
                System.exit(0);
            }
        }
        System.out.println("number is not found");

    }
}