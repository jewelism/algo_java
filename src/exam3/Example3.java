package exam3;

public class Example3 {
    
	static void printAsciiCode(String s){
		char[] c = new char[s.length()];
    	int ascii = 0;
    	for(int i=0; i<s.length(); i++){
    		c[i] = s.charAt(i);
    		ascii = (int)c[i];
    		System.out.println(c[i]+" "+ascii);
    	}
	}
    
    public static void main(String[] args) {
        
        String a[] = { "Good morning.", "How are you?" };
        for (String s : a)
            printAsciiCode(s);        
    }

}

