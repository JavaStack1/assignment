
public class EnumExample {
	enum week {
		sunday,monday,tuesday,wednesday,thursday,friday,saturday
	}
public static void main(String[] args) {
 for(week days:week.values()) {
	 System.out.println(days);
	 
     }
 week days =week.thursday;
 System.out.println(days);
 week day1 = week.sunday;

 switch(day1) {
   case monday:
     System.out.println("today is monday");
     break;
   case sunday:
      System.out.println("today is sunday");
     break;
   case saturday:
     System.out.println("today is saturday");
     break;
   }
}
  
}



x=[{a}:{apple},]
