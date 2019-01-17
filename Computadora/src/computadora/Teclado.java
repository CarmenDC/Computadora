package computadora;

public class Teclado extends DispositivoEntrada{
	
	private static int contadorTeclados;
	private int idTeclado;

	
	public Teclado(String tipoEntrada, String marca, int codigo) {
		super(tipoEntrada, marca, codigo);
		contadorTeclados++;
		idTeclado = contadorTeclados;

	}

	@Override
	public String toString() {
		return super.toString()+ "Teclado idTeclado=" + idTeclado;
	}

	@Override
	public int compare(PiezasComputadora o1, PiezasComputadora o2) {
		return o1.getCodigo()-o2.getCodigo();
	}
	





}
