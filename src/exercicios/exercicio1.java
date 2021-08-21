package exercicios; 

public class exercicio1 { 

	public static void main(String[] args) { 
		System.out.println(recursiveMethod(-15)); // 0 
		System.out.println(recursiveMethod(0));   // 0 
		System.out.println(recursiveMethod(3));   //0 + 1 + 2 = 3 
		System.out.println(recursiveMethod(5));   //0 + 1 + 2 + 3 + 4 = 10  
	} 

	//A condi��o de parada � o numero recebico chegar a zero  
	public static int recursiveMethod(int numero) { 
		if (numero < 0) return 0; 

		if (numero > 0) { 
			//Enquanto o numero n�o chegar a 0 a fun��o ser� chamada subtraindo 1 do par�metro. 
			return numero-1 + recursiveMethod(numero-1);
		} 
		return 0; 
	} 

} 