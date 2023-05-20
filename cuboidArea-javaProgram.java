
import java.lang.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
       // area of cuboid = 2(lh+bh+bl)
        // volume of cuboid = length * breadth * height

        int l, b, h;
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        b = sc.nextInt();
        h = sc.nextInt();
        int i = (l * h) + (b * h) + (b * l);
        int cubeArea = 2*i;
        int cubeVolume = l * b * h;

        System.out.println("cube total area is "+cubeArea);
        System.out.println("cube volume is "+cubeVolume);
    }
}
