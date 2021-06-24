import java.util.ArrayList;
import java.util.Iterator;

public class IterateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars=new ArrayList<String>();
		cars.add("student");
		cars.add("student1");
		cars.add("student2");
		
		System.out.println(cars);
		cars.remove(1);
		System.out.println(cars);
		
		for(int i=0;i < cars.size();i++)
		{
			System.out.println(i);
		}
		
		Iterator<String> it = cars.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
		}


	}

}
