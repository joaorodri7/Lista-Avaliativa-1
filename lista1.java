package com.mycompany.listaprojeto1;

import java.util.Scanner;

public class Listaprojeto1 {

    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);

      System.out.print("Digite o número de carros vendidos: ");
      int numCarros = sc.nextInt();

      System.out.print("Digite o valor total de vendas: ");
      double valorVendas = sc.nextDouble();

      System.out.print("Digite o salário fixo: ");
      double salarioFixo = sc.nextDouble();

      System.out.print("Digite o valor da comissão por carro vendido: ");
      double comissaoPorCarro = sc.nextDouble();

      double salarioFinal = salarioFixo + (comissaoPorCarro * numCarros) + (valorVendas * 0.05);
      
      System.out.printf("Salário final: R$ %.2f", salarioFinal);

      
   }
    
}



