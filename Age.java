import java.util.*;
public class Age {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        
        System.out.print("Enter your age :");
        int age = ob.nextInt();
        if(age<18){
            System.out.println("You are call ur father");
        }
        else{
            System.out.println("You are ready for SE*");
        }
    }
}