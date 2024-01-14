import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        double res = 0;
        // 1. request 1st number
        System.out.println("Введите первое значение: ");
        int num1 = new Scanner(System.in).nextInt();
        // 2. request 2nd number
        System.out.println("Введите второе значение: ");
        int num2 = new Scanner(System.in).nextInt();
        // 3. request operation
        System.out.println("Введите вариат операции: ");
        String operation = new Scanner(System.in).nextLine();
        // 4. determine result using switch
        switch (operation) {
            case  ("+"):
                res = num1 + num2;
                break;
            case ("-"):
                res = num1 - num2;
                break;
            case ("*"):
                res = num1 * num2;
                break;
            case ("/"):
                res = num1 / num2;
                break;
            case ("%"):
                res = num1 % num2;
                break;
            default:
                System.out.println("Такой операции не существует");
                break;
        }
        // 5. output result
        System.out.println("Результат выполнения операции: " + res);


    }

}