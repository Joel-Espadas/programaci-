import java.util.Scanner;

/*
Joel
Espadas Almazor
INS Manuel Vázquez Montalbán
28-10-2022
DAW 1
UF1, Programació estructurada
*/

public class Projecte1 {

    private static final String MSG_1 = "Introdueix el teu ID: ";
    private static final String MSG_2 = "Introdueix la teva edat: ";
    private static final String MSG_3 = "Indica el tipus de venda: ";
    private static final String MSG_4 = "Indica l'import de la compra";
    private static final String MSG_5 = "Introdueix el número de telèfon";
    private static final String MSG_6 = "Error en les dades introduïdes.";
    private static final String MSG_7 = "Programa finalitzat per l'error en les dades";
    private static final String MSG_8 = "ID  EDAT  TIPUS  IMPORT  TELÈFON";
    private static final String MSG_9 = "Introdueix les teves dades";
    private static final String MSG_10 = "Venda lliure";
    private static final String MSG_11 = "Pensionista";
    private static final String MSG_12 = "Carnet jove";
    private static final String MSG_13 = "Soci";
    private static final String TYPE_0 = "Lliure";
    private static final String TYPE_1 = "Pensionista";
    private static final String TYPE_2 = "Carnet";
    private static final String TYPE_3 = "Soci";
    private static final int MINID = 111;
    private static final int MAXID = 999;
    private static final int MINEDAT = 14;
    private static final int MAXEDAT = 120;
    private static final int MINVENDA = 0;
    private static final int MAXVENDA = 1000;
    private static final int TLF = 9;

    public static void main(String[] args) {
        int id = 0, edat = 0, tipus, tlf = 0, num = 0, venda = 0, telefon = 0, i = 0;
        boolean valorCorrecte = false, exit = false;
        String resultat = "";
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_9);
        System.out.println(MSG_1);
        do {
            valorCorrecte = sc.hasNextInt();
            if (valorCorrecte) {
                id = sc.nextInt();
                if (id >= MINID && id <= MAXID) {
                    exit = true;
                } else {
                    System.out.println(MSG_6);
                    i++;
                }
            } else {
                sc.next();
                System.out.println(MSG_6);
                i++;
            }
            if (i == 3) {
                exit = true;
            }
        } while (exit != true);
        if (i == 3) {
            System.out.println(MSG_7);
        } else {
            System.out.println(MSG_2);
            exit = false;
            i = 0;
            do {
                valorCorrecte = sc.hasNext();
                if (valorCorrecte) {
                    edat = sc.nextInt();
                    if (edat >= MINEDAT && edat <= MAXEDAT) {
                        exit = true;
                    } else {
                        System.out.println(MSG_6);
                        i++;
                    }
                } else {
                    sc.next();
                    System.out.println(MSG_6);
                    i++;
                }
                if (i == 3) {
                    exit = true;
                }
            } while (exit != true);
            if (i == 3) {
                System.out.println(MSG_7);
            } else {
                System.out.println(MSG_3);
                exit = false;
                i = 0;
                do {
                    valorCorrecte = sc.hasNextInt();
                    if (valorCorrecte) {
                        tipus = sc.nextInt();
                        switch (tipus) {
                            case 0:
                                System.out.println(MSG_10);
                                resultat = TYPE_0;
                                exit = true;
                                break;
                            case 1:
                                System.out.println(MSG_11);
                                resultat = TYPE_1;
                                exit = true;
                                break;
                            case 2:
                                System.out.println(MSG_12);
                                resultat = TYPE_2;
                                exit = true;
                                break;
                            case 3:
                                System.out.println(MSG_13);
                                resultat = TYPE_3;
                                exit = true;
                                break;
                            default:
                                i++;
                                System.out.println(MSG_6);
                                break;
                        }
                    } else {
                        sc.next();
                        System.out.println(MSG_6);
                        i++;
                    }
                    if (i == 3) {
                        exit = true;
                    }
                } while (exit != true);
                if (i == 3) {
                    System.out.println(MSG_7);
                } else {
                    System.out.println("\n" + MSG_4);
                    exit = false;
                    i = 0;
                    do {
                        valorCorrecte = sc.hasNextInt();
                        if (valorCorrecte) {
                            venda = sc.nextInt();
                            if (venda >= MINVENDA && venda <= MAXVENDA) {
                                exit = true;
                            } else {
                                System.out.println(MSG_6);
                                i++;
                            }
                        } else {
                            sc.next();
                            System.out.println(MSG_6);
                            i++;
                        }
                        if (i == 3) {
                            exit = true;
                        }
                    } while (exit != true);
                    if (i == 3) {
                        System.out.println(MSG_7);
                    } else {
                        System.out.println("\n" + MSG_5);
                        exit = false;
                        i = 0;
                        do {
                            tlf = 0;
                            num = 0;
                            valorCorrecte = sc.hasNextInt();
                            if (valorCorrecte) {
                                telefon = sc.nextInt();
                                tlf = tlf + telefon;
                                while (telefon != 0) {
                                    telefon = (telefon / 10);
                                    num = num + 1;
                                }
                                if (num == TLF) {
                                    exit = true;
                                } else {
                                    System.out.println(MSG_6);
                                    i++;
                                }
                            } else {
                                sc.next();
                                System.out.println(MSG_6);
                                i++;
                            }
                            if (i == 3) {
                                exit = true;
                            }
                        } while (exit != true);
                        if (i == 3) {
                            System.out.println(MSG_7);
                        } else {
                            System.out.println("\n" + MSG_8);
                            System.out.println(id + "  " + edat + "  " + resultat + "  " + venda + "  " + tlf);
                        }
                    }
                }

            }

        }
    }
}