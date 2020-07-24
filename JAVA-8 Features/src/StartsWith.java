import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StartsWith {
	public static List<String> testing(List<String> list)
	{
		 Predicate<String> startwitha  = (Value)->Value.startsWith("a"); 
		 
	     Predicate<String> length3 = (Value)->Value.length()==3;
	        
	     List<String> result = list.stream().filter(startwitha.and(length3)).collect(Collectors.toList());
	      
	     return result;
		
	}
	
	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no of Strings : ");
		int n;
		n=in.nextInt();
		
		int i;
		List<String> l = new ArrayList<String>();
		
		
		String ele;
        for(i=0;i<n;i++)
        {   int t=i+1;
        	System.out.println("Enter "+t+ " Positon Element: ");
        	ele = in.next();
        	
        	l.add(ele);
        }
        
       List<String> output = testing(l);
        if(output.size()>=1)
        {
        System.out.println("List Of Strings that containing length 3 and starts with 'a' are:"+output);
        }
        
        else {
        	System.out.println("No element Found");
        }
     
        in.close();
		
	}
}