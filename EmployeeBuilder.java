import java.util.*;

class attendance
{
	public void attendancecheck(){
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


public class EmployeeBuilder
{
	public static void main(String args[])
	{
	        attendance atd = new attendance();
		atd.attendancecheck();
	}
}
