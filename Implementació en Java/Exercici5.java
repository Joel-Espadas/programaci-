import java.util.Scanner;

/*
Joel
Espadas Almazor
INS Manuel Vázquez Montalbán
28-10-2022
DAW 1
UF1, Programació estructurada
*/

public class Exercici5 {
    private static final String MSG_1 = "Introdueix un any: ";

    public static void main(String[] args) {
        int any;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        any = sc.nextInt();
        if ((any % 4 == 0) && ((any % 100 != 0) || (any % 400 == 0))){
            System.out.println("El any es traspàs");
        } else {
            System.out.println("El any no és de traspàs");
        }
    }
}
