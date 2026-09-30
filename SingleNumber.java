public class SingleNumber {
    public static void main (String[]args){
        int[]nums={4,1,2,1,2};
        int ans =0;
        for(int n:nums){
            ans =ans^n;
        }
        System.out.println(ans);
    }
}
