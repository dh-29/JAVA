import java.util.*;
public class loop2 {
    public static void main(String[]args){
        
        while(true){
        Scanner s = new Scanner(System.in);
        System.out.println("Which Multiplication table would you like to see..?");
        int n = s.nextInt();
        
        System.out.println("\nHere is your Tables...");

        int i=1;
        while(i<=20){
            System.out.println(n +" X "+ i+ " = " + i*n);
            i++;
        }
        System.out.println();
    }

    }
}
