package computadora;

public class Raton extends DispositivoEntrada{

	private static int contadorRatones;
	private int idRaton;

	
	public Raton(String tipoEntrada, String marca, int codigo) {
		super(tipoEntrada, marca,codigo);
		contadorRatones++;
		idRaton = contadorRatones;

	}

	@Override
	public String toString() {
		return super.toString()+ "Raton idRaton=" + idRaton;
	}

	@Override
	public int compare(PiezasComputadora o1, PiezasComputadora o2) {
		return o1.getCodigo()-o2.getCodigo();
	}
	
}
