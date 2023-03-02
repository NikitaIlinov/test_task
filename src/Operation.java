public class Operation {

    public static int numberOne = 0;
    public static int numberTw0 = 0;

    public static int operationArab(String input) throws MyException {

        String[] numbers = input.split(" ");
        if (numbers.length != 3){
            throw new MyException("Ошибка: строка не является математической операцией");
        }
        numberOne = Integer.parseInt(numbers[0]);
        numberTw0 = Integer.parseInt(numbers[2]);
        int result = 0;

        if (numberOne >= 1 && numberOne <= 10 && numberTw0 >= 1 && numberTw0 <= 10) {
            switch (numbers[1]) {
                case "*" -> {
                    result = numberOne * numberTw0;
                    return (result);
                }
                case "+" -> {
                    result = numberOne + numberTw0;
                    return (result);
                }
                case "-" -> {
                    result = numberOne - numberTw0;
                    return (result);
                }
                case "/" -> {
                    result = numberOne / numberTw0;
                    return (result);
                }
                default -> {
                    throw new MyException("Ошибка: формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                }
            }
        } else throw new MyException("Ошибка: формат чисел не удовлетворяет заданию");
    }

    public static String operationRom(String input) throws MyException {

        String[] numbers = input.split(" ");
        if (numbers.length != 3){
            throw new MyException("Ошибка: строка не является математической операцией");
        }
        numberOne = convert(numbers[0]);
        numberTw0 = convert(numbers[2]);
        int result = 0;

        if (numberOne >= 1 && numberOne <= 10 && numberTw0 >= 1 && numberTw0 <= 10) {

            switch (numbers[1]) {
                case "*" -> {
                    result = numberOne * numberTw0;
                }
                case "+" -> {
                    result = numberOne + numberTw0;
                }
                case "-" -> {
                    result = numberOne - numberTw0;
                }
                case "/" -> {
                    result = numberOne / numberTw0;
                }
                default -> {
                    throw new MyException("Ошибка: формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                }
            }
        } else {
            throw new MyException("Ошибка: формат чисел не удовлетворяет заданию");
        }
        if (result <= 0) {
            throw new MyException("Ошибка: римские числа не могут быть отрицательными");
        } else {
            return IntegerToRomanNumeral(result);
        }
    }

    public static int convert(String a) {

        if (a.equals("I")) return 1;
        if (a.equals("II")) return 2;
        if (a.equals("III")) return 3;
        if (a.equals("IV")) return 4;
        if (a.equals("V")) return 5;
        if (a.equals("VI")) return 6;
        if (a.equals("VII")) return 7;
        if (a.equals("VIII")) return 8;
        if (a.equals("IX")) return 9;
        if (a.equals("X")) return 10;
        return 0;
    }

    public static String IntegerToRomanNumeral(int input) {

        StringBuilder s = new StringBuilder();
        while (input >= 100) {
            s.append("C");
            input -= 100;
        }
        while (input >= 90) {
            s.append("XC");
            input -= 90;
        }
        while (input >= 50) {
            s.append("L");
            input -= 50;
        }
        while (input >= 40) {
            s.append("XL");
            input -= 40;
        }
        while (input >= 10) {
            s.append("X");
            input -= 10;
        }
        while (input >= 9) {
            s.append("IX");
            input -= 9;
        }
        while (input >= 5) {
            s.append("V");
            input -= 5;
        }
        while (input >= 4) {
            s.append("IV");
            input -= 4;
        }
        while (input >= 1) {
            s.append("I");
            input -= 1;
        }
        return s.toString();
    }
}

