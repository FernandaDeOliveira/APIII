import java.util.Scanner;

public class Funcionario extends Aluno {
	
	public double salario;
	
	 Scanner tc= new Scanner(System.in);

	 public void lerSal(){
		 System.out.println("Digite o salario");
			this.salario=tc.nextDouble();
	 }
	 
	 public void mostrarSal(){
		 
		 System.out.println(salario);
		 
	 }
	 
	
	

}
