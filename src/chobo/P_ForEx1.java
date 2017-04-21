package chobo;

/**
 * Created by kusob on 2017. 4. 21..
 */
public class P_ForEx1 {
    public static void main(String[] args) {
        int lv = 3;
        for(int i=1; i<=lv; i++){
            for(int k=2-i; k>=0; k--){
                System.out.print(" ");
            }
            for(int j=1; j<=i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
