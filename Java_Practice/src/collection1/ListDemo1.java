package collection1;
import java.util.*;

public class ListDemo1 {

	public static void main(String[] args) {
		List rawList= new ArrayList();
		rawList.add("Testing");
		rawList.add(15);
		rawList.add(123.22);
		rawList.add(14.3f);
		System.out.println(rawList);
		
		List<String> stuNames=new ArrayList<String>();
		stuNames.add("Amit");
		stuNames.add("Ram");
		stuNames.add("Shyam");
		stuNames.add("Gopal");
		//System.out.println("Student names are:"+stuNames);
		//stuNames.remove(3);
		System.out.println(stuNames);
		Collections.sort(stuNames);
		System.out.println(stuNames);
		Collections.reverse(stuNames);
		System.out.println(stuNames);
		
		Iterator <String> itr= stuNames.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(stuNames.indexOf("Ram"));
		System.out.println(stuNames.lastIndexOf("Shyam"));
		
		/*List<Integer> rollNo=new ArrayList<Integer>();
		rollNo.add(1);
		rollNo.add(2);
		System.out.println(rollNo);
		*/
		
		
		
		
		

	}

}
