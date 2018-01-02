package test.com;

import java.awt.List;
import java.util.Collections;
import java.util.LinkedList;
import java.util.concurrent.SynchronousQueue;

public class SyncLinkedList {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(1);
		l.add(5);
		l.add(15);
		l.add(12);
		System.out.println(l);
		List m = (List) Collections.synchronizedList(l);
		System.out.println(m);
		
		

	}

}
