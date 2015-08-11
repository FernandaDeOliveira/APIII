import java.util.Scanner;

public class TestaAluno {


	public static void main(String[] args) {
		Aluno a = new Aluno();
		Aluno b= new Aluno();
		
		Funcionario c = new Funcionario();
		
		c.lerSal();
		c.mostrarSal();
	
		c.ler();
		a.ler();
		b.ler();
	
		
		a.mostrar();
		b.mostrar();
	}

}