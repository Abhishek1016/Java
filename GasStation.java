public class GasStation
{
//    static int find_sum(int [] summ)
//    {
//        int sum=0;
//        for(int i=0;i<summ.length;i++)
//        {
//            sum=sum+summ[i];
//        }
//        return sum ;
//    }
//     int gas_sum=find_sum(gas);
//     int cost_sum=find_sum(cost);
//    public int getGas_sum() {
//        return gas_sum;
//    }
//    public int getCost_sum()
//    {
//        return cost_sum;
//    }
    public int check(int [] gas,int[] cost)
    {
        int gassum=0;
        int costsum=0;
        for(int i=0;i<gas.length;i++)
        {
           gassum=gassum+gas[i];
           costsum=costsum+cost[i];
        }
        if(costsum<gassum)
        {
            return -1;
        }
        int leftoutgas=0;
        int startIndex=0;
        for(int i=0;i<gas.length;i++)
        {
            leftoutgas=leftoutgas+gas[i]-cost[i];
            if(leftoutgas<0)
            {
                startIndex=i+1;
                leftoutgas=0;
            }
        }
        return startIndex;
    }


    public static void main(String[] args)
    {
        int[] gas1={1,2,3,4,5};
        int[] cost1={3,4,5,1,2};
        GasStation gs=new GasStation();
        System.out.println(gs.check(gas1,cost1));
    }

}
