package JAVA_ERROR_H_W_2;
////    3. Дан следующий код, исправьте его там, где требуется:
public class JAVA_ERROR_H_W_2_1 {


    public static void main(String[] args) {
        int[] intArray = new int[10];

        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Error! d = 0; You cannot divide any number with 0");
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("The array does not contain an element with this index");
        }
    }


}
