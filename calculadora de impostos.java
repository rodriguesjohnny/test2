package br.com.orlandoburli.calculadora;

import java.util.logging.Logger;

public class Calculadora {

	private static Logger logger = Logger.getLogger("calculadora");

	public static void main(final String[] args) {
		logger.info(String.format("Valor líquido: %1$,.2f", new Calculadora().calcularValorLiquido(100.00)));
	}

	public double calcularValorLiquido(final double valorBruto) {

		final double icms = valorBruto * 0.12;
		final double ipi = valorBruto * 0.03;

		return valorBruto - icms - ipi;
	}
}
