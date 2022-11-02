import java.util.Scanner;

/*
Joel
Espadas Almazor
INS Manuel Vázquez Montalbán
28-10-2022
DAW 1
UF1, Programació estructurada
*/

public class Exercici3_l {
    private static final String MSG_1 = "Introdueix el número de litres: ";

    public static void main(String[] args) {
        float num1;
        int fixa = 6;
        double total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sc.nextFloat();
        if(num1 <= 50){
            System.out.println("La quota a pagar és: " + fixa);
        } else if (num1 >= 50 && num1 <= 200) {
            total = (num1 * 0.1) + fixa;
            System.out.println("La quota a pagar és: " + total);
        } else if (num1 > 200){
            total = (num1 * 0.3) + fixa;
            System.out.println("La quota a pagar és: " + total);
        }
    }
}
