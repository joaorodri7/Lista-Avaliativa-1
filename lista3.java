package com.mycompany.pesquisapopulacional;
import java.util.Scanner;

    public class PesquisaPopulacional {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int totalHabitantes = 0;
        int totalMulheres = 0;
        int totalMulheresCastanhasCastanhas = 0;
        int idade;
        char sexo, corOlhos, corCabelos;
        double salario;
        
        System.out.println("Pesquisa Populacional");
        System.out.println("======================\n");
        
        do {
            System.out.println("Habitante " + (totalHabitantes + 1));
            
            do {
                System.out.print("Sexo (m/f): ");
                sexo = input.next().charAt(0);
            } while (sexo != 'm' && sexo != 'f');
            
            do {
                System.out.print("Cor dos olhos (a/v/c/p): ");
                corOlhos = input.next().charAt(0);
            } while (corOlhos != 'a' && corOlhos != 'v' && corOlhos != 'c' && corOlhos != 'p');
            
            do {
                System.out.print("Cor dos cabelos (l/c/p/r): ");
                corCabelos = input.next().charAt(0);
            } while (corCabelos != 'l' && corCabelos != 'c' && corCabelos != 'p' && corCabelos != 'r');
            
            do {
                System.out.print("Idade (entre 10 e 100 anos, -1 para sair): ");
                idade = input.nextInt();
                if (idade == -1) {
                    break;
                }
            } while (idade < 10 || idade > 100);
            
            if (idade != -1) {
                do {
                    System.out.print("Salário: R$ ");
                    salario = input.nextDouble();
                } while (salario < 0);
                
                if (sexo == 'f' && idade >= 18 && idade <= 35 && corOlhos == 'c' && corCabelos == 'c') {
                    totalMulheresCastanhasCastanhas++;
                }
                
                if (sexo == 'f') {
                    totalMulheres++;
                }
                
                totalHabitantes++;
            }
        } while (idade != -1);
        
        System.out.println("\nResultados da Pesquisa");
        System.out.println("======================\n");
        System.out.printf("Total de habitantes: %d\n", totalHabitantes);
        System.out.printf("Total de mulheres: %d\n", totalMulheres);
        System.out.printf("Porcentagem de mulheres com olhos e cabelos castanhos, entre 18 e 35 anos: %.2f%%\n", (double) totalMulheresCastanhasCastanhas / totalMulheres * 100);
        
        input.close();
    }
}



    
    
    
    
    
    

