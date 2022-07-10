import java.util.*;

class Solution{
    public static double solve(int[] arr,int n,int m){
        if(n==m){
            double sum=0.0;
            for(int i=0;i<n;i++)
                sum+=arr[i];
            return sum;
        }else{
            double sum=0f;
            double max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++)
                sum+=arr[i];
            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    double temp=sum-(arr[i]+arr[j]);
                    double x=(arr[i]+arr[j])/2.0;
                    if((temp+x)>max)
                        max=temp+x;
                }
            }
            return max;
        }
    }
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int testCase=sc.nextInt();
        for(int test=1;test<=testCase;test++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            double ans=solve(arr,n,m);
            System.out.println("Case #"+test+": "+ans);
        }
    }
}