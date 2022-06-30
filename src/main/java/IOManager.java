import java.util.Scanner;

public class IOManager {
    private final Scanner scanner = new Scanner(System.in);

    public int readFunctionNumber() {
        System.out.println("Интерполяция кубическими сплайнами.");
        int number = 0;
        boolean correct = false;
        while (!correct) {
            System.out.println("Выберите функцицю:");
            System.out.println("[1]: " + Data.FUNCTIONS[0].getStringFunction());
            System.out.println("[2]: " + Data.FUNCTIONS[1].getStringFunction());
            System.out.println("[3]: " + Data.FUNCTIONS[2].getStringFunction());
            try {
                number = Integer.parseInt(scanner.nextLine());
                if (number >= 1 && number <= 3) correct = true;
                else throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                System.out.println("Введено неверное значение.");
            }
        }
        return number;
    }

    public int readNoise() {
        int number = 0;
        boolean correct = false;
        while (!correct) {
            System.out.println("Добавить шум?");
            System.out.println("[1]: да");
            System.out.println("[2]: нет");
            try {
                number = Integer.parseInt(scanner.nextLine());
                if (number >= 1 && number <= 2) correct = true;
                else throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                System.out.println("Введено неверное значение.");
            }
        }
        return number;
    }

    public int readNumberOfValues() {
        int number = 0;
        boolean correct = false;
        while (!correct) {
            System.out.println("Введите количество значений.");
            try {
                number = Integer.parseInt(scanner.nextLine());
                if (number >= 1) correct = true;
                else throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                System.out.println("Введено неверное значение.");
            }
        }
        return number;
    }

    public double[] readValues(int n) {
        System.out.println("Введите значения Х.");
        double[] values = new double[n];
        boolean correct;
        double number;
        for (int i = 0; i < n; i++) {
            correct = false;
            while (!correct) {
                try {
                    number = Double.parseDouble(scanner.nextLine());
                    correct = true;
                    values[i] = number;
                } catch (NumberFormatException e) {
                    System.out.println("Введено неверное значение.");
                }
            }
        }
        return values;
    }
    
}

