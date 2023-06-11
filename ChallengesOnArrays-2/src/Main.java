public class Main {
    public static void main(String[] args) {
// 3.Finding maximum element
        int A[]= { 3,9,78,12,6,15,5,4,10};
        int max = A[0];
        for(int i=0;i<A.length;i++){
            if(A[i]>max){
                max=A[i];
            }
        }
        System.out.println(max);
    }
}