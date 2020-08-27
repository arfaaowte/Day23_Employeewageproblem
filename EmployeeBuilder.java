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
  
//class to compute wage of employee
class computewage
{
	public void wagecalculation()
	{	
		final int EMP_RATE_PER_HOUR = 20;
                final int HOURS_FULL_DAY = 8;
                final int IS_PART_TIME = 1;
                final int IS_FULL_TIME = 2;
		final int NUM_OF_WORKING_DAYS = 20;
		int empHrs = 0;
		//computation
		int empCheck = (int) (Math.floor(Math.random() * 10) %3);
		
		//switchcase to check fulltime or parttime
		switch (empCheck) {
 			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
				break;
		}
		int totalEmpWage = empHrs*EMP_RATE_PER_HOUR*NUM_OF_WORKING_DAYS;
        	System.out.println("Total Employee Monthly wage is :" + totalEmpWage);
	}
}

//main class
public class EmployeeBuilder
{
	public static void main(String args[])
	{

		System.out.println("Welcome to Employee wage computation program");
		computewage cmpt = new computewage();
		cmpt.wagecalculation();    
	  attendance atd = new attendance();
		atd.attendancecheck();

	}
}
