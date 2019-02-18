import java.util.Scanner;

public class Masculino {
    
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		
		float altura,peso,imc;
		System.out.println("Digite sua Altura:");
		 altura = a.nextFloat();
		System.out.println("Digite seo Peso:");
		 peso = a.nextFloat(); 
		 
		imc = peso/(altura * altura);
		System.out.println("IMC:" + imc);
		
		if (imc <= 18.5) {
			   System.out.println("Resultado: " + imc + " - Classificação Magreza"); 
		   } else if ((imc > 18.5) && (imc <= 25)) {
			   System.out.println("Resultado: " + imc + " - Classificação Saudável");  
		   
		   } else if ((imc > 25) && (imc <= 30)) {
			   System.out.println("Resultado: " + imc + " - Classificação Sobrepeso");
		   
		   } else if ((imc > 30) && (imc <= 35)) {
			   System.out.println("Resultado: " + imc + " - Classificação Obesidade Grau I");
		   
		   } else if ((imc > 35) && (imc <= 40)) {
			   System.out.println("Resultado: " + imc + " - Classificação Obesidade Grau II (severa)");
		   
		   } else if (imc > 40) {
			   System.out.println("Resultado: " + imc + " - Classificação Obesidade Grau III (morbida)");
		   }
     }
		
		
		
	}

