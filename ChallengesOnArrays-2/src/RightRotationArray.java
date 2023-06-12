import java.lang.*;
import java.util.*;
public class RightRotationArray {
    public static void main(String[] args){
        int A[] = { 4,6,8,7,9};
        int temp = A[A.length-1]; //9
        for(int i=A.length-1; i>0;i--){
            A[i] = A[i-1];
        }
        A[0] = temp;

        for(int x: A){
            System.out.println(x);
        }

    }
}
