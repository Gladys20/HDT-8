/*Universidad del Valle de Guatemala
 * 2 de octubre de 2016
 * Estructura de datos
 * Hoja de trabajo 8
 * Gladys De La Roca 15755
 * Jackeline Hidalgo 15776
 */

public interface PriorityQueue<E extends Comparable<E>>
{
	public E getFirst();
	public E remove();
	public void add(E value);
	public boolean isEmpty();	
	public int size();
	public void clear();
}
