package matrices;

import java.util.Scanner;

public class Ejercicio002 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[5][6];
        int dato;
        //COLOCANDO DATOS A LA MATRIZ
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                //DATOS PARA LA MATRIZ 4X5
                if (i < 4 && j < 5) {
                    System.out.print("Ingrese un numero para la posicion [" + i + "]" + "[" + j + "] :");
                    dato = entrada.nextInt();
                    matriz[i][j] = dato;
                    System.out.println("");
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        int F0 = 0, F1 = 0, F2 = 0, F3 = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 && j < 5) {
                    F0 = F0 + matriz[i][j];
                }
                if (i == 0 && j == 5) {
                    matriz[i][j] = F0;
                }
                if (i == 1 && j < 5) {
                    F1 = F1 + matriz[i][j];
                }
                if (i == 1 && j == 5) {
                    matriz[i][j] = F1;
                }
                if (i == 2 && j < 5) {
                    F2 = F2 + matriz[i][j];
                }
                if (i == 2 && j == 5) {
                    matriz[i][j] = F2;
                }
                if (i == 3 && j < 5) {
                    F3 = F3 + matriz[i][j];
                }
                if (i == 3 && j == 5) {
                    matriz[i][j] = F3;
                }
            }

        }
        int C0 = 0, C1 = 0, C2 = 0, C3 = 0, C4 = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                if (j == 0 && i < 4) {
                    C0 = C0 + matriz[i][j];
                }
                if (i == 4 && j == 0) {
                    matriz[i][j] = C0;
                }
                if (j == 1 && i < 4) {
                    C1 = C1 + matriz[i][j];
                }
                if (j == 1 && i == 4) {
                    matriz[i][j] = C1;
                }
                if (j == 2 && i < 4) {
                    C2 = C2 + matriz[i][j];
                }
                if (j == 2 && i == 4) {
                    matriz[i][j] = C2;
                }
                if (j == 3 && i < 4) {
                    C3 = C3 + matriz[i][j];
                }
                if (j == 3 && i == 4) {
                    matriz[i][j] = C3;
                }
                if (j == 4 && i < 4) {
                    C4 = C4 + matriz[i][j];
                }
                if (j == 4 && i == 4) {
                    matriz[i][j] = C4;
                }
            }

        }

        int sumat = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 5 && j < 5) {
                    sumat += matriz[i][j];
                }
                if (j == 5 && i < 5) {
                    sumat += matriz[i][j];
                }
                if (i == 4 && j == 5) {
                    matriz[i][j] = sumat;

                }
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
