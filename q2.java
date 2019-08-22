package Matriz;

import java.util.Scanner;

public class q2 {

	


		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			int tamanho=0;
			boolean verdadeiro=true;
			int aux=0,maior=0,menor=0,a=0,b=0;
			
			final int TAM=5;
			int matriz[][]=new int[TAM][TAM];
			int[] media= new int [TAM];
			int[] soma= new int [TAM];
			
			
			for(int i =0; i<TAM;i++) {
				System.out.println("preencha  os valores das lojas " +(1+i));
				for(int j =0; j<TAM;j++) {
						 
					matriz[i][j]=entrada.nextInt();
					
					
					if(i==0&&j==0) {
						maior=matriz[i][j];
						a=i;
						menor=matriz[i][j];
						b=i;

					}else if (matriz[i][j]>maior) {
							maior=matriz[i][j];
							a=i;
					}else if(matriz[i][j]<menor) {
						menor=matriz[i][j];
						b=i;
					}
					aux+=matriz[i][j];
				}
				soma[i]=aux;
				media[i]=aux/TAM;
				aux=0;
			}		
			
			for(int i =0; i<TAM;i++) {
				System.out.println("loja "+(i+1));
				for(int j =0; j<TAM;j++) {
					
					System.out.println("Preço item"+(j+1)+"  R$"+ matriz[i][j]+",00 ");
				}
				System.out.println();
			}
			System.out.println("A soma dos peodutos ficou");
			for(int i =0; i<TAM;i++) {
				
				System.out.println("loja "+(i+1)+"  R$"+ soma[i]+",00 ");
			}
			System.out.println("medias das lojas ficou");
			for(int i =0; i<TAM;i++) {
				
				System.out.println("media loja "+(i+1)+"  R$"+ media[i]+",00 ");
			}
			System.out.println("loja mais cara e a loja"+(a)+"  R$"+ maior+",00 ");
			System.out.println("loja mais barata e a loja"+(b)+"  R$"+ menor+",00 ");
			entrada.close();

		}

	}

