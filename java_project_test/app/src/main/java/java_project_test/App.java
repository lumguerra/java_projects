package java_project_test;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
    
        Scanner leitor = new Scanner(System.in);
        
        int idade = leitor.nextInt();
        float cotacaoDolar = leitor.nextFloat();
        double cotacaoEuro = leitor.nextDouble();
        
        // Consume the newline character left in the buffer
        leitor.nextLine();
        
        String nome = leitor.nextLine();
        String codigoRua = leitor.next();
        
        System.out.println("texto que sera exibido");
        System.out.print("texto que sera exibido");
        
    }
}
