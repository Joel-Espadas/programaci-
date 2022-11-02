import java.util.Scanner;

/*
Joel
Espadas Almazor
INS Manuel Vázquez Montalbán
28-10-2022
DAW 1
UF1, Programació estructurada
*/

public class Exercici8_b {
    private static final String MSG_1 = "Digues quants números vols introduir: ";
    private static final String MSG_2 = "Has d'introduir 3 números: ";
    private static final String MSG_3 = "Introdueix un número: ";
    private static final String MSG_4 = "Gràcies per utilitzar aquest programa: ";

    public static void main(String[] args) {
        int num, quantitat, i= 1;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        quantitat = sc.nextInt();
        System.out.println(MSG_2 + quantitat + " números");
        num = sc.nextInt();
        System.out.println(MSG_3);
        while(i < quantitat) {
            i++;
            num = sc.nextInt();
            if(quantitat == i){
                break;
            }
            System.out.println(MSG_3);
        }
        System.out.println(MSG_4);
    }
}
