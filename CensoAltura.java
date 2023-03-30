/** Exercício censo altura – classe
    * Aluno: Euro da Cunha Chaves Filho – Matricula: 20220054786 
    * Aluno: Fernando d’Ávila L.B.C. Filho – Matricula: 20220054820
    */


import java.util.Scanner;

public class CensoAltura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        double maiorAltura = 0;
        double menorAltura = Double.MAX_VALUE;
        double mediaAlturaF = 0;
        double mediaAlturaM = 0;
        int numMulheres = 0;
        int numHomens = 0;

         
        for (int i = 1; i <= 20; i++) {
            System.out.print("Informe a altura da pessoa " + i + ": ");
            double altura = sc.nextDouble();
            System.out.print("Informe o sexo da pessoa " + i + " (M/F): "); // só funciona com M e F em maiusculo.
            char sexo = sc.next().charAt(0);

             
            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
            if (altura < menorAltura) {
                menorAltura = altura;
            }

             
            if (sexo == 'F') {
                mediaAlturaF += altura;
                numMulheres++;
            } else if (sexo == 'M') {
                mediaAlturaM += altura;
                numHomens++;
            }
        }

         
        mediaAlturaF /= numMulheres;
        mediaAlturaM /= numHomens;
 
        double porcentagemF = (double) numMulheres / 20 * 100;
        double porcentagemM = (double) numHomens / 20 * 100;

        
        System.out.println("Maior altura: " + maiorAltura);
        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Média das alturas das mulheres: " + mediaAlturaF);
        System.out.println("Média das alturas dos homens: " + mediaAlturaM);
        System.out.println("Número de mulheres: " + numMulheres);
        System.out.println("Número de homens: " + numHomens);
        System.out.println("Porcentagem de mulheres: " + porcentagemF + "%");
        System.out.println("Porcentagem de homens: " + porcentagemM + "%");
    }
}
