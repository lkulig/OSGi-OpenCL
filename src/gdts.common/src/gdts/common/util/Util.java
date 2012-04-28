package gdts.common.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import gdts.common.data.type.VFloat;
import gdts.common.data.type.VInteger;
import gdts.common.data.type.VNumeric;
import gdts.common.data.type.Variable;

/**
 * Rózne metody narzędziowe.
 * 
 * @author Maciej Milczarek
 */
public class Util {

	public static VInteger[] arrayCast(long[] input) {
		
		VInteger[] output = new VInteger[input.length];
		
		for(int i = 0; i < input.length; i++) {
			
			output[i] = new VInteger(input[i]);
		}
		
		return output;
	}
	
	public static VInteger[][] arrayCast(long[][] input) {
		
		VInteger[][] output = new VInteger[input.length][];
		
		for(int i = 0; i < input.length; i++) {
			
			output[i] = Util.arrayCast(input[i]);
		}
		
		return output;
	}
	
	public static VFloat[] arrayCast(double[] input) {
		
		VFloat[] output = new VFloat[input.length];
		
		for(int i = 0; i < input.length; i++) {
			
			output[i] = new VFloat(input[i]);
		}
		
		return output;
	}
	
	public static VFloat[][] arrayCast(double[][] input) {
		
		VFloat[][] output = new VFloat[input.length][];
		
		for(int i = 0; i < input.length; i++) {
			
			output[i] = Util.arrayCast(input[i]);
		}
		
		return output;
	}
	
	public static VNumeric[] arrayCast(Variable[] input) {
		
		VNumeric[] output = new VNumeric[input.length];
		
		for(int i = 0; i < input.length; i++) {
			
			output[i] = (VNumeric)input[i];
		}
		
		return output;
	}
	
	public static VNumeric[][] arrayCast(Variable[][] input) {
		VNumeric[][] output = new VNumeric[input.length][];
		
		for(int i = 0; i < input.length; i++) {
			
			output[i] = Util.arrayCast(input[i]);
		}
		
		return output;
	}
	
	public static Variable[] arrayClone(Variable[] input) {
		Variable[] output = new VNumeric[input.length];
		for(int i = 0; i < input.length; i++) {
			output[i] = input[i].duplicate();
		}
		
		return output;
	}
	
	public static Variable[][] arrayClone(Variable[][] input) {
		Variable[][] output = new VNumeric[input.length][];
		for(int i = 0; i < input.length; i++) {
			output[i] = arrayClone(input[i]);
		}
		
		return output;
	}
	
	public static String timeString() {
		DateFormat format = new SimpleDateFormat("HH:mm:ss:SS");
		return format.format(new Date(System.currentTimeMillis()));
	}
}
