import java.util.* ;

public class permutations1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        int nboxes = sc.nextInt() ;
        int ritems = sc.nextInt() ;

        permutations(new int[nboxes], 1, ritems) ;
    }  

    public static void permutations(int[] boxes, int ci, int ti){
        if(ci == ti + 1){
            for(int val : boxes){
                System.out.print(val) ;
            }
            System.out.println() ;
            return ;
        }

        for(int i = 0; i < boxes.length; i++){
            if(boxes[i] == 0){
                boxes[i] = ci ;
                permutations(boxes, ci + 1, ti) ;
                boxes[i] = 0 ;
            }
        }
    }
}
