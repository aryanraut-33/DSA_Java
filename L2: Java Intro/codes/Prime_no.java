//code to find if a number is a prime or not, and print the factors

import java.util.*;

public class Prime_no {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int count = 0;

        for (long i = 1; i<=(num); i++){
            if(num%i == 0){
                count++;
                System.out.print(i + " ");
            }
        }

        if(count==2){
            System.out.println("prime");
        }
        else if (count == 1){
            System.out.println("special");
        }else {
            System.out.println("composite");
        }
    }
}
