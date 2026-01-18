//Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is
//2024
//I/P => NONE
//O/P => Harry's age in 2024 is ___

import java.util.*;

class age {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int birthyear = sc.nextInt();

        int currentYear = 2024;
        int age = currentYear - birthyear;

        System.out.println("Harry's age in 2024 is " + age);
    }
}
