package matrices;

import java.util.Scanner;

public class Ejercicio003 {

    public static void main(String[] args) {
        String[][] Matrix = {{"1a", "1b", "1c", "1d", "1e", "1f", "1g", "1h"}, {"2a", "2b", "2c", "2d", "2e", "2f", "2g", "2h"}, {"3a", "3b", "3c", "3d", "3e", "3f", "3g", "3h"}, {"4a", "4b", "4c", "4d", "4e", "4f", "4g", "4h"}, {"5a", "5b", "5c", "5d", "5e", "5f", "5g", "5h"}, {"6a", "6b", "6c", "6d", "6e", "6f", "6g", "6h"}, {"7a", "7b", "7c", "7d", "7e", "7f", "7g", "7h"}, {"8a", "8b", "8c", "8d", "8e", "8f", "8g", "8h"}};
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("[" + Matrix[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.print("INGRESE UNA POSICION DEL ALFIL: ");
        System.out.println("");
        Scanner Entrada = new Scanner(System.in);
        String dato = Entrada.nextLine();
        System.out.print("Las posiciones posibles son: ");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (Matrix[i][j].equals(dato)) {
                    int ais = i, bis = j, aif = i, bif = j, adi = i, bdi = j;
                    //Para el lado izquierdo superior del punto
                    while (ais > 0 && bis > 0) {
                        ais -= 1;
                        bis -= 1;
                        System.out.print("," + Matrix[ais][bis]);
                    }
                    //Para el lado izquierdo inferior
                    while (aif < 8 && bif > 0) {
                        aif += 1;
                        bif -= 1;
                        System.out.print(","+Matrix[aif][bif]);
                    }
                    
                    //Para el lado derecho superior
                    while (i > 0 && j < 8) {
                        i -= 1;
                        j += 1;
                        System.out.print(","+Matrix[i][j]);
                    }
                    //Para el lado derecho inferior
                    while (adi < 8 && bdi < 8) {
                        adi += 1;
                        bdi += 1;
                        System.out.print(","+Matrix[adi][bdi]);
                    }
                }
            }
        }
        System.out.println("");
        System.out.println("");

    }
}
