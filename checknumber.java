import java.util.Scanner;

public class checknumber
{
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = Scanner.nextInt();

        if (a % 5 == 0 && 10 == 0) {
            System.out.println("Divisible by 5 and 10");
        }
        else{
            System.out.println("not divisible by 5 and 10");
        }

    }
}
