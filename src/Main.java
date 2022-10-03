import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Type number: ");
        boolean loop = true;

        while(loop){
            try {
                Scanner scanner = new Scanner(System.in);
                int num = scanner.nextInt();
                loop = false;
            }
            catch (ArithmeticException e){
                System.out.println("Arithmetic ERROR");
            }
            catch (InputMismatchException e){
                System.out.println("Input Mismatch ERROR");
            }
            catch(Exception e) {
                System.out.print("ERROR: ");
                System.out.println(e.toString().toUpperCase());
                e.printStackTrace();
            }
        }


        // ------------

        try {
            float x = 30 / 0;
        }
        catch (ArithmeticException e2){
            System.out.println("Arithmetic ERROR");
        }
        catch(Exception e) {
            System.out.println("ERROR");
        }

    }
}
