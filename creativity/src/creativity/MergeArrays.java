package creativity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class MergeArrays {

	public static void main(String[] args) {
	int[] a = {10,20,30};
	int[] s= {40,50};
	List l= new ArrayList(Arrays.asList(s));
	l.addAll(Arrays.asList(a));
	Object[] o = l.toArray();
	System.out.println(Arrays.toString(o));
		
		

	}

}
