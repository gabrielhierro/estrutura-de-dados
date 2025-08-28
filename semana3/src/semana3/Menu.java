package semana3;

public class Menu {
	public static void exibir() {
        boolean executando = true;
        while (executando) {
            System.out.println("1) Contar pares/impares");
            System.out.println("2) Buscar numero no array");
            System.out.println("3) Remover nome (substituir por ---)");
            System.out.println("4) Contar frequencias");
            System.out.println("5) Bubble Sort");
            System.out.println("0) Sair");
            System.out.print("Escolha: ");
            int op = Leitor.nextInt();
            System.out.println();

            switch (op) {
                case 1 -> Exercicios.ex1();
                case 2 -> Exercicios.ex2();
                case 3 -> Exercicios.ex3();
                case 4 -> Exercicios.ex4();
                case 5 -> Exercicios.ex5();
                case 0 -> executando = false;
                default -> System.out.println("Opcao invalida");
            }
            System.out.println();
        }
    }
}	
