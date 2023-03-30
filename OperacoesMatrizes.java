import java.util.Scanner;
public class OperacoesMatrizes {
    /** Exercício 7 – OperacoesMatrizes
    * Aluno: Euro da Cunha Chaves Filho – Matricula: 20220054786 
    * Aluno: Fernando d’Ávila L.B.C. Filho – Matricula: 20220054820
    */
    public static void main(String args[]) {

        int i, j;

        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        for(i = 0; i < 4; i++){
            for(j = 0; j < 4; j++){
                System.out.println("Linha" + i + "Coluna" + j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("A matriz digitada foi: ");

        for(i = 0; i < 4; i++){
            for(j = 0; j < 4; j++){
                System.out.print(matriz [i][j]);
            }
            System.out.println();
        }

        double MediaAbaixoDiagonal = MediaAbaixoDiagonal(matriz);
        System.out.println("A media abaixo da diagonal principal vale: " + String.format("%.2f", MediaAbaixoDiagonal));

        int SomaAcimaDiagonal = SomaAcimaDiagonal(matriz);
        System.out.println("A soma acima da diagonal principal vale: " + SomaAcimaDiagonal);

        double MediaDiagonalPrincipal = MediaDiagonalPrincipal(matriz);
        System.out.println("A media da diagonal principal vale: " + String.format("%.2f", MediaDiagonalPrincipal));

        int MenorElemento = MenorElemento(matriz);
        System.out.println("O menor elemento da matriz vale: " + MenorElemento);

        int SomaElementos = SomaElementos(matriz);
        System.out.println("A soma dos elementos da matriz vale: " + SomaElementos);

    }

    public static double MediaAbaixoDiagonal(int[][] matriz){

        int i, j;
        double soma=0, contador=0;

        for(i=0; i < 4; i++){
            for(j=0; j<4; j++){
                if(i>j){
                soma = soma + matriz[i][j];
                contador = contador + 1;
                }
            }
        }

        return soma/contador;
    }

    public static int SomaAcimaDiagonal(int[][] matriz){

        int i, j;
        int soma = 0;

        for(i=0; i<4; i++){
            for(j=0; j<4; j++){
                if(i<j)
                    soma = soma + matriz [i][j];
            }
        }

        return soma;
    }

    public static double MediaDiagonalPrincipal(int[][] matriz){

        int i, j;
        double soma = 0, contador = 0;

        for(i=0; i<4; i++){
            for(j=0; j<4; j++){
                if(i == j)
                    soma = soma + matriz[i][j];
            }
            contador = contador + 1;
        }

        return soma/contador;
    }

    public static int MenorElemento(int[][] matriz){

        int i, j;
        int menor = 100000;

        for(i=0; i<4; i++){
            for(j=0; j<4; j++){
                if(matriz[i][j] < menor)
                    menor = matriz[i][j];
            }
        }

        return menor;
    }

    public static int SomaElementos(int[][] matriz){

        int i, j;
        int soma = 0;

        for(i=0; i<4; i++){
            for(j=0; j<4; j++){
                soma = soma + matriz[i][j];
            }
        }

        return soma;
    }

}