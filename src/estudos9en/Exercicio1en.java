package estudos9en;

public class Exercicio1en {
	private int number;
	private String name;
	private double value;

	public Exercicio1en(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public Exercicio1en(int number, String name, double initialValue) {
		this.number = number;
		this.name = name;
		addValue(initialValue);
	}

	public Exercicio1en() {

	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return value;
	}

	public void addValue(double value) {
		this.value += value;
	}

	public void minusValue(double value) {
		this.value -= value + 5.0;
	}

}
