import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int w=sc.nextInt();
        int totalcost=0;
        for(int i=1;i<=w;i++){
            totalcost+=k*i;
        }
        int borrow =totalcost -n;
        if(borrow<0){
            borrow=0;
        }
        System.out.println("Your borrow cost is "+borrow);
    }
}
