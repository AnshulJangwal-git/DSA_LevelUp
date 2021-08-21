package RecursionAndBacktracking;
import java.io.* ;
import java.util.* ;

public class qc1_boxChooses {
    public static void queensCombinations(int qpsf, int tq, int row, int col, String asf) {
        // write your code here
        if (row == tq) {
            if (qpsf == tq) {
                System.out.println(asf);
                // System.out.println() ;

            }
            return;
        }
        int nr = 0;
        int nc = 0;
        String sep = "";

        if (col < tq - 1) {
            nc = col + 1;
            nr = row;
            sep = "";
        } else {
            nc = 0;
            nr = row + 1;
            sep = "\n";
        }

        queensCombinations(qpsf + 1, tq, nr, nc, asf + "q" + sep);
        queensCombinations(qpsf, tq, nr, nc, asf + "-" + sep);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        queensCombinations(0, n, 0, 0, "");
    }
}
