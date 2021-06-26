        import java.util.HashMap;
        import java.util.Scanner;
    	public class Practice3 {
    	public static void main(String[] args) {
    	HashMap<String, String> phoneBook = new HashMap<String, String>();
    	    Scanner	R = new Scanner(System.in);
    		int PhoneNumbers = R.nextInt();
            R.nextLine();
    		for (int i = 0; i < PhoneNumbers ; i++) {
    		String name = R.nextLine();
    		String phone = R.nextLine();
    		phoneBook.put(name, phone);
    	}
            while (R.hasNext()) {
    		String NAME = R.nextLine();
            if (phoneBook.containsKey(NAME))    {
    		System.out.println(NAME + "=" + phoneBook.get(NAME));
    	} 
    		else {
    		System.out.println("Not found");
    	}
      }
	}    
  }
    	


