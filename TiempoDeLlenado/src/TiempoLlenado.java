
public class TiempoLlenado {

	public static void main(String[] argumento) {
		//	POSICION 0 = LADO DEL TECHO
		//	POSICION 1 = LADO DEL TECHO Y LA CANAL
		//	POSICION 2 = ANGULO DE INCLINACION DEL TECHO
		//	POSICION 3 = ANCHO DE LA CANAL
		//	POSICION 4 = RADIO DEL TANQUE
		//	POSICION 5 = ALTURA DEL TANQUE
		//	POSICION 6 = CANTIDAD DE LLUVIA
		//	"las medidas ingresadas se toman en metros y la lluvia que cae en mililitros por decimetro cuadrado"
		
		if(argumento.length != 7) {
			System.out.println("cantidad de datos erronea");
		} else {
			Double a = Double.parseDouble(argumento[0]);
			Double l = Double.parseDouble(argumento[1]);
			Double n = Math.toRadians(Double.parseDouble(argumento[2]));;
			Double b = Double.parseDouble(argumento[3]);
			Double r = Double.parseDouble(argumento[4]);
			Double h = Double.parseDouble(argumento[5]);
			Double x = Double.parseDouble(argumento[6]);
			Double areaTotal = (a*Math.cos(n)*l+b*l+Math.PI*r*r)*100;	// Está en dm^2
			Double VolLluviaXhora = (areaTotal*x)/1000000;				// Está en m^3/h
			Double VolTanque = Math.PI*r*r*h;							// Está en m^3
			Double TiempoDeLlenado = VolTanque/VolLluviaXhora;			// Está en horas
			long tiempo = Math.round(TiempoDeLlenado);
			if(a >= 0 && l >= 0 && n >= 0 && b >= 0 && r >= 0 && h >= 0 && x >= 0) {
			System.out.println("Lado del techo = " + a + " mts");
			System.out.println("Lado del techo y canal = " + l + " mts");
			System.out.println("Angulo de inclinacion del techo = " + argumento[2] + " grados");
			System.out.println("Ancho de la canal = " + b + " mts");
			System.out.println("Radio del tanque = " + r + " mts");
			System.out.println("Altura del tanque = " + h + " mts");
			System.out.println("Cantidad de lluvia = " + a + " ml/dm^2");
			System.out.println("El tanque se llena en " + tiempo + " horas");
			}else {System.out.println("ERROR, el dato ingresado no puede ser negativo");
				
			}
		}
	}
}
