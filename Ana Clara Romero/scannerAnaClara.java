package school.sptech;
import java.util.Scanner;

public class scannerAnaClara {

    static void main() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("Digite seu login de acesso ao sistema de monitoramento: ");
        String login = leitor.nextLine();


        System.out.println("Digite sua senha: ");
        String senha = leitor.nextLine();

        System.out.println("-----------------------------------------------");

        if (login.equals("AnaClara@magnasync") && senha.equals("1234")) {
            System.out.println("Bem-vindo " + nome + "! Acesso liberado ao sistema de monitoramento das máquinas de ressonância magnética.");
        } else {
            System.out.println("Olá " + nome + "! Login ou senha inválidos, acesso negado.");
        }

        System.out.println("\nDados do Login!");
        System.out.println("Técnico: " + nome);
        System.out.println("Login: " + login);
        System.out.println("Senha: " + senha);

    }
}