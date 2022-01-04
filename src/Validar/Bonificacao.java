package Validar;

import java.util.ArrayList;
import java.util.Scanner;


public class Bonificacao {

	private double salario;
	private ArrayList<String>funcionario = new ArrayList<String>();
	

public double getSalario() {
		return salario;
	}

public void setSalario(double salario) {
	this.salario = salario;
}


public String getfuncionarios(int index) {
	return funcionario.get(index);
}
	public void Funcionarios() {
		
		funcionario.add("amanda");
		funcionario.add("josé");
		
		
	}
	
	public double salarioLiquido() {
		return salario + bonificacao() ;
		
	}
	
	public double bonificacao() {
		
		if (salario <= 1000) {
			return salario * 0.2;
		} else if ((salario > 1000) && (salario < 2000)){
			return salario *0.1;
		}else if (salario > 2000) {
			return salario * -0.1;
		}
		return salario;
	
	}
}
