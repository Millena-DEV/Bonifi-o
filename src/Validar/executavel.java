package Validar;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;

public class executavel {

	public static void main(String[] args) {
		
	
		
		
		Bonificacao sc = new Bonificacao();
		sc.Funcionarios();
	    System.out.println(sc.getfuncionarios(1));
	
		sc.setSalario(800);
		System.out.println("Salario " + sc.getSalario());
		System.out.println("Bonus: "+sc.bonificacao());
		System.out.println("salario liquido " + sc.salarioLiquido());
		
	}

}
