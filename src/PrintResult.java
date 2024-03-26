import java.util.logging.Logger;

public class PrintResult {
    private static final Logger logger = Logger.getLogger(PrintResult.class.getName());
    public void displayResult(ComplexNumber result) {
        logger.info("Вывод результата: " + result.getReal() + " + " + result.getImaginary() + "i");
        System.out.println("Результат: " + result.getReal() + " + " + result.getImaginary() + "i");
    }
}
