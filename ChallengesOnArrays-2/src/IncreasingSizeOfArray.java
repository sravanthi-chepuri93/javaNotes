public class IncreasingSizeOfArray {
    public static void main(String[] args){
        int A[] = { 8,6,10,9,2};
        System.out.println("initial length of an Array is "+A.length);
        int B[] = new int[2*A.length];
        for(int i=0;i<A.length;i++){
            B[i] = A[i];
        }
        A= B;

        B=null;

        System.out.println("Increased length of an array is "+A.length);



    }
}
