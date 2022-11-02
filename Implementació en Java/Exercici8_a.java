import java.util.Scanner;

/*
Joel
Espadas Almazor
INS Manuel Vázquez Montalbán
28-10-2022
DAW 1
UF1, Programació estructurada
*/

public class Exercici8_a {
    private static final String MSG_1 = "Introdueix un nombre enter: ";

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sc.nextInt();
        while(num != 0) {
            num = sc.nextInt();
        }
    }
}
