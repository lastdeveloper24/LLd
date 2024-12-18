import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the name");
        String name_of_the_person = scanner.nextLine();

        System.out.println("enter the name company");
        String name_of_the_company = scanner.nextLine();

        System.out.println("enter the role");
        String role = scanner.nextLine();

        System.out.println("is this guys a recruiter or referral : y or n" );
        String  ans = scanner.nextLine();

        String pitch = "";
        if(ans.equals("y")){
            pitch = " Can you consider my application." ;
        }
        else{
            pitch = " Can you please refer me. ";
        }



        scanner.close();
        String message = "Hi " + name_of_the_person + "\n" +
                "Hope this message finds you well. \n" +
                "I'm writing to you regarding employment opportunity at " + name_of_the_company + ". "+
                "I've around 2.5 years of experience here at Arcesium. I'm proficient in Java and backend technologies , and have basic front-end skills as well. \n" +
                "I see " + name_of_the_company + " is hiring for " + role + "." + pitch + "\n" +
                "I am enclosing my resume, which outlines my technical skills and proficiency with various tools and frameworks. Please let me know if you need more info." + "\n" +
                "Thanks in advance." + "\n\n" +
                "Look forward to hearback from you." ;

        System.out.println(message);
    }
}