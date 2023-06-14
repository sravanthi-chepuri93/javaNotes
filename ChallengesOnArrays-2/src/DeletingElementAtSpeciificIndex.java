public class DeletingElementAtSpeciificIndex {
    public static void main(String[] args){
        int A[] = new int[10];
        A[0]=4;A[1]=7; A[2]= 5; A[3]=1; A[4]=8; A[5]=6;
        int n=5;
        for (int i=1;i<5;i++){
            A[i]=A[i+1];
        }
        for(int i=0; i<n;i++){
            System.out.println(A[i]);
        }

    }
}
