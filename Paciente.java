/*Universidad del Valle de Guatemala
 * 2 de octubre de 2016
 * Estructura de datos
 * Hoja de trabajo 8
 * Gladys De La Roca 15755
 * Jackeline Hidalgo 15776
 */

public class Paciente<E> implements Comparable<E> {
	
	private String nombre;	
	private String sintoma;	 
	private String codigop;	
	
	public Paciente (String nombre1, String sintoma1, String codigo) {
		nombre = nombre1;
		sintoma = sintoma1;
		codigop = codigo;
	}
	
	public String getcodigop(){
		return codigop;
	}
	
	public int compareTo(E paciente1) {
		// TODO Auto-generated method stub
		String codigo=((Paciente)paciente1).getcodigop();
		return codigop.compareTo(codigo);
	}
	
	public String toString(){
		return nombre+", "+sintoma+", "+codigop;
	}

}
