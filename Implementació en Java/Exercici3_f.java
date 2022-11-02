import java.util.Scanner;

/*
Joel
Espadas Almazor
INS Manuel Vázquez Montalbán
28-10-2022
DAW 1
UF1, Programació estructurada
*/

public class Exercici3_f {
    private static final String MSG_1 = "Introdueix el primer nombre: ";
    private static final String MSG_2 = "Introdueix el segon nombre: ";
    private static final String MSG_3 = "El mòdul és menor que 15.";
    private static final String MSG_4 = "El mòdul  no és menor que 15.";

    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sc.nextInt();
        System.out.println(MSG_2);
        num2 = sc.nextInt();
        if(num1 < 0) {
            num1 = num1 * -1;
        }
        if(num2 < 0) {
            num2 = num2 * -1;
        }
        if(num1 / num2 < 15) {
            System.out.println(MSG_3);
        }else {
            System.out.println(MSG_4);
        }
    }
}
