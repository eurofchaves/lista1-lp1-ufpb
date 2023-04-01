import java.util.Scanner;

public class ClubeDeCampo{
	/** Exercício 5 – ClubeDeCampo
    * Aluno: Euro da Cunha Chaves Filho – Matricula: 20220054786 
    * Aluno: Fernando d’Ávila L.B.C. Filho – Matricula: 20220054820
    */
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int N=5;

		do{

			if(N<1 || N>10)
				System.out.println("Valor inválido!");

			System.out.println("Digite o número de pessoas cadastradas (De 1 até 10): ");
			N = scanner.nextInt();

		}while(N<1 || N>10);

		int ID[] = new int[N];
		float ALT[] = new float[N];

		for(int i=0; i<N; i++){

			System.out.println("Digite a idade do frequentador " + (i+1));
			ID[i] = scanner.nextInt();

			System.out.println("Digite a altura do frequentador" + (i+1));
			ALT[i] = scanner.nextFloat(); 
		}
		scanner.close();

		float somafaixa1=0, somafaixa2=0, somafaixa3=0, somafaixa4=0;
		int contadorfaixa1=0, contadorfaixa2=0, contadorfaixa3=0, contadorfaixa4=0;

		for(int i=0; i<N; i++){

			if(ID[i]<=10){
				somafaixa1+= ALT[i];
				contadorfaixa1+= 1;
			}

			if(ID[i]>=10 && ID[i]<=15){
				somafaixa2+= ALT[i];
				contadorfaixa2+= 1;
			}

			if(ID[i]>=15 && ID[i]<=21){
				somafaixa3+= ALT[i];
				contadorfaixa3+= 1;
			}

			if(ID[i]>21){
				somafaixa4+= ALT[i];
				contadorfaixa4+= 1;
			}

		}

		float mediafaixa1 = somafaixa1/contadorfaixa1;
		float mediafaixa2 = somafaixa2/contadorfaixa2;
		float mediafaixa3 = somafaixa3/contadorfaixa3;
		float mediafaixa4 = somafaixa4/contadorfaixa4;

		if(mediafaixa1 > 0){
			System.out.println("A altura média na faixa 1 vale: " + String.format("%.2f", mediafaixa1));
		}else
			System.out.println("Não há frequentadores na faixa 1");

		if(mediafaixa2 > 0){
			System.out.println("A altura média na faixa 2 vale: " + String.format("%.2f", mediafaixa2));
		}else
			System.out.println("Não há frequentadores na faixa 2");

		if(mediafaixa3 > 0){
			System.out.println("A altura média na faixa 3 vale: " + String.format("%.2f", mediafaixa3));
		}else
			System.out.println("Não há frequentadores na faixa 3");

		if(mediafaixa4 > 0){
			System.out.println("A altura média na faixa 4 vale: " + String.format("%.2f", mediafaixa4));
		}else
			System.out.println("Não há frequentadores na faixa 4");
		
	}
}