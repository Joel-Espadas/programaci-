import java.util.Scanner;

/*
Joel
Espadas Almazor
INS Manuel Vázquez Montalbán
28-10-2022
DAW 1
UF1, Programació estructurada
*/

public class Exercici3_k {
    private static final String MSG_1 = "Introdueix dos números i primer el més gran: ";

    public static void main(String[] args) {
        float num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sc.nextFloat();
        num2 = sc.nextFloat();
        if(num1 % num2 == 0){
            System.out.println("El valor introduït és múltiple");
        } else {
            System.out.println("El valor introduït no és múltiple");
        }
    }
}
