import java.util.Scanner;
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

        for(int i=0; i< N; i++){
            System.out.println("Qual o nome do funcionario " + (i+1) + " de " + N + "?");
            nome[i] = scanner.next();

            System.out.println("Qual o salario do funcionario? ");
            salario[i] = scanner.nextInt();
        }

        scanner.close();

        float maior_salario = 0, soma = 0, media;
        for(int i=0; i<N; i++) {
            if(salario[i] > maior_salario){
                maior_salario = salario[i];
            }
            soma = soma + salario[i];
        }

        media = soma/N;

        System.out.println("O maior salario vale " + String.format("%.2f", maior_salario));
        System.out.println("A media salarial vale " + String.format("%.2f", media));


        System.out.println("Funcionarios que obtiveram o maior salario: ");
        for(int i=0; i<N; i++) {
            if (salario[i] == maior_salario) {
                System.out.println (nome[i]);
            }
        }

        System.out.println("Funcionarios que obtiveram o salario menor que a media: ");
        for(int i=0; i<N; i++){
            if(salario[i] < media){
                System.out.println(nome[i]);
            }
        }
    }
}