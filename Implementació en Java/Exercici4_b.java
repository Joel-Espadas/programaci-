import java.util.Scanner;

/*
Joel
Espadas Almazor
INS Manuel Vázquez Montalbán
28-10-2022
DAW 1
UF1, Programació estructurada
*/

public class Exercici4_b {
    private static final String MSG_1 = "Introdueix el mes: ";
    private static final String MSG_2 = "Introdueix un nombre d l'1 al 12: ";
    private static final int MIN = 1;
    private static final int MAX = 12;

    public static void main(String[] args) {
        int mes;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        mes = sc.nextInt();
        if (mes < MIN || mes > MAX) {
            System.out.println(MSG_2);
        }switch (mes) {
            case 1:
                System.out.println("Gener");
                break;
            case 2:
                System.out.println("Febrer");
                break;
            case 3:
                System.out.println("Març");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maig");
                break;
            case 6:
                System.out.println("Juny");
                break;
            case 7:
                System.out.println("Juliol");
                break;
            case 8:
                System.out.println("Agost");
                break;
            case 9:
                System.out.println("Setembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Novembre");
                break;
            case 12:
                System.out.println("Decembre");
                break;
        }
    }
}
