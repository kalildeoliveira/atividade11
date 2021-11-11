package atividade11;

import java.util.Scanner;

public class Piramide {
	Scanner teclado = new Scanner(System.in);
	private double area;
	private double altura;
	private double base;
	private double volume;
	private double valorTinta;
	
	
// METODOS PÚBLICOS GET E SET
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}
	public double getValorTinta() {
		return valorTinta;
	}

	public void setValorTinta(double valorTinta) {
		this.valorTinta = valorTinta;
	}


// MÉTODO PÚBLICO TO STRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nVolme do triangulo= ");
		builder.append(volume);
		builder.append("\nValor da tinta= ");
		builder.append(valorTinta);
		return builder.toString();
		
	}
	
// OUTROS MÉTODOS
	public void telaInicial() {
		System.out.println("****************************************************\n\n"
				+ "\tSeja bem-vindo ao nosso sistema!\n\n"
				+ "\tPara mais informações, entre em contato: \n"
				+ "\tkalil.fadesc@gmail.com\n\n \t\tMUITO OBRIGADO! \n\n"				
				+ "****************************************************");
	}
	
	public void escolherTinta() {		
		String tinta1="1", tinta2="2", tinta3="3";
		System.out.println("Informe o tipo de Tinta");
		System.out.println("\"1\" - 127,90");
		System.out.println("\"2\" - 258,98");
		System.out.println("\"3\" - 344,34");
		System.out.print("Opcão: ");
		String opcao = teclado.next();
		if (opcao.equals(tinta1)) {
			setValorTinta(127.90);
		} else if (opcao.equals(tinta2)) {
			setValorTinta(258.98);
		} else if (opcao.equals(tinta3)) {
			setValorTinta(344.34);
		} else {
			System.out.println("Dados incorretos. Tente novamente \n\n");
			escolherTinta();
		}
		
	}
	public void calcularVolume() {		
		System.out.println("Informe os dados do Triângulo");
		System.out.print("Base: ");		
		double base = teclado.nextDouble();
		setBase (base);
		System.out.print("Altura: ");
		double altura = teclado.nextDouble();
		setAltura (altura);
		double area = base*altura;
		setArea (area);
		double volume = (base/3)*altura; 
		setVolume(volume);		
	}
	public void imprimirResultado() {
		double volume=getVolume();
		double tinta= volume/(18*4.76);
		System.out.println("Volume do triangulo = " + getVolume());
		System.out.println("Valor da tinta = "+getValorTinta());
		System.out.println("Será preciso comprar = " + tinta + " latas de tinta");
	}	

}
