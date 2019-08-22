package Matriz;

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int tamanho=0;
		boolean verdadeiro=true;
		int media=0,maior=0,menor=0,par=0,impar=0,diagonal=0,diagonalS=0;
		while (verdadeiro) {
			System.out.println("qual o tamanho da matriz quadrada");
			tamanho=entrada.nextInt();
			if(tamanho>=3&&tamanho<=11) {
				verdadeiro=false;
			}else {verdadeiro=true;}
		}
		final int TAM=tamanho;
		int matriz[][]=new int[TAM][TAM];
		
		System.out.println("preencha a matriz");
		for(int i =0; i<TAM;i++) {
			for(int j =0; j<TAM;j++) {
					 
				matriz[i][j]=entrada.nextInt();
				media=media+matriz[i][j];
				
				if(i==0&&j==0) {
					maior=matriz[i][j];
					menor=matriz[i][j];

				}else if (matriz[i][j]>maior) {
						maior=matriz[i][j];
				}else if(matriz[i][j]<menor) {
					menor=matriz[i][j];
				}
				if(matriz[i][j]%2==0) {
					par=par+1;
				}else {impar=impar+1;}

			}
			
		}
		for(int i =0; i<TAM;i++) {
			for(int j =0; j<TAM;j++) {
				if(i==j) {
					diagonal=diagonal+=matriz[i][j];	
				}
			if(i==TAM-1-j) {
					diagonalS=matriz[i][j]+diagonalS;
				}
			}
			}
		int soma=media;
		media=media/(TAM*TAM);
		for(int i =0; i<TAM;i++) {
			for(int j =0; j<TAM;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("");
		System.out.println("soma = "+soma);
		System.out.println("media = "+media);
		System.out.println("soma diagonal P= " + diagonal);
		System.out.println("soma diagonal S= " + diagonalS);
		System.out.println("Maior valor= "+maior);
		System.out.println("menor valor= "+menor);
		System.out.println("quantidade pares= "+par);
		System.out.println("quantidade impar= "+impar);
		entrada.close();
	}

}
