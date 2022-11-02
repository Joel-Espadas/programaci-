import java.util.Scanner;

/*
Joel
Espadas Almazor
INS Manuel Vázquez Montalbán
28-10-2022
DAW 1
UF1, Programació estructurada
*/

public class Exercici3_g {
    private static final String MSG_1 = "Introdueix un número";

    public static void main(String[] args) {
        float num;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sc.nextFloat();
            if(num % 2 == 0) {
                System.out.println("El número és parell");
            }else {
                System.out.println("El número és senar");
            }
    }
}
