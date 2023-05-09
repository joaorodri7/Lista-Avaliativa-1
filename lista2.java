package com.mycompany.listaprojeto2;
import java.util.Scanner;


    public class Listaprojeto2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        enum Prato {VEGETARIANO, PEIXE, FRANGO, CARNE};
        enum Sobremesa {ABACAXI, SORVETE_DIET, MOUSE_DIET, MOUSE_CHOCOLATE};
        enum Bebida {CHA, SUCO_DE_LARANJA, SUCO_DE_MELAO, REFRIGERANTE_DIET};

        int[] caloriasPratos = {180, 230, 250, 350};
        int[] caloriasSobremesas = {75, 110, 170, 200};
        int[] caloriasBebidas = {20, 70, 100, 65};

        System.out.println("Escolha seu prato:");
        for (Prato prato : Prato.values()) {
            System.out.println(prato.ordinal() + 1 + " - " + prato);
        }
        int escolhaPrato = scanner.nextInt();

        System.out.println("Escolha sua sobremesa:");
        for (Sobremesa sobremesa : Sobremesa.values()) {
            System.out.println(sobremesa.ordinal() + 1 + " - " + sobremesa);
        }
        int escolhaSobremesa = scanner.nextInt();

        System.out.println("Escolha sua bebida:");
        for (Bebida bebida : Bebida.values()) {
            System.out.println(bebida.ordinal() + 1 + " - " + bebida);
        }
        int escolhaBebida = scanner.nextInt();

        int caloriasTotais = caloriasPratos[escolhaPrato - 1] + caloriasSobremesas[escolhaSobremesa - 1] + caloriasBebidas[escolhaBebida - 1];

        System.out.println("A quantidade total de calorias da sua refeição é: " + caloriasTotais + " calorias.");

        scanner.close();
    }
}
