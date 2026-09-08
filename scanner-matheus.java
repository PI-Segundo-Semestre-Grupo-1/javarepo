package school.sptech;

import java.util.Scanner;

public class ScannerMatheus {
    static void main() {

        System.out.println("===============================================");
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();
        System.out.println("==================================================");

        System.out.println("Selecione seu Perfil de Acesso (1 - Admin | 2 - Técnico): ");
        Integer perfil = leitor.nextInt();
        leitor.nextLine();
        System.out.println("==================================================");

        System.out.println("Digite seu login: ");
        String loginInserido = leitor.nextLine();
        System.out.println("==================================================");

        System.out.println("Digite sua senha: ");
        String senhaInserida = leitor.nextLine();
        System.out.println("==================================================");

        if (perfil == 1) {
            System.out.println("Olá " + nome + "! Acesso liberado como Administrador.");
        } else {
            System.out.println("Olá " + nome + "! Acesso liberado como Técnico de Monitoramento.");
        }

        System.out.println("==================================================");

        System.out.println("Registros Capturados!");
        System.out.println("Login inserido: " + loginInserido);
        System.out.println("Senha inserida: " + senhaInserida);
        System.out.println("Perfil selecionado: " + (perfil == 1 ? "Admin" : "Técnico"));
        System.out.println("--------------------------------------------------");


    }
}