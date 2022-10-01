import java.math.*;
public class FK_Convert {
	public static void main (String[]args) {
		double f, k;
		System.console().printf("Fahrenheit: ");
		String in = System.console().readLine();
		f = Double.parseDouble(in);
		k= (((f-32)*5)/9)+273.15;
		String out = String.valueOf(k);
		
		System.console().printf("Kelvin: "+"%,.2f ", k);
		
	}
}
