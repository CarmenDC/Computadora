package computadora;

public abstract class DispositivoEntrada extends PiezasComputadora {
	
	private String tipoEntrada;
	private String marca;
	private int codigo;
	

	public String getTipoEntrada() {
		return tipoEntrada;
	}
	
	public void setTipoEntrada(String tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public DispositivoEntrada(String tipoEntrada, String marca,int codigo) {
		this.tipoEntrada = tipoEntrada;
		this.marca = marca;
		this.setCodigo(codigo);
	}

	@Override
	public String toString() {
		return " tipo de Entrada: " + tipoEntrada + ", marca: " + marca +" ";
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	
	
	

}
