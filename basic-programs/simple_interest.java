import java.util.*;

    public class simple_interest {
    public static void main(String [] args){
     Scanner sc = new Scanner(System.in);
        System.out.println("Principal");
        int principal = sc.nextInt();
        System.out.println("Rate");
        int rate = sc.nextInt();
        System.out.println("Time (years)");;
        int time = sc.nextInt();

        int simple_interest = (principal * rate * time ) / 100;
        System.out.println("Simple interset =");
        System.out.print(simple_interest);

    }
}
