/************************************** 
*
*
*Program : To compute Employeewage on mothly and daily bases. 
*
* 
* 
* 
* 
*@author : Arfa 
*@since : 29/08/2020 
* 
* 
* 
***************************************/ 
import java.util.*;

//class to computewage of employee
class computewage
{
	public void wagecalculation()
	{	
		final int EMP_RATE_PER_HOUR = 20;
                final int HOURS_FULL_DAY = 8;
                final int IS_PART_TIME = 1;
                final int IS_FULL_TIME = 2;
		final int NUM_OF_WORKING_DAYS = 20;
		final int MAX_HRS_IN_MONTH = 200;
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

		//computation
		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS)
		{
			int empCheck = (int) (Math.floor(Math.random() * 10) %3);
			totalWorkingDays++;
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
			totalEmpHrs += empHrs;
			System.out.println("Days : "+totalWorkingDays + "Emp per Hr : "+empHrs);
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

	}
}
