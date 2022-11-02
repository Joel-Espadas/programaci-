import java.util.Scanner;

/*
Joel
Espadas Almazor
INS Manuel Vázquez Montalbán
28-10-2022
DAW 1
UF1, Programació estructurada
*/

public class Exercici3_c {
    private static final String MSG_1 = "Introdueix un nombre: ";
    private static final String MSG_2 = "El nombre és positiu i menor que 100.";
    private static final String MSG_3 = "El nombre no és positiu ni menor que 100.";
    private static final Integer MAX = 100;

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sc.nextInt();
        if (num > 0 && num < MAX) {
            System.out.println(MSG_2);
        }else {
            System.out.println(MSG_3);
        }
    }
}
