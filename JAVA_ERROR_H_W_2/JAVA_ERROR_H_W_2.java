package JAVA_ERROR_H_W_2;

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает
// введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
// необходимо повторно запросить у пользователя ввод данных.
import java.util.InputMismatchException;
import java.util.Scanner;




public class JAVA_ERROR_H_W_2 {
    public static void main(String[] args) {
        numFloat();
    }
    public static void numFloat(){
        try{
            Scanner sc = new Scanner(System.in);
            float num;
            System.out.println("Input num");
            num = sc.nextFloat();
            System.out.println("ОНО " + num);

        }
        catch (InputMismatchException exc){
            System.out.println("НЕВЕРНО!!! Попробуйте ввести вещественное число еще раз");
        }
        return num;
    }

}