import com.classes.CleaningStaff;
import com.classes.Employee;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	//Iniciando uma lista de empregados.
	ArrayList<Employee> empregados = new ArrayList<Employee>();

	public static void main(String[] args) {

		//Métodos static precisam de uma instância da própria classe para acessar o conteúdo fora dela.
		Main m = new Main();
		m.empregados.add(new CleaningStaff("Jockas", "Masculino", 23, 1930.0)); //Adicionando um funcionário à lista.

		Scanner scanner = new Scanner(System.in);
		int start;

        do {
			System.out.println("=======================================================================");
			System.out.println("Bem Vindo! Você está entrando ao Hall de comando do Hotel JOCKASPLAYS!");
			System.out.println("=======================================================================");
			System.out.println("Escolha as opções de comando a seguir!");
			System.out.println("=======================================================================");
            System.out.println("Selecione uma opção:");
            System.out.println("1. Criar ID para funcionário novo");
            System.out.println("2. Comandar funções de Funcionários");
			System.out.println("3. Ver os funcionários do sistema");
			System.out.println("4. Registrar um novo cliente em alguns dos quartos");
            System.out.println("5. Sair");
			System.out.println("=======================================================================");

            start = scanner.nextInt();

            switch (start) {
                case 1:
                    System.out.println("Você irá criar uma nova ID de Funcionário!");
					System.out.println("=======================================================================");
                    break;
                case 2:
                    System.out.println("Você irá designar funções para funcionários");
					System.out.println("=======================================================================");
                    break;
				case 3:
					System.out.println("Irá ver os funcionários a seguir");
					System.out.println("=======================================================================");
					break;
                case 4:
                    System.out.println("Colocar um novo cliente no sistema de quartos");
					System.out.println("=======================================================================");
                    break;
				case 5:
					System.out.println("O programa irá encerrar");
					System.out.println("=======================================================================");
					break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
					System.out.println("=======================================================================");
                    break;
            }

        } while (start != 5);

        scanner.close();

		System.out.println(m.empregados.get(0).toString()); //Printando todas as informações com um só método.
	}
}