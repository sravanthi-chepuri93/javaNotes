public class RotatingArray {
    public static void main(String[] args){
        int A[]= {3,6,4,7,8,9,2,1};
        for(int x: A){
            System.out.print(x+",");
        }
        System.out.println("");
        int temp = A[0];
        for(int i=1;i<A.length;i++){
            A[i-1]=A[i];
        }
        A[A.length-1] = temp;
        System.out.println(" after rotating an array");
        for(int x: A){
            System.out.print(x+",");
        }

    }
}
