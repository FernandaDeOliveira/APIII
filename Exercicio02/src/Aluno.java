import java.util.Scanner;

public class Aluno {
 public String nome;
 public String dataNasc;
 public String cpf;
 Scanner tc= new Scanner(System.in);
 
 public void ler(){
 	System.out.println("Digite o nome de ");
		this.nome=tc.nextLine();
		System.out.println("Digite o cpf de ");
		
		this.cpf= tc.nextLine();
		System.out.println("Digite o data" );
		
		this.dataNasc= tc.nextLine();
 }
 
 public void mostrar(){
	 System.out.println(this.nome);
	 System.out.println(this.cpf);
	 System.out.println(this.dataNasc);
 }
 
}