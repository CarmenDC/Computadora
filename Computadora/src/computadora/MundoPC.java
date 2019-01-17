package computadora;

import java.util.ArrayList;

public class MundoPC {

	public static <T extends Inventariable<T>> void main(String[] args) {
		   Monitor monitorToshi = new Monitor("Toshiba", 13, 111);
	        Teclado tecladoToshi = new Teclado("bluetooth", "Toshiba",222);
	        Raton ratonToshi = new Raton("bluetooth", "Toshiba",333);
	        Computadora compuToshiba = new Computadora("Computadora Toshiba", monitorToshi, tecladoToshi, ratonToshi);

	        //creacion de computadora dell
	        Monitor monitorDell = new Monitor("Dell", 15,444);
	        Teclado tecladoDell = new Teclado("usb", "Dell", 555);
	        Raton ratonDell = new Raton("usb", "Dell", 666);
	        Computadora compuDell = new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell);

	        ArrayList<Inventariable<T>> piezasEnAlmacen= new ArrayList<>();
	        
	        piezasEnAlmacen.add((Inventariable<T>) monitorDell);
	        piezasEnAlmacen.add((Inventariable<T>) tecladoToshi);
	        piezasEnAlmacen.add((Inventariable<T>) monitorToshi);
	        piezasEnAlmacen.add((Inventariable<T>) ratonDell);
	        piezasEnAlmacen.add((Inventariable<T>) ratonToshi);
	        piezasEnAlmacen.add((Inventariable<T>) tecladoDell);
	        System.out.println(piezasEnAlmacen);
	        
	        piezasEnAlmacen.sort(new OrdenarPorCodigo<>());
	        
	        System.out.println(piezasEnAlmacen);
	       
	        
	        
	        //creacion de computadora armada
	        Computadora compuArmada = new Computadora("Computadora Armada", monitorDell, tecladoToshi, ratonToshi);

	        //Agregamos las computadoras a la orden 
	        Orden orden1 = new Orden();
	        orden1.agregarComputadora(compuToshiba);
	        orden1.agregarComputadora(compuDell);
	        orden1.agregarComputadora(compuArmada);
	        //Imprimimos la orden
	        orden1.mostrarOrden();
	        
	        //Agregamos una segunda orden
	        Orden orden2 = new Orden();
	        orden2.agregarComputadora(compuArmada);
	        orden2.agregarComputadora(compuDell);
	        System.out.println("");
	        orden2.mostrarOrden();
	}

}
