package semana3;

import java.util.HashMap;
import java.util.Map;

public class Exercicios {
	
//	1.  Dado um array de 20 números inteiros, conte quantos são pares e quantos são ímpares.
	public static void ex1() {
		int[] numeros = new int[20];
		System.out.println("Informe 20 números inteiros: ");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Leitor.nextInt();	
		}
		
		int pares = 0, impares = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (i % 2 == 0) {
				pares++;
			}
			else {
				impares++;
			}
		}
		System.out.printf("\n%d números são pares!\n", pares);
		System.out.printf("\n%d números são ímpares!\n", impares);
    }

//	2.   Leia um array de 10 números e depois pergunte ao usuário um número. 
//	Informe se o número existe no array e em qual posição.
	public static void ex2() {
        int[] numeros = new int[10];
        System.out.println("Digite 10 numeros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Leitor.nextInt();
        }

        System.out.print("Digite um numero para buscar: ");
        int alvo = Leitor.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == alvo) {
                System.out.println("Numero encontrado na posicao " + i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Numero nao encontrado.");
        }
    }
    
//	3.    Leia um array de 10 nomes e permita que o usuário digite um nome para “remover”.
//	Ao remover, substitua o valor por "---".
	public static void ex3() {
        String[] nomes = new String[10];
        System.out.println("Digite 10 nomes:");
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = Leitor.nextLine();
        }

        System.out.print("Digite o nome a remover: ");
        String alvo = Leitor.nextLine();

        boolean removido = false;
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals(alvo)) {
                nomes[i] = "---";
                removido = true;
            }
        }

        if (removido) {
            System.out.println("Nome removido.");
        } else {
            System.out.println("Nome nao encontrado.");
        }

        System.out.println("Lista atualizada:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
	
//	4.    Dado um array de 10 inteiros, conte quantas vezes cada número aparece.
	public static void ex4() {
        int[] numeros = new int[10];
        System.out.println("Digite 10 numeros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Leitor.nextInt();
        }

        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : numeros) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        System.out.println("Frequencia dos numeros:");
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " aparece " + entry.getValue() + " vezes");
        }
    }
	
//	5.     Implemente a ordenação de um array de inteiros usando o algoritmo Bubble Sort.
	public static void ex5() {
        int[] numeros = new int[10];
        System.out.println("Digite 10 numeros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Leitor.nextInt();
        }

        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println("Array ordenado:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
