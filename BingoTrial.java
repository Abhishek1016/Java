import java.lang.reflect.Array;
import java.util.*;
import java.util.random.RandomGenerator;

public class BingoTrial
{
    public List<Integer> Board()
    {
        ArrayList<Integer> Board= new ArrayList<Integer>(75);
        for(int Index=1;Index<=75;Index++)
        {
            Board.add(Index);
        }
        Collections.shuffle(Board);
        return Board;
    }
    public List<Integer> Card()
    {
        ArrayList<Integer> Board= new ArrayList<Integer>(75);
        for(int Index=1;Index<=75;Index++)
        {
            Board.add(Index);
        }
        Collections.shuffle(Board);
        ArrayList<Integer> Card=new ArrayList<Integer>(25);
        for(int i=1;i<=25;i++)
        {
            Card.add(Board.get(i));
        }
        return Card;
    }
    public static void Printing2DArray(List<Integer> list)
    {
        Integer [] intArray=new Integer[list.size()];
        list.toArray(intArray);
        int LenOf1DArray= list.size();
        int [][] Arr= new  int [5][5];
        for(int i=0;i<LenOf1DArray;i++)
        {
            int nr=i/5;
            int cr=i%5;
            Arr[nr][cr]= list.get(i);
        }
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(Arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    public void compare(List<Integer> Board, List<Integer> Card1,List<Integer> Card2)
    {
        System.out.println("Caller Board");
        for (Integer m:Board)
        {
            System.out.print(m+" ");
        }
        System.out.println();
        System.out.println("Player1 Card");
        Printing2DArray(Card1);
        System.out.println("Player2 Card");
        Printing2DArray(Card2);
        System.out.println();
        int count=25;
        int count1=25;
        for(int i=0;i< Board.size()+1;i++)
        {
            int j;
            for(j=0;j<Card1.size();j++)
            {
                if(Card1.get(j)==Board.get(i))
                {
                    Card1.remove(j);
                    count--;
                }
            }
            int k;
            for(k=0;k< Card2.size();k++)
            {
                if(Card2.get(k)==Board.get(i))
                {
                    Card2.remove(k);
                    count1--;
                }
            }
            if(count<=0 || count1<=0)
            {
                break;
            }
        }
        if(count==0)
        {
            System.out.println("Player1 : BINGO");
        }
        else if(count1==0)
        {
            System.out.println("Player2 :BINGO");
        }
    }
    public void compare(List<Integer> Board, List<Integer> Card1,List<Integer> Card2,List<Integer> Card3)
    {
        System.out.println("Caller Board");
        for (Integer m:Board)
        {
            System.out.print(m+" ");
        }
        System.out.println();
        System.out.println("Player1 Card");
        Printing2DArray(Card1);
        System.out.println("Player2 Card");
        Printing2DArray(Card2);
        System.out.println("Player3 Card");
        Printing2DArray(Card3);
        System.out.println();
        int count=25;
        int count1=25;
        int count3=25;
        for(int i=0;i< Board.size()+1;i++)
        {
            int j;
            for(j=0;j<Card1.size();j++)
            {
                if(Card1.get(j)==Board.get(i))
                {
                    Card1.remove(j);
                    count--;
                }
            }
            int k;
            for(k=0;k< Card2.size();k++)
            {
                if(Card2.get(k)==Board.get(i))
                {
                    Card2.remove(k);
                    count1--;
                }
            }
            int l;
            for(l=0;l< Card3.size();l++)
            {
                if(Card3.get(l)==Board.get(i))
                {
                    Card3.remove(l);
                    count3--;
                }
            }
            if(count<=0 || count1<=0 || count3<=0)
            {
                break;
            }
        }
        if(count==0)
        {
            System.out.println("Player1 : BINGO");
        }
        else if(count1==0)
        {
            System.out.println("Player2 : BINGO");
        }
        else if(count3==0)
        {
            System.out.println("Player3 : BINGO");
        }
    }

    public static void main(String[] args)
    {
        BingoTrial bp =new BingoTrial();
        //System.out.println(bp.Board());
        //System.out.println(bp.Card());
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number of players");
        int NumberOfPlayers=sc.nextInt();
        if(NumberOfPlayers==2)
        {
            bp.compare(bp.Board(),bp.Card(),bp.Card());
        }
        else if(NumberOfPlayers==3)
        {
            bp.compare(bp.Board(),bp.Card(),bp.Card(),bp.Card());
        }
        else
        {
            System.out.println("Invalid Numbers of players");
        }
    }
}
