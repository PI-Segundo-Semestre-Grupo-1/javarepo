package school.sptech;
import java.util.Scanner;

public class scannerJoaoMiguel {

    static void main() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("Digite o código da máquina monitorada: ");
        String codigoMaquina = leitor.nextLine();

        System.out.println("A máquina está com temperatura normal? (Sim/Não): ");
        String status = leitor.nextLine();

        System.out.println("==================================================");

        if (status.equalsIgnoreCase("Sim")) {
            System.out.println("Olá " + nome + "! Máquina " + codigoMaquina + " operando normalmente.");
        } else if (status.equalsIgnoreCase("Não")){
            System.out.println("Alerta " + nome + "! Máquina " + codigoMaquina + " com temperatura fora do normal.");
        } else {
            System.out.println("Resposta sobre a temperatura invalida");
        }

        System.out.println("==================================================");

        System.out.println("Registros Capturados!");
        System.out.println("Técnico: " + nome);
        System.out.println("Máquina: " + codigoMaquina);
        System.out.println("Status: " + status);

    }
}