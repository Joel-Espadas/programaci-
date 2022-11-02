import java.util.Scanner;

/*
Joel
Espadas Almazor
INS Manuel Vázquez Montalbán
28-10-2022
DAW 1
UF1, Programació estructurada
*/

public class Exercici11 {
    private static final String MSG_1 = "Introdueix un nombre: ";

    public static void main(String[] args) {
        int num, cont = 0, sum= 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num = sc.nextInt();

        while(true) {
            if(sum+cont > num){
                break;
            }
            cont++;
            sum += cont;
            System.out.print(cont + ",");

        }
        System.out.println("\nSuma total: " + sum);
    }
}
