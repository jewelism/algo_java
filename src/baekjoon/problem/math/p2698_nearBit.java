package baekjoon.problem.math;

import java.util.ArrayList;

/**
 * Created by kusob on 2017. 4. 24..
 */
public class p2698_nearBit {
    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        int cnt = 0;
        
        for (int i = 1; i <= gop(n); i++) {
            String[] tmpList = Integer.toBinaryString(i).split("0");
            int tmp = 0;
            for (int j = 0; j < tmpList.length; j++) {
                if(tmpList[j]!=null) {
//                    System.out.println("list:"+i+" "+tmpList[j]);
//                    System.out.println(tmpList[j].length() - 1);
                    tmp += tmpList[j].length() - 1;
                }
            }
            if(tmp==k) {
//                System.out.println(i);
                cnt++;
            }
        }
        System.out.println("count:"+cnt);
    }
    
    public static int gop(int num){
        int t = 1;
        for(int i=0; i<num; i++){
            t *= 2;
        }
        return t-1;
    }
}
