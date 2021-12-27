package lesson1;

public class Main {

    public static void main(String[] args) throws Exception {

            ScannerAsk scannerAsk = new ScannerAsk();
            int number = scannerAsk.checkIsNotNumber();
            ClassWithExceptions withExceptions = new ClassWithExceptions();

                try {
                    System.out.println(withExceptions.callExceptions(number));
                } catch (Exception_2 e) {
                    e.printStackTrace();
                } catch (Exception_1 e) {
                    e.printStackTrace();
                } finally {
                    System.out.println("Произведение числа на самого себя: " + number * number);
                }
                System.out.println("Я выполняюсь.");
    }
}

