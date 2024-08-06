class fibo {

    public static void main(String args[])
    {
        int n=10, FT=0, ST=1, i;
        
        System.out.print("Fibonaci serie "+n+"terms.");
        
        for(i=1; i<=n; i++)
        {
            System.out.print(FT+", ");

            int NT = FT + ST;
                FT = ST;
                ST = NT;
        }
    }
    
}
