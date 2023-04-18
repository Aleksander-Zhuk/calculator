import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main (String[] arg) throws FileNotFoundException {

        File file = new File("imput.txt");

        Scanner sc = new Scanner(file);
        String[] str = sc.nextLine().split(" ");
        boolean flag = true;
        boolean flag2 = false;
        boolean flag3 = false;
        double a = 0, b = 0;

        try {
            a = Double.parseDouble(str[0]);
            b = Double.parseDouble(str[2]);
        }
        catch (NumberFormatException ex){
            System.out.println("Error! Not number");
            flag = false;
            return;
        }

        if ("+-*/".contains(str[1]) & flag ) flag2 = true;
        else System.out.println("Operation Error!");

        if (flag2 ){
            switch (str[1]){
                case "+":{
                    System.out.println(a + b);
                    break;
                }
                case "-":{
                    System.out.println(a - b);
                    break;
                }
                case "*":{
                    System.out.println(a * b);
                    break;
                }
                case "/":{
                    if (b != 0) System.out.println(a / b);
                    else System.out.println("Error! Division by zero");
                    break;
                }
            }
        }
    }
}
