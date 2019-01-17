package computadora;

public class Monitor<T> extends PiezasComputadora{

	private static int contadorMonitores;
	
	private int idMonitor;
	private double tamaño;
	private String marca;
	private int codigo;
	
	

	
	public int getIdMonitor() {
		return idMonitor;
	}

	public void setIdMonitor(int idMonitor) {
		this.idMonitor = idMonitor;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}


	public Monitor() {
		super();
	}


	public Monitor(String marca, double tamaño, int codigo) {
		super();
		contadorMonitores++;
		this.idMonitor = contadorMonitores;
		this.tamaño = tamaño;
		this.marca = marca;
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Monitor [idMonitor=" + idMonitor + ", tamaño=" + tamaño + ", marca=" + marca + "]";
	}


	@Override
	public int getCodigo() {
		return codigo;
	}



	@Override
	public int compare(PiezasComputadora o1, PiezasComputadora o2) {

		return o1.getCodigo()-o2.getCodigo();
	}
	
	

	
}
