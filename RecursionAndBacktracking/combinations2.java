import java.util.* ;

public class combinations2 {

    public static void combinations(boolean boxes[], int ci, int ti, int lb){
        if(ci > ti){
            for(boolean val : boxes){
                System.out.print(val == true ? "i" : "-") ;  //ternary operator...
            }
            System.out.println() ;
            return ;
        }
        for(int i = lb + 1; i < boxes.length; i++){
            if(boxes[i] == false){
                boxes[i] = true ;
                combinations(boxes, ci + 1, ti, i) ;
                boxes[i] = false ;
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int nboxes = sc.nextInt() ;
        int ritems = sc.nextInt() ;

        combinations(new boolean[nboxes], 1, ritems, -1) ;
    }    
}
