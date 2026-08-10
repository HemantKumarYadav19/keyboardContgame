import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

   
        int t = sc.nextInt(); // Uncomment for multiple test cases

        while (t-- > 0) {
            solve();
        }
    }

    static void solve() {

        int n = sc.nextInt();
int sum =0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
       
         
        if(sum%4==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}