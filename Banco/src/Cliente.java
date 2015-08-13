import java.util.Scanner;

public class Cliente {
	
	public String nome;
	public String cpf;
	
	public void ler(){
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Informe o Nome do Cliente:");
		this.nome=tc.next();
		
		System.out.println("Informe o CPF:");
		this.cpf=tc.next();
		
		
	}

}
