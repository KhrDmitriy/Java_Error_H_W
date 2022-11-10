package JAVA_ERROR_H_W_2;

import java.util.Scanner;

//
//  Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//  Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
//
public class JAVA_ERROR_H_W_2_3 {
    public static void main(String[] args) {
        emptyLine();
    }
    public static void emptyLine(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the line ");
        String str1 = in.nextLine();
        if(str1.isEmpty()) System.out.println("String is empty");               // проверка на пустую строку
        System.out.println(str1);
    }
}
