package enumdemo;

public class MonthEnumTest {

    Month month;

    public MonthEnumTest(Day day){
        this.month = month;
    }

    public void useEnum() {

        switch (month){
            case JANUARY:
                System.out.println("New year is here and it's still cold " + month.JANUARY);
                break;
            case FEBRUARY:
                System.out.println("Second month of the year but still cold " + month.FEBRUARY);
                break;
            case MARCH:
                System.out.println("Spring is near, winter is almost over " + month.MARCH);
                break;
            case APRIL:
                System.out.println("Finally Spring is here flowers every where hurray " + month.APRIL);
                break;
            case MAY:
                System.out.println("Time to wait for summer so cricket can resume " + month.MAY);
                break;
            case JUNE:
                System.out.println("Finally Summer is here time to play cricket " + month.JUNE);
                break;
            case JULY:
                System.out.println("Its really hot almost unbearable " + month.JULY);
                break;
            case AUGUST:
                System.out.println("Last month of summer...enjoy well it last " + month.AUGUST);
                break;
            case SEPTEMBER:
                System.out.println("Time to go back to school...summer vacation is over " + month.SEPTEMBER);
                break;
            case OCTOBER:
                System.out.println("Oh yahhh my birthday month is here " + month.OCTOBER);
                break;
            case NOVEMBER:
                System.out.println("almost end of the year new year is near " + month.NOVEMBER);
                break;
            case DECEMBER:
                System.out.println("Finally christmas is here " + month.DECEMBER);
                break;


        }

    }




}
