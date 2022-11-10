package JAVA_ERROR_H_W_2;
////    2. Если необходимо, исправьте данный код:
public class JAVA_ERROR_H_W_2_2 {
    public static void main(String[] args) {

        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);

            printSum(3, 227);

            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (ArithmeticException ex) {
            System.out.println("Нельзя делить на ноль");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
