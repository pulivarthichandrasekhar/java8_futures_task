import java.util.*;
public class AvgofLI {
	public static void main(String[] args) {
		System.out.println("Enter no of elements: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		List<Integer> l = new ArrayList<Integer>(); 
		int i,element;
		for(i=0;i<n;i++)
		{
			System.out.println("Enter "+i+ " Positon Element: ");
			element =s.nextInt();
			l.add(element);
		}
		OptionalDouble result = l.stream().mapToInt(x->x).average();
		System.out.println("Average of list of Intergers Provided is: "+result); 
		s.close(); 
}
}