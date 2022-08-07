public class DebugExample {
    public static void main(String[] args) {
        int firstNumber = 11;
        int secondNumber = 22;

        System.out.println(firstNumber);
        System.out.println(secondNumber);

        if (firstNumber > secondNumber) {
            System.out.println("jeden jest wieksze niz dwa wyswietl wynik");
            subtractAndDisplay(firstNumber, secondNumber);
        } else {
            System.out.println("jesli dwa jest wieksze niz jeden zsumuj wynik");
            sumAndDisplay(firstNumber, secondNumber);
        }
    }

    private static void sumAndDisplay(int a, int b) {
        int result = a + b;

        System.out.println(result);
    }

    private static void subtractAndDisplay(int a, int b) {
        int result = a - b;

        System.out.println(result);
    }
}