import java.util.Scanner;

public class Program_5_check_the_names_are_equal {
    public static void main(String[] args) {
        System.out.println("Enter the first name");
        Scanner name1 = new Scanner(System.in);
        String writename1 = name1.nextLine();
        System.out.println("Enter the second name");
        Scanner name2 = new Scanner(System.in);
        String writename2 = name2.nextLine();
        if(writename1.equals(writename2)==true){
            System.out.println("Both the names are same");
        }else{
            System.out.println("Both the names are not same");
        }
    }
}
