package school.sptech;
import java.util.Scanner;

public class scannerIsabelle {

    static void main() {
        System.out.println("----------------");
        Scanner lalala = new Scanner(System.in);
        System.out.println("Entre com seu nome de usuário:");
        System.out.println("----------------");
        String usuario = lalala.nextLine();
        System.out.println("----------------");
        System.out.println("Entre com sua senha:(6 dígitos)");
        System.out.println("----------------");
        String senha = lalala.nextLine();
        System.out.println("----------------");
        System.out.println(" Olá " + usuario + " Você foi cadastrado com sucesso!");

        lalala.close();
    }
}