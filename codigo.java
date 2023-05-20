import java.util.Scanner;


class CalculoAno {
  
	static int ano;
	
	public static boolean validarAno(){  
		if(ano <= 0){
		return false;
	}
		return true;
    }
	
	
	public static void calendarioJudaico() {
		System.out.printf("O ano convertido  em calendario Judaico e: %d", ano + 3760);
		
	}
	
	public static void calendarioIslamico() {
		System.out.printf("O ano convertido em calendario Islamico e: %d", ano - 579);
		
	}
	public static void main(String args[]){
		
        Scanner lerTeclado = new Scanner(System.in);
		
		int calendario;
		
		System.out.printf("Por favor insira o ano desejado \n");
		ano = lerTeclado.nextInt();
		
		if(validarAno() == false) {
			System.out.printf("ANO INVALIDO!!");
			System.exit(0);
		}
		
		System.out.printf("Por favor escolha um calendario:\n");
		System.out.printf("Digite 1: Judeu\n");
		System.out.printf("Digite 2: Islamico\n");
		calendario = lerTeclado.nextInt();
		
		switch (calendario) {
			case 1:
				calendarioJudaico();
			break;
			
			case 2:
				calendarioIslamico();
			break;
			
			default:
			break;
		}
	}	
}	