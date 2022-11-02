import java.util.Scanner;

/*
Joel
Espadas Almazor
INS Manuel Vázquez Montalbán
28-10-2022
DAW 1
UF1, Programació estructurada
*/

public class Exercici6_b {
    private static final String MSG_1 = "Introdueix un any: ";
    private static final String MSG_2 = "Introdueix un mes: ";

    public static void main(String[] args) {
        int mes, any, resultatCase;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        any = sc.nextInt();
        System.out.println(MSG_2);
        mes = sc.nextInt();

        if (mes % 2 == 0){
            if (mes == 2){
                if (any % 4 == 0){
                    resultatCase = 2;
                } else
                    resultatCase = 1;
            } else
                resultatCase = 3;
        } else {
            resultatCase = 4;
        }switch (resultatCase) {
            case 1:
                System.out.println("\n" + "El mes té 28 dies");
                break;
            case 2:
                System.out.println("\n" + "El mes té 29 dies");
                break;
            case 3:
                System.out.println("\n" + "El mes té 30 dies");
                break;
            case 4:
                System.out.println("\n" + "El mes té 31 dies");
                break;
        }
    }
}
