import java.util.*;

    public class cal_to_fah {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int celsius = sc.nextInt();
        int fahrenheit = (celsius * 9/5) + 32;
        System.out.println(fahrenheit);

    }
}
