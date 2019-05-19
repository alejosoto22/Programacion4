package packt.java9.by.example;

import stringsort.Sort;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    //    System.out.println( "Hello World!" );
        String[] actualNames = new String[]{
        		"Johnson", "Wilson",
        		"Wilkinson", "Abraham", "Dagobert"
        		};
        		final Sort sorter = new Sort();
        		sorter.sort(actualNames);
        		for (final String name : actualNames) {
        		System.out.println(name);
        		}
        		
    }
}
