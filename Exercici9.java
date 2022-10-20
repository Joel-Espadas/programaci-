/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.util.Scanner;

public class Exercici9 {
    private static final String MSG_1 = "Introdueix un nombre entre el 5 i el 50";
    private static final String MSG_2 = "El nombre està dins de l'interval";
    private static final String MSG_3 = "El nombre no està dins de l'interval";
    
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner (System.in);
        
        System.out.println(MSG_1);
        num = sc.nextInt();
        if (num > 5 && num < 50) {
            System.out.println(MSG_2);
        }
        else {
            System.out.println(MSG_3);
        }
    }
    
}
