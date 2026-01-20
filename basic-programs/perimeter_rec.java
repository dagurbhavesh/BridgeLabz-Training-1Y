import java.util.*;

    public class perimeter_rec {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Length");
        int length = sc.nextInt();
        System.out.println("Width");
        int width = sc.nextInt();

        int perimeter = 2 * (length * width);
        System.out.print("Perimeter = ");
        System.out.print(perimeter);

    }
}
