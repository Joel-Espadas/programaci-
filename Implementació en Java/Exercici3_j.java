import java.util.Scanner;

/*
Joel
Espadas Almazor
INS Manuel Vázquez Montalbán
28-10-2022
DAW 1
UF1, Programació estructurada
*/

public class Exercici3_j {
    public static final String MSG_1 = "Introdueix un número: ";

    public static void main(String[] args) {
        float num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_1);
        num1 = sc.nextFloat();
        num2 = sc.nextFloat();
        num3 = sc.nextFloat();
        if(num1 > num2 && num1 > num3){
            System.out.println("El número més gran és: " + num1);
        } else if(num2 > num1 && num2 > num3) {
            System.out.println("El número més gran és: " + num2);
        } else if(num3 > num1 && num3 > num2) {
            System.out.println("El número més gran és: " + num3);
        } else {
            System.out.println("Els números son iguals.");
        }
    }
}
