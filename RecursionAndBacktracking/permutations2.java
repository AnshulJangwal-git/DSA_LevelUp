import java.util.* ;

public class permutations2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int nboxes = sc.nextInt() ;
        int ritems = sc.nextInt() ;

        permutations(1, nboxes, new boolean[ritems], 0, ritems, "") ;
    }

    public static void permutations(int cb, int tb, boolean[] items, int ssf, int ts, String asf){
        if(cb > tb){
            if(ssf == ts){
                System.out.println(asf) ;
            }
            return ;
        }
        for(int i = 0; i < items.length; i++){
            if(items[i] == false){
                items[i] = true ;
                permutations(cb + 1, tb, items, ssf + 1, ts, asf + (i + 1)) ;
                items[i] = false ;
            }
        }
        permutations(cb + 1, tb, items, ssf, ts, asf + "0") ;
    }
}
