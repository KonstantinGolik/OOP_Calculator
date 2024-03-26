import java.util.Scanner;
import java.util.logging.Logger;

public class Controller {
    private NumberInput input;
    private PrintResult output;
    private Logic calculator;
    private static final Logger logger = Logger.getLogger(Controller.class.getName());
    public Controller(NumberInput input, PrintResult output, Logic calculator) {
        this.input = input;
        this.output = output;
        this.calculator = calculator;
    }

    public void performOperation(String operation) {
        Scanner scanner = new Scanner(System.in);
        logger.info("Выбрана операция: " + operation);
        ComplexNumber numA = input.readComplexNumber("Введите комплексное число a:");
        ComplexNumber numB = input.readComplexNumber("Введите комплексное число b:");
        ComplexNumber result = null;


        switch (operation) {
            case "add":
                result = calculator.sum(numA, numB);
                break;
            case "subtract":
                result = calculator.subtract(numA, numB);
                break;
            case "multiply":
                result = calculator.multiply(numA, numB);
                break;
            case "divide":
                result = calculator.divide(numA, numB);
                break;
            default:
                logger.warning("Неверная операция: " + operation);
                System.out.println("Неверная операция!");
        }

        if (result != null) {
            output.displayResult(result);
        }

        scanner.close();
    }
}
