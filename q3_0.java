package Matriz;

import java.util.Scanner;

public class q3_0 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int aux=0,maior=0,menor=0;
		System.out.println("quantos alunos");
		final int TAM=entrada.nextInt();
		int matriz[][]=new int[TAM][2];
		int[] media= new int [TAM];
		int[] soma= new int [TAM];
		String[] aluno= new String [TAM];
		String a=" ",b=" ";
		String[] mediacada= new String [TAM];
		int[] mediaca= new int [TAM];
		
		for(int i =0; i<TAM;i++) {
			System.out.println("preencha o nome do aluno " +(1+i));
			aluno[i]=entrada.nextLine();
			System.out.println("Preencha com as notas");
			for(int j =0; j<TAM;j++) {
				System.out.println("nota " +(1+i));
				matriz[i][j]=entrada.nextInt();
				
				
				if(i==0&&j==0) {
					maior=matriz[i][j];
					a=aluno[i];
					menor=matriz[i][j];
					b=aluno[i];

				}else if (matriz[i][j]>maior) {
						maior=matriz[i][j];
						a=aluno[i];
				}else if(matriz[i][j]<menor) {
					menor=matriz[i][j];
					b=aluno[i];
				}
				aux+=matriz[i][j];
			}
			soma[i]=aux;
			media[i]=aux/TAM;
			aux=0;
		}	
		for(int i =0; i<TAM;i++) {
			mediaca[i]=soma[i];
		}
		
	}

}
