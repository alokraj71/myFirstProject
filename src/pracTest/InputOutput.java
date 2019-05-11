package pracTest;

public class InputOutput {
	
	public static void compare(String str, String regex)
	{
	    if (str.matches(regex))
	    {
	        System.out.println(str + " matches");
	    }
	    else
	    {
	        System.out.println(str + " does not match");
	    }
	}

	public static void main(String[] args) {
//		  int var1 = -4;
//          System.out.println(var1>>2);
//          int var2 = 4;
//          System.out.println(var2>>1);
//		 char var;
//         var = "hackathons".charAt(-1);
//         System.out.println(var);
		  /*Map<String, Integer> names = new HashMap<String, Integer>();
	        names.put("Anne", 10);
	        names.put("John", 35);
	        names.put("Bob", 2);
	        Set<Entry<String, Integer>> set = names.entrySet();
	        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
	        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
	        {
	          public int compare( Map.Entry<String, Integer> order1, Map.Entry<String, Integer> order2)
	            {
	                return (order2.getValue()).compareTo( order1.getValue() );
	            }
	        });
	        for(Map.Entry<String, Integer> entry:list){
	            System.out.print(" "+entry.getKey());
	        }
      
*/	
		String regex = ".@.";

		InputOutput.compare("Hacker@Earth.com", regex);
		InputOutput.compare("a@N", regex);
		InputOutput.compare("Java@Program", regex);
	
	}

}
