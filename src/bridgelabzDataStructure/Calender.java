package bridgelabzDataStructure;

import utility.Utility;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u = new Utility();
        int mnth = Integer.parseInt(args[0]);
        int year = Integer.parseInt(args[1]);
        int dayOfWeek = u.calender(mnth,1,year);
        String months[] = {"","January","February","March","April","May","June","July","August","Septeber","October","November","December"};
        String weekDays[] = {"","S","M","T","W","Th","F","S"}; 
        int days[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        if((mnth == 2) && (u.checkLeapYear(year)))
        {
        	days[mnth] = 29;
        }
        
        System.out.println(months[mnth]+"  "+year);
        System.out.println();
        
        for(int i=1; i<weekDays.length; i++)
        {
 	         System.out.print(weekDays[i]+"  ");
        }
        System.out.println();
        for(int i=0; i<dayOfWeek; i++) 
        {
 	        System.out.print("   ");
        }
        
        for(int i=1; i<=days[mnth];i++) 
        {
 	        if(i<10)
 		         System.out.print("0"+i+" ");
 	        else
 		         System.out.print(i+" ");
 	        if((i+dayOfWeek) % 7 == 0 || i == days[mnth])
 		         System.out.println();
        }
	}

}
