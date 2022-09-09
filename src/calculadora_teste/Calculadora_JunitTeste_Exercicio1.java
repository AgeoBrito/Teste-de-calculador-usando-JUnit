
package calculadora_teste;

import org.junit.jupiter.api.Test;
import junit.framework.Assert;
public class Calculadora_JunitTeste_Exercicio1 {

   
    
   @SuppressWarnings("deprecation")
public static void main(String[] args) { 
	   
        
        
        System.out.println("---------------- Soma --------------");
        Soma calc = new Soma(); // Setar classe para calculos
        int somar; // variavel
       
       
         
        somar = calc.Soma(3, 7);
        System.out.println(somar); // Teste 1# Somando dois valores.
        
         somar = calc.Soma(3, 0);
        System.out.println(somar); // Teste 2# Somando dois valores porém com um numero 0.
        
        somar = calc.Soma(0, 0);
        System.out.println(somar); // Teste 3# Somando dois valores ambos sendo 0.
        
         somar = calc.Soma(3, -1);
        System.out.println(somar); // Teste 4# Somando dois valores porem um número negativo.
                
        System.out.println("---------------- Subtração --------------");
        //--------------------------------------------------------------------------------
        
        Subtração subtrair = new Subtração();    
        int sub;
        
         sub = subtrair.Subtração(3, 7);
        System.out.println(sub); // Teste 1# Subtraindo dois valores.
        
         sub = subtrair.Subtração(3, 0);
        System.out.println(sub); // Teste 2# Subtraindo dois valores porém com um numero 0.
        
        sub = subtrair.Subtração(0, 0);
        System.out.println(sub); // Teste 3# Subtraindo dois valores ambos sendo 0.
        
         sub = subtrair.Subtração(3, -1);
        System.out.println(sub); // Teste 4# Subtraindo dois valores porem um número negativo.
        
        System.out.println("---------------- Multiplicação --------------");
        //--------------------------------------------------------------------------------------
        
        Multiplicação multiplicar = new Multiplicação();
        int mult;
        
         mult = multiplicar.Multiplicação(3, 7);
        System.out.println(mult); // Teste 1# Multiplicando dois valores.
        
         mult = multiplicar.Multiplicação(3, 0);
        System.out.println(mult); // Teste 2# Multiplicando dois valores porém com um numero 0.
        
        mult = multiplicar.Multiplicação(0, 0);
        System.out.println(mult); // Teste 3# Multiplicando dois valores ambos sendo 0.
        
         mult = multiplicar.Multiplicação(3, -1);
        System.out.println(mult); // Teste 4# Multiplicando dois valores porem um número negativo.
        
        System.out.println("---------------- Divisão --------------");
        //--------------------------------------------------------------------------------------
        
        Divisão dividir = new Divisão();
        float div;
        
         div = dividir.Divisão(3, 7);
        System.out.println(div); // Teste 1# Didivir dois valores.
        
         div = dividir.Divisão(3, 0);
        System.out.println(div); // Teste 2# Didivir dois valores porém com um numero 0.
        
        div = dividir.Divisão(0, 0);
        System.out.println(div); // Teste 3# Didivir dois valores ambos sendo 0.
        
         div = dividir.Divisão(3, -1);
        System.out.println(div); // Teste 4# Didivir dois valores porem um número negativo.
    }
  
    
}
