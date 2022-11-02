import java.util.Scanner;

/*
Joel
Espadas Almazor
INS Manuel Vázquez Montalbán
28-10-2022
DAW 1
UF1, Programació estructurada
*/

public class Exercici9 {
    private static final String MSG_1 = "Introdueix números fins que s'introdueixi un 0: ";
    private static final String MSG_2 = "La mitjana dels números introduïts és: ";

    public static void main(String[] args) {
        int num, suma = 0, quantitat = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sc.nextInt();
        while(num != 0) {
            quantitat = quantitat + 1;
            suma = suma + num;
            num = sc.nextInt();
        }
        System.out.println(MSG_2 + (suma / quantitat));
    }
}
