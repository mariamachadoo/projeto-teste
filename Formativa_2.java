package primeiro_projeto;
import java.util.Scanner;
public class Formativa_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variáveis
		Double horatrab,valorhora,salbruto,salliquido,inss;
		 
		//Instanciar classe Scanner
		Scanner ler = new Scanner (System.in);
		
		//Entrada de dados
		System.out.println ("Informe a hora trabalhada: ");
		horatrab = ler.nextDouble();
		
		System.out.println ("Informe o valor da hora: ");
		valorhora = ler.nextDouble();
		
		//Processamento 
		salbruto = horatrab*valorhora;
		inss = salbruto*0.12;
		salliquido = salbruto - inss;
		

		
		//Saída

		System.out.println ("Salário bruto: " + salbruto);
		System.out.println ("Salário líquido: " + salliquido);
		
		

	}

}
