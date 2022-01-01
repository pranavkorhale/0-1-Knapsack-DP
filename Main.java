import java.util.*;
public class Main
{
    
    static int [][]dp = new int[102][1002];
    
    public static int kn(int []wt,int []pr,int w,int n)
    {
        if(n==0||w==0)
        {
            return 0;
        }
        
        if(dp[w][n]!=-1)
        {
            return dp[w][n];
        }
        
        if(wt[n-1]<=w)
        {
            return dp[w][n]=Math.max(pr[n-1]+kn(wt,pr,w-wt[n-1],n-1),kn(wt,pr,w,n-1));
        }
        else{
            return dp[w][n]=kn(wt,pr,w,n-1);
        }
        
    }
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no of items ..");
	int ob = sc.nextInt();
	System.out.println("Enter the weight...");
    	int []wt = new int[ob];
    	for(int i=0;i<ob;i++)
    	{
    	    wt[i]=sc.nextInt();
    	}
	System.out.println("Enter the price...");
    	int []pr = new int[ob];
    	for(int i=0;i<ob;i++)
    	{
    	    pr[i]=sc.nextInt();
    	}
	System.out.println("Enter the capacity....");
    	int w = sc.nextInt();
	
	
	for(int i=0;i<102;i++)
	{
	    for(int j=0;j<1002;j++)
	    {
	        dp[i][j] = -1;
	    }
	}
	
	
	System.out.println("Max profit we will make "+kn(wt,pr,w,ob));
	}
}
