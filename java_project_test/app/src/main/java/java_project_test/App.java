package java_project_test;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        double preco_custo = 0.0f;
        double preco_venda = 0.0f;
        String nome_produto = "null";
        
        Scanner leitor = new Scanner(System.in);
        
        for(int i = 1; i <= 40; ++i){
            
            System.out.println("ÇDigite o nome do produto: ");
            nome_produto = leitor.next();
            
            System.out.println("Digite o preco do produto: ");
            preco_custo = leitor.nextDouble();
            
            System.out.println("Digite o preco de venda: ");
            preco_custo = leitor.nextDouble();
            
            double diferenca_valor = preco_venda - preco_custo;
            
            if(diferenca_valor > 0){
                System.out.println("Valor positivo");
            } else if (diferenca_valor < 0) {
                System.out.println("Valor negativo");
            }else{
                System.out.println("empate entre custo e venda");
            }                             
        }   
    }
}
