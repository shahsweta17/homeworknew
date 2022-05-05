import java.util.Scanner;

public class homewk {
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter your number");
        int a =scanner.nextInt();
        System.out.println(a);
        {
            for (int b=1; b <= 10; b++){
                System.out.println(a+ "*" +b+ "=" +a*b);

            }
        }
    }
}
