package trim1;
import java.util.Scanner;
public class idades_media {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int somaIdades = 0;
        int contador = 0;
        
        while (true) {
            System.out.print("Digite uma idade (ou 0 para sair): ");
            int idade = sc.nextInt();
            
            if (idade == 0) {
                break; 
            }
            
            somaIdades += idade;
            contador++;
        }
        
        if (contador == 0) {
            System.out.println("Nenhuma idade foi digitada.");
        } else {
            double media = (double) somaIdades / contador;
            System.out.println("A média das idades digitadas é: " + media);
        }
        
        sc.close();
	}

}
