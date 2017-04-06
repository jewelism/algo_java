package exam3;

public class Example4 {
    
    static String reverse(String s) {
    	StringBuilder tmp = new StringBuilder();
    	
    	for(int i=s.length()-1; i>=0; i--){
    		char t = s.charAt(i);
    		tmp.append(t);
    	}
    	
    	return tmp.toString();
    }
    
    public static void main(String[] args) {
        String s = "hello world";
        s = reverse(s);
        System.out.println(s);
    }

}

