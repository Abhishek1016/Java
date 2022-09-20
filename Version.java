import java.util.ArrayList;
class UserDefinedException extends Exception
{
    public UserDefinedException(String str)
    {
        super(str);
    }
}
class Version
{
    private int  major;
    private int minor;
    private int patch;
    int count=0;
    public Version(int major, int minor,int patch)
    {
        this.major=major;
        this.minor=minor;
        this.patch=patch;
    }
    public void Major()
    {
        major++;
        minor=0;
        patch=0;
        count++;
    }
    public void Minor()
    {
        minor++;
        patch=0;
        count++;
    }
    public void patch()
    {
        patch++;
        count++;
    }
    ArrayList<Integer> list= new ArrayList<>(3);
    public void rollback()
    {
       // ArrayList<Integer> list= new ArrayList<>(3);
        if(count!=0)
        {
            list.add(major);
            list.add(minor);
            list.add(patch);
        }
        else
        {
            try
            {
                throw new UserDefinedException("Cannot Rollback");
            }
            catch(UserDefinedException c)
            {
                System.out.println("Cannot Rollback");
            }
        }
        System.out.println(list);
    }
    public void release()
    {
        ArrayList<String> strlist=new ArrayList<String>(3);
        String str=new String(String.valueOf(list.get(0)));
        String str1=new String(String.valueOf(list.get(1)));
        String str2=new String(String.valueOf(list.get(2)));
        strlist.add(str);
        strlist.add(str1);
        strlist.add(str2);
        for( String s:strlist)
        {
            System.out.print(s+".");
        }
    }

    public static void main(String[] args)
    {
        Version ver=new Version(0,0,1);
        ver.Major();
        ver.Minor();
        ver.patch();
        ver.rollback();
        ver.release();
    }
}
