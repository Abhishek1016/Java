class Holiday
{
    private String name;
    private int day;
    private String month;

    Holiday(String name, int day, String month)
    {
        this.name=name;
        this.day=day;
        this.month=month;
    }
    public String getName()
    {
        return name;
    }
    public int getday()
    {
        return day;
    }
    public String getmonth()
    {
        return month;
    }
}
class HolidayExample
{
    static  boolean isSameMonth(Holiday H1,Holiday H2)
    {
        if(H1.getmonth().equals(H2.getmonth()))
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    public static int avgDate(Holiday[] holidayList)
    {
        int sumOfDays=0;
        for (Holiday h: holidayList)
            sumOfDays+=h.getday();
        return (sumOfDays/(holidayList.length));
    }
    public static void main(String args[])
    {
        Holiday[] holidayList=new Holiday[2];
        Holiday H = new Holiday("IndependenceDay",3,"July");
        Holiday H2 = new Holiday("IndependenceDay2",20,"July");
        holidayList[0]=H;
        holidayList[1]=H2;
        System.out.println(isSameMonth(H,H2));
        System.out.println(avgDate(holidayList));
    }
}