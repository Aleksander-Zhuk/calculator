import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;


public class Main {
    public static void main (String[] arg) throws FileNotFoundException {

        File file = new File("imput.txt");
        File file1 = new File("output.txt");
        PrintStream printStream = new PrintStream(file1);

        Scanner sc = new Scanner(file);



        while (sc.hasNext()){
            String str1 = sc.nextLine();
            String[] str = str1.split(" ");
            double a = 0, b = 0;
            boolean flag = true;
            boolean flag2 = false;
            boolean flag3 = false;
            printStream.print(str1+" = ");


            try {
            a = Double.parseDouble(str[0]);
            b = Double.parseDouble(str[2]);
        }
        catch (NumberFormatException ex){
            printStream.println("Error! Not number");
            flag = false;
            continue;
        }

        if ("+-*/".contains(str[1]) & flag ) flag2 = true;
        else printStream.println("Operation Error!");

        if (flag2 ){
            switch (str[1]){
                case "+":{
                    printStream.println(a + b);
                    break;
                }
                case "-":{
                    printStream.println(a - b);
                    break;
                }
                case "*":{
                    printStream.println(a * b);
                    break;
                }
                case "/":{
                    if (b != 0) printStream.println(a / b);
                    else printStream.println("Error! Division by zero");
                    break;
                }
            }
        }
        }
        sc.close();
    }
}
