public class Main {
    public static int countPrimes(int n) {
        int flg=0,count=0;
        if(n>=2) count++;
        for(int j=3;j<n;j++)
        {
            for(int i=2; i<=(j/2)+1;i++)
            {
                if(j%i==0){
                    flg=1;
                    break;
                }
            }
            if(flg==0){
                System.out.println(j);
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("\n\n");
        System.out.println("Ans = "+countPrimes(10));
    }
}
