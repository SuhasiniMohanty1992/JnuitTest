
package TestNG.Miji;

import org.junit.Test;

import code.*;
import junit.*;
import junit.framework.Assert;
public class TestEmployeeDetails {
	   EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
	   EmployeeDetails employee = new EmployeeDetails();

	   //test to check appraisal
	   @Test
	   public void testCalculateAppriasal() {
	      employee.setName("Rajeev");
	      employee.setAge(25);
	      employee.setMonthlySalary(8000);
			
	      double appraisal = empBusinessLogic.calculateAppraisal(employee);
	      Assert.assertEquals(500.0, appraisal);
	   }

	   // test to check yearly salary
	   @Test
	   public void testCalculateYearlySalary() {
	      employee.setName("Rajeev");
	      employee.setAge(25);
	      employee.setMonthlySalary(8000);
			
	      double salary = empBusinessLogic.calculateYearlySalary(employee);
	      Assert.assertEquals(96000.0, salary);
	   }
	}
	
