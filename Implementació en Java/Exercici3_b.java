import java.util.Scanner;

/*
Joel
Espadas Almazor
INS Manuel Vázquez Montalbán
28-10-2022
DAW 1
UF1, Programació estructurada
*/

public class Exercici3_b {

    private static final String MSG_1 = "Introdueix un nombre: ";
    private static final String MSG_2 = "El nombre és més gran que 35.";
    private static final String MSG_3 = "El nombre no és més gran que 35.";
    private static final Integer MAX = 35;

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sc.nextInt();
        if (num > MAX) {
            System.out.println(MSG_2);
        }else {
            System.out.println(MSG_3);
        }

    }
}
