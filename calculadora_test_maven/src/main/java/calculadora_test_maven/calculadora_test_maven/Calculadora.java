package calculadora_test_maven.calculadora_test_maven;

public class Calculadora {


	public static double calcular(double n1,double n2,String operador) {
		double resultado_operacion = 0.0;
		if (operador != "") {
			try {
				
				switch (operador) {
				case "+":
					resultado_operacion = n1 + n2;
					break;
				case "-":
					resultado_operacion = n1 - n2;
					break;
				case "X":
					resultado_operacion = n1 * n2;
					break;
				case "/":
					resultado_operacion = n1 / n2;
					break;
				}
				 if (Double.isNaN(resultado_operacion)) {
			            throw new ArithmeticException();
			        }
			} catch (ArithmeticException f) {
				resultado_operacion =0;
			}
		}
		if (Double.isInfinite(resultado_operacion)) {
			resultado_operacion = 0;
		}
		return resultado_operacion;
	}
	
	public static double cambiar_signo(double num) {
		return num*-1;
	}

}
