package br.com.db1.start.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.start.classes.Calculadora;

public class CalculadoraTeste {

	Calculadora calculadora = new Calculadora();

	@Before
	public void init() {

		calculadora.setValor1(10d);
		Assert.assertTrue(10 == calculadora.getValor1());

		calculadora.setValor2(5d);
		Assert.assertTrue(5 == calculadora.getValor2());
	}

	@Test
	public void somarTest() {

		Assert.assertTrue(15 == calculadora.somar());

	}

	@Test
	public void subtrairTest() {
		Assert.assertTrue(5 == calculadora.subtrair());

	}

	@Test
	public void multiplicarTest() {
		Assert.assertTrue(50 == calculadora.multiplicar());

	}

	@Test
	public void dividirTest() {
		Assert.assertTrue(2 == calculadora.dividir());

	}

	@Test
	public void zerarTest() {
		calculadora.zerar();
		Assert.assertTrue(0 == calculadora.getValor1());
		Assert.assertTrue(0 == calculadora.getValor2());

	}

	@After
	public void finaliza() {
		System.out.println("Teste finalizado!");
	}
}
