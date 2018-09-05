package tdaysofcode.java;

public class Generics {
	
	public class Printer <T> {	
		public void printArray(T[] arrayInput) {

			for(T i : arrayInput) {
				System.out.println(i);
			}
		}
		
	}
    public static void main(String args[]){
        Integer[] intArray = {1,2,3,4,5};
        String[] stringArray = {"uno", "dos", "tres", "cuatro"};
        
        Generics g = new Generics();
        Printer<Integer> intPrinter = g.new Printer<Integer>();
        Printer<String> stringPrinter = g.new Printer<String>();
        intPrinter.printArray( intArray  );
        stringPrinter.printArray( stringArray );
        if(Printer.class.getDeclaredMethods().length > 1){
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
    } 
}