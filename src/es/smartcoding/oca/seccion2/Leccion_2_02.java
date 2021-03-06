/**
 * LOS OPERADORES Y LAS ESTRUCTURAS DE CONTROL
 */
package es.smartcoding.oca.seccion2;

/**
 * @author pep
 * 
 *         Los operadores aritméticos binarios
 * 
 *         Recuerda que los operadores + y += están sobrecargados, cuando un operando o más son de tipo cadena actúan como una concatenación donde el resultado es una cadena.
 * 
 *         El operador módulo % calcula el resto de la division de dos números.
 * 
 *         Recuerda las reglas de promoción numéricas:
 * 
 *         1. El de mayor tamaño gana.
 * 
 *         2. Coma flotante gana sobre entero.
 * 
 *         3. byte, short y char SIEMPRE se convierten a int automáticamente.
 * 
 *         4. El resultado de la expresión será del tipo que haya ganado.
 *
 */
public class Leccion_2_02 {

	public static void main(String[] args) {
		
		/*
		 *  Como programador tienes que estar familiarizado con las promociones automaticas de tipo (widening), los cast o conversiones de tipo y la posible pérdida de precision
		 *  en conversiones de valores de tipos mayores a variables con tipos menores. 
		 */
		long l1 = 1;
		int i = (int) (2 * l1); // NO COMPILA, un entero no puede contener un long
		// El mayor entero es 2.147.483.647
		long l2 = 2_147_483_648L;
		byte b1 = 1, b2 = 2;
		int b3 = b1 * b2; // NO COMPILA, hay una promoción automática de byte a int
		int b4 = b1 * b2;
		double f1 = 1.0; // NO COMPILA, 1.0 es un double por defecto
		float f2 = 1; // SI COMPILA, 1 pasa de int a float
		float f3 = 1.0F, f4 = 1.0f;
		f1++;
		System.out.println("f1: " + f1);		

	}

}



















//// La expresion 1 % 0, COMPILA, pero lanza java.lang.ArithmeticException:
//// System.out.println(1 % 0);
//
//// Operador módulo con negativos, tienen en cuenta el signo
//System.out.println("-7 % 3: " + -7 % 3);
//
////  Como en otros lenguajes, la prioridad de los operadores puede modificarse mediante los paréntesis.
//int x = 2 * ((5 + 3) * 4 - 8);
//System.out.println("x: " + x);
//
//// La aritmética decimal no es exacta, si sumamos diez veces 0.1 el resultado debería ser 1.
//double t = 0;
//for (int k = 0; k < 10; k++) {
//	t +=  0.1;
//	System.out.println("t: " + t);
//}		
//System.out.println("t: " + t);
//int big = 1234567890;
//float approx = big;
//System.out.println("big: " + big);
//System.out.println("approx: " + approx);
//System.out.println("errores de conversión: " + (big - (int)approx));
