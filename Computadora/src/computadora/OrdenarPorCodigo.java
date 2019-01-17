package computadora;

import java.util.Comparator;

public class OrdenarPorCodigo<T> implements Comparator<Inventariable<T>> {


	@Override
	public int compare(Inventariable<T> o1, Inventariable<T> o2) {
		// TODO Auto-generated method stub
		return o1.getCodigo()-o2.getCodigo();
	}
	

}
