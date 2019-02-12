import java.util.*;
import static java.lang.System.*;

class cal
{
	String month[] ={"","Jan","Feb","Mar","Apr","May","June","July","Aug","Sept","Oct","Nov","Dec"};
	int nod[] = {0, 31,28,31,30,31,30,31,31,30,31,30,31};
	//String day[]={"","S","M","T","W","Th","F","Sa"};
	
	int yy=1;
	int mm=0;
	int day=0;
	
	void input(){
		Scanner S = new Scanner(System.in);
		
		out.print("Enter year (yyyy): ");
		yy = S.nextInt();
		
		if(yy%4000==0 || (yy%4==0 && yy%100==0)) nod[2]=29;
		
		out.print("Enter month (mm): ");
		mm = S.nextInt();
		
		out.print("Enter first day of the month (eg Sunday is 1): ");
		day=S.nextInt();
		if(day<1 || day>7){
			out.println("Invalid Input!");
			System.exit(0);
		}
	}
	void printCal(){
		out.println("\t"+month[mm].toUpperCase()+" CALENDAR");
		out.println("Su\tM\tT\tW\tTh\tF\tS\n");
		
		int count= day-1;
		while(count!=0){
			out.print("\t");
			count--;
		}
		count=day-1;
		for(int i=1;i<=nod[mm];i++){
			if(count>=8){
                        	out.println();
				count=1;	
			}
			count++;
			out.print(i+"\t");
		}
	}
	public static void main(String[] ar){
		
		cal obj= new cal();
		obj.input();
		obj.printCal();
		out.println("\nEnd of Main().....");
		
	
	}
}
