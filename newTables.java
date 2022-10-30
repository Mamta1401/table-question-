import java.util.*;
public class spaceDiamond {

    public static Scanner scn = new Scanner (System.in);

    public static void starSpace(int n){
        int nsp = 1;
        int nst = n/2;
        for (int row = 1; row <= n; row++){
            for (int cst = 1; cst <= nst; cst++){
                System.out.print("*\t");
            }
            for (int csp = 1; csp < nsp; csp++){
                System.out.print("\t");
            }
            for (int cst = 1; cst <= nst; cst++){
                System.out.print("*\t");
            }
            if (row <= n/2) {
                nsp += 2;
                nst--;
            }
            else{
                nst++;
                nsp -= 2;
            }
            System.out.println("\t");
    }
    }

    public static void main(String[] args){
        starSpace(scn.nextInt());
    }
}

