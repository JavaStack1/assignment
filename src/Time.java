import java.time.LocalDateTime; 
		import java.time.format.DateTimeFormatter;
public class Time {

	public static void main(String[] args) {
 LocalDateTime data = LocalDateTime.now();
		    System.out.println("Before Time " + data);
		    DateTimeFormatter data1 = DateTimeFormatter.ofPattern("E,dd-MM-yyyy HH:mm:ss");

		    String formattedDate = data.format(data1);
		    System.out.println("After change Time: " + formattedDate);
		  }
		}
