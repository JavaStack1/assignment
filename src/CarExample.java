import java.util.ArrayList;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    cars.remove(1);
	    System.out.println(cars);
	    System.out.println(cars.size());

	}

}
