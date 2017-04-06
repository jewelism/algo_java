package exam3;

import java.util.Arrays;

class MyArrayList {
    int count;
    int size;
    Object a[];
    
    public MyArrayList(int size) {
        this.count = 0;
        this.size = size;
        this.a = new Object[size];
    }
    
    public Object get(int index) {
        return a[index];
    }
    
    public int getCount() {
        return count;
    }
    
    public void setSize(int newSize) {
    	Arrays.copyOf(a, newSize);
    }
    
    public void add(Object value) { 
    	if(a[size-1]!=null){
    		setSize(size*2);
    	}
    	int tmp = Arrays.binarySearch(a, null);
    	a[tmp] = value;
    	count++;
    }
    
}

public class Example5 {
    
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList(5);
        
        for (int i = 12; i <= 20; ++i)
            list.add(i);
               
        
        for (int i = 0; i < list.getCount(); ++i)
            System.out.printf("%d ", list.get(i));
    }

}

