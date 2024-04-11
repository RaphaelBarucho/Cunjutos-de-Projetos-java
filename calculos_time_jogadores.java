package trim1;
import java.util.Scanner;
public class calculos_time_jogadores {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        int idade, tot_f = 0, tot_m = 0, soma1 = 0, cont_m1 = 0, cont_m2 = 0, cont_f1 = 0;
        double media_idade = 0, perc = 0;
        String sexo, exp;
        int menor_idade = 0; 

        System.out.println("Digite a idade: ");
        idade = input.nextInt();

        while (idade != 0) {
            System.out.println("Digite o sexo (M/F): ");
            sexo = input.next();
            System.out.println("Digite a experiência (S/N): ");
            exp = input.next();

            if (sexo.equals("F") && exp.equals("S")) {
                if (tot_f == 0) {
                    menor_idade = idade;
                    tot_f = 1;
                } else if (idade < menor_idade) {
                    menor_idade = idade;
                }
                tot_f++;
            }

            if (sexo.equals("M")) {
                tot_m++;
                if (idade > 45) {
                    cont_m1++;
                }
            }

            if (sexo.equals("M") && exp.equals("S")) {
                soma1 += idade;
                cont_m2++;
            }

            if (sexo.equals("F") && idade < 21 && exp.equals("S")) {
                cont_f1++;
            }

            System.out.println("Digite a idade: ");
            idade = input.nextInt();
        }

        System.out.println("Total de mulheres: " + (tot_f - 1)); 
        System.out.println("Total de homens: " + tot_m);

        if (cont_m2 == 0) {
            System.out.println("Nenhum homem com experiência");
        } else {
            media_idade = (double) soma1 / cont_m2;
            System.out.println("Média de idade dos homens com experiência: " + media_idade);
        }

        if (tot_m == 0) {
            System.out.println("Nenhum homem");
        } else {
            perc = (double) cont_m1 * 100 / tot_m;
            System.out.println("Porcentagem de homens com mais de 45 anos: " + perc + "%");
        }

        System.out.println("Total de mulheres com menos de 21 anos e com experiência: " + cont_f1);
        System.out.println("Menor idade das mulheres com experiência: " + menor_idade);
        
        input.close(); 
		    }
		}
