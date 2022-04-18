
import java.util.Arrays;
import java.util.List;

public class Exercicio2 {
    public static void main(String[] args) {

/*      2. Escreva um algoritmo (pseudocódigo ou fluxograma) para achar o maior valor da seguinte lista de inteiros:

        var list = new List<int>() { 1, 3, 2, 8, 9, 15, 41, 12, 1, 17, 28 };

        REPRESENTAÇÃO EM PSEUDOCÓDIGO:

        inteiro highernumber = 0;

        para (inteiro updatedList : list) faça
            se (updatedList > highernumber) então
                highernumber = updtaedNumberList;
                fimse
        fimse
        fim_algoritmo
*/

        //EXERCÍCIO NA LINGUGAGEM JAVA:

        List<Integer> numberList = Arrays.asList(1, 3, 2, 8, 9, 15, 41, 12, 1, 17, 28);

        int highernumber = 0;

        for(Integer updtaedNumberList : numberList){
            if(updtaedNumberList > highernumber){
                highernumber = updtaedNumberList;
            }
        }
        System.out.println("O maior numero e: " + highernumber);
    }
}

