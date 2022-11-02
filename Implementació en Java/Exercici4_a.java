import java.util.Scanner;

/*
Joel
Espadas Almazor
INS Manuel Vázquez Montalbán
28-10-2022
DAW 1
UF1, Programació estructurada
*/

public class Exercici4_a {
    private static final String MSG_1 = "Introdueix el mes: ";
    private static final String MSG_2 = "Introdueix un nombre de l'1 al 12: ";
    private static final int MIN = 1;
    private static final int MAX = 12;

    public static void main(String[] args) {
        float num;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sc.nextFloat();
        if (num < MIN || num > MAX) {
            System.out.println(MSG_2);
        }
        if(num == 1){
            System.out.println("Gener");
        } else if (num == 2) {
            System.out.println("Febrer");
        } else if (num == 3){
            System.out.println("Març");
        } else if (num == 4){
            System.out.println("Abril");
        } else if (num == 5) {
            System.out.println("Maig");
        } else if (num == 6){
            System.out.println("Juny");
        } else if (num == 7){
            System.out.println("Juliol");
        } else if (num == 8) {
            System.out.println("Agost");
        } else if (num == 9){
            System.out.println("Setembre");
        } else if (num == 10){
            System.out.println("Octubre");
        } else if (num == 11) {
            System.out.println("Novembre");
        } else if (num == 12){
            System.out.println("Decembre");
        }
    }
}
