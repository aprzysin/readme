import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;
/**
 * 
 */

/**
 * @author Andrew
 *
 */
public class Array_List {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum = 0;
		ArrayList<String> Arraytest = new ArrayList<String>();
		Arraytest.add("added");
		Arraytest.add("addded2");
		Arraytest.add("addded2");
		Arraytest.add("added3");
		Arraytest.remove("added");
		
		for (String s : Arraytest) {
			System.out.println(s);

		}
		System.out.println(sum);
		Iterator<String> k = Arraytest.iterator();
		while (k.hasNext()) {
			String iteratorString = k.next();
			if (iteratorString.length() == 7) {
				k.remove();
				System.out.println(iteratorString);
			}

			
		}
		LinkedList<String> linkedTest = new LinkedList<String>();
		linkedTest.add("linker");
		linkedTest.add("linker2");
		linkedTest.add("linnker3");
		linkedTest.remove("linker");
		
		for (int i = 0; i < linkedTest.size(); i++) {
			String s = linkedTest.get(i);
			sum += s.length();
			System.out.println(sum);
		}
		Iterator<String> j = linkedTest.iterator();
		while (j.hasNext()) {
			String iteratorString = j.next();
			if (iteratorString.length() == 7) {
				j.remove();
				System.out.println(iteratorString);
			}
			}
		TreeSet<String> setTest = new TreeSet<String>();
		setTest.add("added");
		setTest.add("addded2");
		setTest.add("addded2");
		setTest.add("added3");
		setTest.remove("added");
		
		for (int i = 0; i < setTest.size(); i++) {
			String s = Arraytest.get(i);
			sum += s.length();
		}
		System.out.println(sum);
		Iterator<String> m = Arraytest.iterator();
		while (m.hasNext()) {
			String iteratorString = m.next();
			if (iteratorString.length() == 7) {
				m.remove();
				System.out.println(iteratorString);
			}
		}

		// TODO Auto-generated method stub

	}

}
