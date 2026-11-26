/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author johao
 */
public class Ejemplo064 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        boolean bandera = true;
        String pais;
        String capital;
        int vueltas = 0;

        String cadena_final = "Los paises y sus capitales son:\n";

        while (bandera == true) { // true == true
            System.out.println("Estoy en el ciclo"); //estoy en el ciclo

            System.out.println("Ingrese el pais.");
            pais = entrada.nextLine();

            System.out.println("Ingrese la capital.");
            capital = entrada.nextLine();

            cadena_final = String.format("%s%s\t%s\n",
                    cadena_final, pais, capital);

            String salir;

            System.out.println("Desea salir del ciclo, ingrese si.");
            salir = entrada.nextLine();

            vueltas = vueltas + 1;
            if (salir.equals("si")) {
                bandera = false;
            }
        }
        System.out.printf("%s\nTotal paises ingresados: %d\n",
                cadena_final,
                vueltas);
    }
}
/*
Estamos generando un ciclo que genera una pregunta cada vez que se desea salir o
no del mismo
 */
