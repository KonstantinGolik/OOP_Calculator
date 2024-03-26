import java.util.Scanner;
import java.util.logging.Logger;

public class NumberInput {
    private final Scanner scanner;
    private static final Logger logger = Logger.getLogger(NumberInput.class.getName());
    public NumberInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public ComplexNumber readComplexNumber(String prompt) {
        logger.info("Запрошено ввод комплексного числа: " + prompt);
        System.out.println(prompt);
        System.out.println("Введите действительную часть:");
        double real = scanner.nextDouble();
        System.out.println("Введите мнимую часть:");
        double imaginary = scanner.nextDouble();
        return new ComplexNumber(real, imaginary);
    }
}

