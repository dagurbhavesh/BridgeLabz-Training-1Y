import java.util.*;

    public class vol_of_cyl {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Height = ");
        int height = sc.nextInt();
        System.out.println("Radius = ");
        int radius = sc.nextInt();
        double volume = 3.14 * (radius*radius) * height;
        System.out.println(volume);
    }
}
