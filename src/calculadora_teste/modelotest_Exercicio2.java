package calculadora_teste;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class modelotest_Exercicio2 {
	@SuppressWarnings("deprecation")
	@Test
	public void JunitSomar() {
		Soma calc = new Soma(); // Setar classe para calculos
		int somar = 0; // variavel para calculos
		
		somar = calc.Soma(3, 7); //Teste 1# Somando dois valores
		Assert.assertEquals(10, somar);
		
		somar = calc.Soma(3, 0);  // Teste 2# Somando dois valores porém com um numero 0.
		Assert.assertEquals(3, somar);
		
        somar = calc.Soma(0, 0);  // Teste 3# Somando dois valores ambos sendo 0.
        Assert.assertEquals(0, somar);
        
        somar = calc.Soma(3, -1); // Teste 4# Somando dois valores porem um número negativo.
        Assert.assertEquals(2, somar);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void JunitSubtrair() {
		Subtração subtrair = new Subtração();    
        int sub;
        
        sub = subtrair.Subtração(3, 7); // Teste 1# Subtraindo dois valores.
        Assert.assertEquals(-4, sub);
        
        sub = subtrair.Subtração(3, 0); // Teste 2# Subtraindo dois valores porém com um numero 0.
        Assert.assertEquals(3, sub);
        
        sub = subtrair.Subtração(0, 0);  // Teste 3# Subtraindo dois valores ambos sendo 0.
        Assert.assertEquals(0, sub);
        
        sub = subtrair.Subtração(3, -1); // Teste 4# Subtraindo dois valores porem um número negativo.
        Assert.assertEquals(4, sub);
			
	}
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void JunitMultiplicar() {
	     Multiplicação multiplicar = new Multiplicação();
	     int mult;
	        
	     mult = multiplicar.Multiplicação(3, 7); // Teste 1# Multiplicando dois valores.
	     Assert.assertEquals(21, mult);
	     
	     mult = multiplicar.Multiplicação(3, 0); // Teste 2# Multiplicando dois valores porém com um numero 0.
	     Assert.assertEquals(0, mult);
	     
	     mult = multiplicar.Multiplicação(0, 0); // Teste 3# Multiplicando dois valores ambos sendo 0.
	     Assert.assertEquals(0, mult);
	     
	     mult = multiplicar.Multiplicação(3, -1); // Teste 4# Multiplicando dois valores porem um número negativo.
	     Assert.assertEquals(-3, mult);
	     
}
	@SuppressWarnings("deprecation")
	@Test
	public void JunitDividir() {
		Divisão dividir = new Divisão();
        double div;
        
        div = dividir.Divisão(9, 3); // Teste 1# Didivir dois valores.
        Assert.assertEquals(3.0, div);
        
       /* div = dividir.Divisão(3, 0);   Teste 2# Didivir dois valores porém com um numero 0.
        Assert.assertEquals('Infinity', div);*/  // Teste inexecutavel 
        
       /* div = dividir.Divisão(0, 0);    Teste 3# Didivir dois valores ambos sendo 0.
        Assert.assertEquals('NaN', div); */    // Teste inexecutavel
        
        div = dividir.Divisão(3, -1); // Teste 4# Didivir dois valores porem um número negativo.
        Assert.assertEquals(-3.0, div);
		
		
		
	}
	
}

