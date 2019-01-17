package computadora;

import java.util.ArrayList;
import java.util.Collection;

public class Orden {
	
	private int idOrden;
	private Collection<Computadora> computadoras;
	private static int contadorOrdenes;
	private static int contadorComputadoras;
	int maxComputadoras;
	
	
	
	public int getMaxComputadoras() {
		return maxComputadoras;
	}
	
	public void setMaxComputadoras(int maxComputadoras) {
		this.maxComputadoras = maxComputadoras;
	}

	public Orden() {
		contadorOrdenes++;
		setIdOrden(contadorOrdenes);
		computadoras  = new ArrayList<>();	
		contadorOrdenes++;
	}
	
	public void agregarComputadora (Computadora computadora) {
		computadora.setIdComputadora(contadorComputadoras);
		computadoras.add(computadora);
		contadorComputadoras++;
	}
	
	public void mostrarOrden() {
		for(Computadora computadora: computadoras) {
			System.out.println ("\n"+ computadora.toString());
		}
	}

	public int getIdOrden() {
		return idOrden;
	}

	public void setIdOrden(int idOrden) {
		this.idOrden = idOrden;
	}
	

}
