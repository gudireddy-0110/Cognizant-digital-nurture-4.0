public class OperatorPrecedence {
    public static void main(String[] args) {
        int result = 10 + 5 * 2;
        System.out.println("Result of 10 + 5 * 2: " + result); // 20 due to precedence

        int anotherResult = (10 + 5) * 2;
        System.out.println("Result of (10 + 5) * 2: " + anotherResult); // 30
    }
}
