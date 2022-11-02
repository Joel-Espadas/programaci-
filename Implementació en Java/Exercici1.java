/*
Joel
Espadas Almazor
INS Manuel Vázquez Montalbán
28-10-2022
DAW 1
UF1, Programació estructurada
*/
public class Exercici1 {
    
    private static final String Nom = "Joel";
    private static final String Nom_Cognoms = "Joel Espadas";
    private static final String Nom_Cognom = "Joel \nEspadas";
    
    
    public static void main(String[] args) {
        //apartado a
        System.out.println(Nom);
        //apartado b
        System.out.println(Nom_Cognoms);
        //apartado c
        System.out.println(Nom_Cognom);
        //apartado d
        int i;
        String ast = "*";
        for (i = 0; i < 10; i++) {
            System.out.println("**********");
        }
        //apartado e
        for (i = 0; i < 10; i++) {
            System.out.println(ast);
            ast = ast+ "*";
        }
    }
    
}
