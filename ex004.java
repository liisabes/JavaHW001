import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        ex4();
    }

    static void ex4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        Double fNumber = Double.parseDouble(scanner.nextLine());

        System.out.println("Введите второе число: ");
        Double secNuumber = Double.parseDouble(scanner.nextLine());

        System.out.println("Введите операцию: ");
        String operation = scanner.nextLine();

        Double summ = fNumber + secNuumber;
        Double diff = fNumber - secNuumber;
        Double composition = fNumber * secNuumber;
        Double quotient = fNumber / secNuumber;
        switch (operation) {
            case "+":
                System.out.println("Сумма: " + summ);
                break;
            case "-":
                System.out.println("Разность: " + diff);
                break;
            case "*":
                System.out.println("Произведение: " + composition);
                break;
            case "/":
                System.out.println("Частное: " + quotient);
                break;
            default:
                System.out.println("Нет такой операции!");
                break;
        }
    }
}