
public class Weihnachtsbaum {

	public static void main(String[] args) {
		
			
		int i, j; //i Zeilen, j Spalten
		    
		int n=10; //n ist die Höhe des Baumes


		   //"Krone" des Baumes zeichnen
		    for (i=1; i<=n; i++) {

		      for (j=1; j<=n-i; j++)
		        System.out.print(" ");

		      for (j=1; j<=(2*i-1); j++)
		        System.out.print("*");

		      System.out.println();
		    }
		    

		    // "Stamm" einzeichnen
		    for (i=1; i<n; i++)
		      System.out.print(" ");
		    System.out.println("#");
		    
			
			
		}
		
		
		

	}


