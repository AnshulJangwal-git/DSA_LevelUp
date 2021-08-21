package RecursionAndBacktracking;

import java.util.* ;

public class Combinations1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int nboxes = sc.nextInt() ;
        int ritems = sc.nextInt() ;

        combinations(1, nboxes, 0, ritems, "") ;
    }

    public static void combinations(int cb, int tb, int ssf, int ts, String asf){
        if(cb > tb){
            if(ssf == ts){
                System.out.println(asf) ;
            }
            return ;
        }

        combinations(cb + 1, tb, ssf + 1, ts, asf + "i") ;
        combinations(cb + 1,tb, ssf, ts, asf + "-" ) ;

    }
}