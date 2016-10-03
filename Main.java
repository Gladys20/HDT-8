/*Universidad del Valle de Guatemala
 * 2 de octubre de 2016
 * Estructura de datos
 * Hoja de trabajo 8
 * Gladys De La Roca 15755
 * Jackeline Hidalgo 15776
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String texto = "texto.txt";
		String[] espacio; 
		BufferedReader bufer = new BufferedReader(new FileReader(texto));
	    String linea;
	    
	    Vector<Paciente> listapaciente = new Vector<Paciente>();
	    
        try {
			while ((linea = bufer.readLine()) != null) {
				
			    espacio = linea.split(",");
			    listapaciente.add(new Paciente(espacio[0], espacio[1], espacio[2]));
			    
			}
		} catch (IOException e) {
			System.out.println("Error");
		}
        
        
        System.out.println("\nListado de pacientes confomre su ingreso:");
        
        VectorHeap vheap = new VectorHeap(listapaciente);
		String ordenados = "";
        while(vheap.iterator().hasNext()){
			Paciente paciente = (Paciente) vheap.poll();
			ordenados += paciente.toString()+"\n";
		}
		
		System.out.println(listapaciente);
		System.out.println("\nAtencion de pacientes segun su prioridad:");
		
		ordenados = "";
		IVectorHeap vheap2 = new IVectorHeap(listapaciente);
		int size=vheap2.size();
		
		for(int i=0; i<size; i++){
			Paciente paciente = (Paciente)vheap2.remove();
			ordenados += paciente.toString()+"\n";
		}
		
		System.out.println(ordenados + "\n");
	}
	
}
