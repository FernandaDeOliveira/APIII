import java.util.Scanner;

public class ContaCorrente {
	

	public Cliente titular;
	public int numero;
	public int agencia;
	public int senha;
	public double saldo;
	
	public void lerConta(){
		Scanner tc = new Scanner(System.in);

		System.out.println("Informe o numero da conta");
		this.numero=tc.nextInt();
		
		System.out.println("Informe o numero da Agencia");
		this.agencia=tc.nextInt();
		
		System.out.println("Informe a senha:");
		this.senha=tc.nextInt();
		
		System.out.println("Informe o saldo");
		this.saldo=tc.nextDouble();
		
		System.out.println("Informe o titular da conta:");
		
	}

}
