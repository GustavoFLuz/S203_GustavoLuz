package builder.carro;

import javax.management.loading.PrivateClassLoader;

public class CarroBuilder {
	
	private Carro carro;
	
	//Construtor
	public CarroBuilder() {
		carro = new Carro();
	}
	
	public CarroBuilder buildPortas(Porta[] portas) {
		carro.setPortas(portas);
		return this;
	}
	
	public CarroBuilder buildMotor(Motor motor) {
		carro.setMotor(motor);
		return this;
	}
	
	public CarroBuilder buildComputadorBordo(ComputadorBordo cBordo) {
		carro.setComputadorBordo(cBordo);
		return this;
	}
	
	public CarroBuilder buildFreioABS(FreioABS abs) {
		carro.setFreioABS(abs);
		return this;
	}

	public Carro getCarro() {
		return carro;
	}
	
	private CarroBuilder validarPortas() {
		
		if (carro.getPortas() ==  null) {
			throw new IllegalStateException("Carro deve ter portas");
		}
	
	int numeroDePortas = carro.getPortas().length;
	
	if (numeroDePortas != 2 && numeroDePortas != 4) {
		throw new IllegalStateException("Numero de portas invalido: " + numeroDePortas);
		
	}
	return this;
	
		
	
	}

}
