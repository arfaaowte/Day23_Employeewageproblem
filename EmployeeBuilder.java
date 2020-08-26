import java.util.*;

//class to check attendance
class attendance
{
	public void attendancecheck(){
		
		//create instance of random class
		Random rand = new Random();

                // Generate random integers in range 0 to 1
        	int rand_int1 = rand.nextInt(2);
        
	       	// Check Attendance
		if(rand_int1 == 0)
		{
        		System.out.println("Employee is Absent");
		}
		else
		{
			System.out.println("Employee is Present");
		}
	}
}

//class to computewage of employee
class computewage
{
	public void wagecalculation()
	{
		final int EMP_RATE_PER_HOUR = 20;
		final int HOURS_FULL_DAY = 8;
		int totalwage = EMP_RATE_PER_HOUR*HOURS_FULL_DAY;
		System.out.println("Employee wage per day is: "+totalwage);
	}
}

//main class
public class EmployeeBuilder
{
	public static void main(String args[])
	{
		System.out.println("Welcome to Employee wage computation program");
	        attendance atd = new attendance();
		atd.attendancecheck();
		computewage cmpt = new computewage();
		cmpt.wagecalculation();

	}
}
