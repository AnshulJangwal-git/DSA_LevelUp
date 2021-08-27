import java.util.* ;

public class combinations1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int nboxes = sc.nextInt() ;
        int ritems = sc.nextInt() ;
        sc.close() ;
        
        combinations(1, nboxes, 0, ritems, "") ;
    }

    public static void combinations(int ci, int ti, int ssf, int ts, String asf){
        if(ci > ti){
            if(ssf == ts){
                System.out.println(asf) ;
            }
            return ;
        }
        combinations(ci + 1, ti, ssf + 1, ts, asf + "i") ;
        combinations(ci + 1, ti, ssf, ts, asf + "-") ;
    }
}
