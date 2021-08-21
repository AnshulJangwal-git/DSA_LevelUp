package RecursionAndBacktracking;
import java.util.* ;

// import jdk.internal.org.jline.utils.InputStreamReader; 

import java.io.* ;

public class combinations2 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        int nboxes = Integer.parseInt(br.readLine()) ;
        int ritems = Integer.parseInt(br.readLine()) ;

        combinations(new boolean[nboxes], 1, ritems, -1) ;
    }

    public static void combinations(boolean[] boxes, int ci, int ti, int lb){
        if(ci == ti + 1){
            for(boolean val : boxes){
                if(val){
                    System.out.print("i") ;
                }else{
                    System.out.print("-") ;
                }
            }
            System.out.println() ;
            return ;
        }
        for(int bi = lb + 1; bi < boxes.length; bi++){
            if(boxes[bi] == false){
                boxes[bi] = true ;

                combinations(boxes, ci + 1, ti, bi) ;

                boxes[bi] = false ;
            }
        }
    }
}
