import java.util.*;
public class loop3 {
    public static void main(String[] args){
        String opass = "123";
        int i=1;
        Scanner s = new Scanner(System.in);
        String pass;
        System.out.println("Enter the password: ");
        while(i<=3){
            pass = s.nextLine();
            i++;
            if(pass.equals(opass)){
                System.out.println("Logged in...");
                break;
            }
            else
            {
                System.out.println("GTFOH");
            }
        }
    }
}
