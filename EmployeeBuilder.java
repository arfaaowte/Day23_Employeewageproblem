import java.util.*;


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
		computewage cmpt = new computewage();
		cmpt.wagecalculation();

	}
}
