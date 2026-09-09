package school.sptech;

import java.util.Scanner;

public class ScannerInicial {


    static void main() {

        System.out.println("===============================================");
        Scanner usuario = new Scanner(System.in);
        Scanner login = new Scanner(System.in);
        Scanner senha = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = usuario.nextLine();
        System.out.println("==================================================");

        System.out.println("Digite seu login: ");
        String loginInserido = login.nextLine();
        System.out.println("==================================================");

        System.out.println("Digite sua senha: ");
        String senhaInserida = senha.nextLine();
        System.out.println("==================================================");
        System.out.println("Olá " + nome);
        System.out.println("==================================================");
        System.out.println("Registros Capturados!");
        System.out.println("Login inserido: " + loginInserido);
        System.out.println("Senha inserida: " + senhaInserida);
        System.out.println("--------------------------------------------------");
    }
}
