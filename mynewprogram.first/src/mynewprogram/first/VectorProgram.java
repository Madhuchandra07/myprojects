package mynewprogram.first;

import java.util.Enumeration;
import java.util.Vector;

public class VectorProgram {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(10);
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		v.add("E");
System.out.println(v);

v.set(2, "Madhu");
System.out.println(v);
Enumeration e= v.elements();
System.out.println(e);
}

}
