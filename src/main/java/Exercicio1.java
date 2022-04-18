public class Exercicio1 {
    public static void main(String[] args) {

        /*
        1. Analise o código abaixo:
        Inteiro A, B, C
        A = 1
        B = 2
        C = A
        D = A + C

        Marque com um X o valor que foi atribuído a variável D?
        ( ) 1
        ( ) 5
        ( ) 4
        (x) 2
        ( ) 3
        */

        int a = 1;
        int b = 2;
        int c = a;
        int d = a + c;


        System.out.println("O valor atribuido a variavel D foi de: " + d);
    }
}

