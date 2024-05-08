public class pattern_1 {
    public static void main(String[] args) {
        pattern31(4);
    }

// Pattern - 31;
// Output - 
//             4 4 4 4 4 4 4 
//             4 3 3 3 3 3 4 
//             4 3 2 2 2 3 4 
//             4 3 2 1 2 3 4 
//             4 3 2 2 2 3 4 
//             4 3 3 3 3 3 4 
//             4 4 4 4 4 4 4 
    
    static void pattern31(int n){
    int original_n = n;
    n = 2 * n - 2;
    for (int row = 0;row <= n ;row++){
        for (int col = 0;col <= n ;col++){
            int final_ele = original_n - Math.min(Math.min(row,col) , Math.min(n-row,n-col));
            System.out.print(final_ele+" ");
        }
        System.out.println();
    }
}
