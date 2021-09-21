import java.util.Scanner;
public class PrintHipen{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a numeric value: ");
        int star = input.nextInt();
        
        for(int i = 0; i <star; i++ ){
            for(int j = 0; j<star; j++){
                System.out.print("- ");
            }
            System.out.println();
        }
    }
}