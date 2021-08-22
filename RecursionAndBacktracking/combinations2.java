package RecursionAndBacktracking;
import java.io.* ;
import java.util.* ;

public class combinations2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nboxes = Integer.parseInt(br.readLine());
        int ritems = Integer.parseInt(br.readLine());
        combinations(new int[nboxes], 1, ritems, -1);

      }
    
    public static void combinations(int boxes[], int ci, int ti, int lb){
        if(ci > ti){
            for(int i = 0; i < boxes.length; i++){
                if(boxes[i] != 0){
                    System.out.print("i5") ;

                }else{
                    System.out.print("-") ;
                }
            }
            System.out.println() ;
            return ;
        }
        for(int bi = lb + 1; bi < boxes.length; bi++){
            if(boxes[bi] == 0){
                boxes[bi] = ci ;
                combinations(boxes, ci + 1, ti, bi) ;
                boxes[bi] = 1 ;
            }
        }
    }
}
