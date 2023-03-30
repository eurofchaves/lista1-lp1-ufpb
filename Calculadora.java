import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = -1;
        int n;

        while (opcao != 0) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Dobro");
            System.out.println("2 - Triplo");
            System.out.println("3 - Metade");
            System.out.println("4 - Quadrado");
            System.out.println("5 - Cubo");
            System.out.println("6 - Raiz Quadrada");
            System.out.println("7 - Raiz Cúbica");
            System.out.println("8 - Módulo");
            System.out.println("9 - Inverso");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            if (opcao != 0) {
                System.out.print("Digite um número inteiro: ");
                n = sc.nextInt();

                switch (opcao) {
                    case 1:
                         
                        System.out.println("O dobro de " + n + " é " + (2 * n));
                        break;
                    case 2:
                         
                        System.out.println("O triplo de " + n + " é " + (3 * n));
                        break;
                    case 3:
                         
                        System.out.println("A metade de " + n + " é " + (n / 2));
                        break;
                    case 4:
                         
                        System.out.println("O quadrado de " + n + " é " + (n * n));
                        break;
                    case 5:
                         
                        System.out.println("O cubo de " + n + " é " + (n * n * n));
                        break;
                    case 6:
                        
                        System.out.println("A raiz quadrada de " + n + " é " + Math.sqrt(n));
                        break;
                    case 7:
                         
                        System.out.println("A raiz cúbica de " + n + " é " + Math.cbrt(n));
                        break;
                    case 8:
                       
                        System.out.println("O módulo de " + n + " é " + Math.abs(n));
                        break;
                    case 9:
                       
                        if (n != 0) {
                            System.out.println("O inverso de " + n + " é " + (1.0 / n));
                        } else {
                            System.out.println("Não é possível calcular o inverso de zero!");
                        }
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
                System.out.println();
            }
        }

        System.out.println("Programa encerrado!");
        sc.close();
    }
}
     

     