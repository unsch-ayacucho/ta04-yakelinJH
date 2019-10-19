package matrices;

public class Ejercicio001 {

    public static void main(String[] args) {
        int matriz_unica [][] = new int [6][10];
        //LLENANDO LA MATRIZ
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++){
                matriz_unica[i][j] = (int)(Math.random()*100);
            }
        }
        //IMPRIMIENDO LA MATRIZ
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++){
                System.out.print("["+matriz_unica[i][j]+"]");
            }
            System.out.println("");
        }
        //UBICANDO EL NUMERO MAYOR Y MENOR  EN LA MATRIZ
        int mayor = 0, menor = 100;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                if(mayor < matriz_unica[i][j]){
                    mayor = matriz_unica[i][j];
                }
                if(menor > matriz_unica[i][j]){
                    menor = matriz_unica[i][j];
                }
            }
        }
        //ENCNTRANDO LA POSICION DEL NUMERO MAYOR Y MENOR
        System.out.println(mayor +" " + menor);
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                if(mayor == matriz_unica[i][j]){
                    System.out.println("EL MAYOR SE ENCUENTRA EN LA POSICION ["+i+"]"+"["+j+"]");
                }
                if(menor == matriz_unica[i][j]){
                    System.out.println("EL MENOR SE ENCUENTRA EN LA POSICION ["+i+"]"+"["+j+"]");
                }
            }
        }
    }
}
