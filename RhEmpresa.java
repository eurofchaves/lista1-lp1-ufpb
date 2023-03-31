import java.util.Scanner;
import java.util.Arrays; 

public class RhEmpresa {
    /** Exercício 4 – RhEmpresa
    * Aluno: Euro da Cunha Chaves Filho – Matricula: 20220054786 
    * Aluno: Fernando d’Ávila L.B.C. Filho – Matricula: 20220054820
    */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero de funcionarios: ");
        int N = scanner.nextInt();

        String[] nome = new String[N];
        float[] salario = new float[N];

        for(int i=0; i<N; i++){
            System.out.println("Qual o nome do funcionario " + (i+1) + " de " + N + "?");
            nome[i] = scanner.next();

            System.out.println("Qual o salario do funcionario? ");
            salario[i] = scanner.nextInt();
        }

        scanner.close();

        float maior = 0, soma = 0, media;
        for(int i=0; i<N; i++) {
            if(salario[i] > maior){
                maior = salario[i];
            }
            soma = soma + salario[i];
        }
            media = soma/N;


        int j=0, O=0;
        for(int i=0; i<N; i++){
            if(salario[i] == maior){
                 O++;
            }
        }

        String[] maior_salario = new String[O];

        for(int i=0; i<N; i++){
            if(salario[i] == maior){
                maior_salario[j] = nome[i];
                j++;
            }
        }

        int k=0, P=0;
        for(int i=0; i<N; i++){
            if(salario[i] < media){
                 P++;
            }
        }

        String[] abaixo_media = new String[P];

        for(int i=0; i<N; i++){
            if(salario[i] < media){
                abaixo_media[k] = nome[i];
                k++; 
            }
        }


        System.out.println("O maior salario vale " + String.format("%.2f", maior));
        System.out.println("A media salarial vale " + String.format("%.2f", media));
        System.out.println("Funcionario(s) que obtiveram o salario igual ao maior salario observado: " + String.format(Arrays.toString(maior_salario)));
        System.out.println("Funcionario(s) que obtiveram o salario abaixo da media: " + String.format(Arrays.toString(abaixo_media)));
    }
}  