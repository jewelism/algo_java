package exam3;

import java.util.Arrays;
import java.util.Random;

import exam3.StringComparator.Compare;

import java.util.Comparator;

class StringComparator implements Comparator<String[]> {
    
    public enum Compare { desc };
    private Compare compare;
    
    public StringComparator(Compare compare) {
        this.compare = compare;
    }

	@Override
	public int compare(String[] a, String[] tmp) {
		// TODO Auto-generated method stub
		if (a == tmp) return 0;
        if (a == null) return -1;
        if (tmp == null) return 1;
        
        switch (compare) {
        case desc: return a.length;
        }
		return 0;
	}


}


public class Example1 implements Comparator<String[]> {
    
    static Random random = new Random();
    
    static String makeRandomString() {
        StringBuilder builder = new StringBuilder();
        for (int i=0; i < 4; ++i) {
            int n = random.nextInt(26) + (int)'a';
            builder.append((char)n);
        }
        return builder.toString();
    }

    static String[] makeStringArray(int count) {
        String[] a = new String[count];
        for (int i = 0; i < count; ++i)
            a[i] = makeRandomString();
        return a;
    }
    
    static void sortAscending(String[] a) {
        // 오름차순으로 정렬
    	Arrays.sort(a);
    }

    static void sortDescending(String[] a) {
        // 내림차순으로 정렬     
    	StringComparator scom = new StringComparator(Compare.desc);
    }

    public static void main(String[] args) {
        String[] a = makeStringArray(20);
        System.out.println(Arrays.toString(a));
        
        sortAscending(a);
        System.out.println(Arrays.toString(a));

        sortDescending(a);
        System.out.println(Arrays.toString(a));
    }

	@Override
	public int compare(String[] o1, String[] o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}

