import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            String input = scanner.nextLine();
            System.out.println(calc(input));
        }
    }

    public static String calc(String input) {

        if (input.contains("I") || input.contains("V") || input.contains("X")) {
            try {
                return Operation.operationRom(input);
            } catch (MyException e) {
                throw new RuntimeException(e);
            }

        } else {
            try {
                return String.valueOf(Operation.operationArab(input));
            } catch (MyException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
