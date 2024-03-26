import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        NumberInput input = new NumberInput(scanner);
        PrintResult output = new PrintResult();
        Logic calculator = new CalculatComplexNumber();
        Controller presenter = new Controller (input, output, calculator);

        logger.info("Программа запущена");

        System.out.println("Выберите операцию (add, subtract, multiply, divide):");
        String operation = scanner.nextLine();

        presenter.performOperation(operation);

        scanner.close();

        logger.info("Программа завершена");
    }
}