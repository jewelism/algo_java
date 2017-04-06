package exam2;

import java.util.Arrays;

public class Example1 {
    
    static void printAverage(int... a) {
    	double tmp=0;
    	System.out.print("µ•¿Ã≈Õ:[");
    	for(int i=0; i<a.length; i++){
    		System.out.print(a[i]);
    		tmp+=a[i];
    		if(i==a.length-1){
    			break;
    		} else
    			System.out.print(", ");
    	}
    	
    	System.out.printf("]  ∆Ú±’:%6f\n",tmp/a.length);
    	
    }        
    
    public static void main(String[] args) {

        int[] a = new int[] { 21, 33, 17, 40, 5, 13 };

        printAverage( 11, 13, 17, 20 );
        printAverage( a );
    }
}

