import java.util.*; 
		import java.util.stream.*;
public class StraeamApi {
	
	public static void main(String args[]) { 
		  
		   // create a list of integers 
		    List<Integer> number = Arrays.asList(1,2,3,4,5,6); 
		  
		   /* // demonstration of map method 
		    List<Integer> square = number.stream().map(a->a+a).
		    		collect(Collectors.toList()); 
		    System.out.println(square); 
		  
		    // create a list of String 
		    List<String> names = 
		                Arrays.asList("Reflection","Collection","Stream"); 
		  
		    // demonstration of filter method 
		    List<String> result = names.stream().filter(s->s.startsWith("S")). 
		                          collect(Collectors.toList()); 
		    System.out.println(result); 
		  
		    // demonstration of sorted method 
		    List<String> show = 
		            names.stream().sorted().collect(Collectors.toList()); 
		    System.out.println("sorted: " +show); 
		  
		    // create a list of integers 
		    List<Integer> numbers = Arrays.asList(2,3,4,5,2); 
		  
		    // collect method returns a set 
		    Set<Integer> squareSet = 
		         numbers.stream().map(x->x*x).collect(Collectors.toSet()); 
		    System.out.println(squareSet); 
		  
		    // demonstration of forEach method 
		    number.stream().map(x->x*x).forEach(y->System.out.println(y)); */
		  
		    // demonstration of reduce method 
		    //int even = 
		    //number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
		  
		    List<Integer> l  = new ArrayList<>();
		    l = number.stream().filter(i->i%2==0).collect(Collectors.toList())
		
		
			/*List <Integer> values = Arrays.asList(1,2,3,4,5,6);
			  for (int i=0;i<6;i++) {
				System.out.println(values.get(i));
			}
			values.forEach(System.out::println);*/
			
			
			 
			
		
	} 
	public static void doubleIt(int i) {
		System.out.println(i*2);
	}
} 
