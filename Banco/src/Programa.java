import java.util.Scanner;

public class Programa {
	
	
	public static void main(String[] args) {
		
		int opc;
		
		Scanner tc = new Scanner(System.in);

		
		System.out.println("Digite:1- cadastrar conta.\n 2- Efetuar Deposito:\n 3- Efetuar Saque: \n 4- Efetuar Tranferencia:\n");
		opc=tc.nextInt();
		do{
		switch(opc){
		
		case 1:{
			ContaCorrente c1 = new ContaCorrente();
			c1.lerConta();
			c1.mostrarConta();
		}
		case 2:{
			
		}
		}
		
	}while(opc!=0);

}
}
