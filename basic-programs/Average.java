import java.util.*;
    public class Average {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("a = ");
        int a = sc.nextInt();
        System.out.println("b = ");
        int b = sc.nextInt();
        System.out.println("C = ");
        int c = sc.nextInt();

        int average = (a+b+c)/3;
        System.out.println("Average = ");
        System.out.println(average);
    }

}
