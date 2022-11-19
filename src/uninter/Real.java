package uninter;

public class Real extends Moeda{
	//construtor
	public Real(double valor) {
		this.valor = valor;
	}
	
	@Override
	public void info() {
		
		System.out.println("Real - " + valor);
		
	}

	@Override
	public double converter() {
		return this.valor;
		
		
	}
	//método de comparação entre objetos, necessário para função de remover
	@Override
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()) {
			return false;
		}
		
		Real objetoDeReal = (Real) objeto;
		
		if (this.valor != objetoDeReal.valor) {
			return false;
		}
		
		return true;
	}

	
	
}
