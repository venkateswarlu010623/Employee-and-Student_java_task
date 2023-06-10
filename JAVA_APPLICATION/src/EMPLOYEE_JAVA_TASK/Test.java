package EMPLOYEE_JAVA_TASK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		Department1 department1 = new Department1(1,"healthcare");
		Department1 department2 = new Department1(2,"finance");
		Department1 department3 = new Department1(3,"admin");
		Department1 department4 = new Department1(4,"fraud");
		
		
		Location2 location1 = new Location2(11,"Hyderabad","India");
		Location2 location2 = new Location2(22,"chennai","India");
		Location2 location3 = new Location2(33,"London","UK");
		

		List<Benefits3> benefits1 = Arrays.asList(
			new Benefits3(111,"HI","Health Insurance Benefits"),
			new Benefits3(222,"LI","Life Insurance Benefits"),
			new Benefits3(333,"PAID_LEAVE","Paid Vacation and Sick Time"));
		

		List<Benefits3> benefits2 = Arrays.asList(
				new Benefits3(111,"HI","Health Insurance Benefits"),
				new Benefits3(222,"LI","Life Insurance Benefits"));
		
		
		List<Benefits3> benefits3 = Arrays.asList(
				new Benefits3(111,"HI","Health Insurance Benefits"));
		
		
Employee1 employee1 = new Employee1(1111,"venkat",20000,location3,department3,benefits1);
Employee1 employee2 = new Employee1(2222,"raj",50000,location2,department4,benefits3);
Employee1 employee3 = new Employee1(3333,"ram",60000,location3,department2,null);
Employee1 employee4 = new Employee1(4444,"sekhar",40000,location1,department3,benefits3);
Employee1 employee5 = new Employee1(5555,"srikanth",200000,location1,department1,benefits2);

	List<Employee1> emp1 = new ArrayList();
	emp1.add(employee1);
	emp1.add(employee2);
	emp1.add(employee3);
	emp1.add(employee4);
	emp1.add(employee5);
	
	//1.Retrieve all employees in India
	
	System.out.println("1.Retrieve all employees in India");
	
emp1.stream().filter(e->e.locationId.locationCountry.equals("India")).sorted((s1,s2)->s1.employeeName.compareTo(s2.employeeName)).forEach(e->System.out.println(e.employeeName));;
//	raj
//	sekhar
//	srikanth

System.out.println();


List<Employee1> emp2 = emp1.stream().filter(e->e.locationId.locationCountry.equals("India")).collect(Collectors.toList());
	//[Employee1 [employeeId=2222, employeeName=raj, Salary=50000, locationId=Location2 [locationId=22, locationName=chennai, locationCountry=India], deptId=Department1 [departmentId=4, departmentName=fraud], benefitId=[Benefits3 [benefitId=111, benefitName=HI, description=Health Insurance Benefits]]],
	//Employee1 [employeeId=4444, employeeName=sekhar, Salary=40000, locationId=Location2 [locationId=11, locationName=Hyderabad, locationCountry=India], deptId=Department1 [departmentId=3, departmentName=admin], benefitId=[Benefits3 [benefitId=111, benefitName=HI, description=Health Insurance Benefits]]],
	//Employee1 [employeeId=5555, employeeName=srikanth, Salary=200000, locationId=Location2 [locationId=11, locationName=Hyderabad, locationCountry=India], deptId=Department1 [departmentId=1, departmentName=healthcare], benefitId=[Benefits3 [benefitId=111, benefitName=HI, description=Health Insurance Benefits], Benefits3 [benefitId=222, benefitName=LI, description=Life Insurance Benefits]]]]

System.out.println();

//2.Retrieve employees who are in Chennai or Hyderabad

System.out.println("2.Retrieve employees who are in Chennai or Hyderabad");

	emp1.stream().filter(e->e.locationId.locationName.equals("Hyderabad") || e.locationId.locationName.equals("chennai")).forEach(e->System.out.println(e.employeeName));

//	raj
//	sekhar
//	srikanth
	
	System.out.println();

	
//3. Retrieve employees who have Benefits and display benefits details
	System.out.println("3.Retrieve employees who have Benefits and display benefits details");

	emp1.stream().filter(e->e.benefitId != null).forEach(e->System.out.println(e.employeeName + e.benefitId));

	System.out.println();

//	venkat[Benefits3 [benefitId=111, benefitName=HI, description=Health Insurance Benefits], Benefits3 [benefitId=222, benefitName=LI, description=Life Insurance Benefits], Benefits3 [benefitId=333, benefitName=PAID_LEAVE, description=Paid Vacation and Sick Time]]
//	raj[Benefits3 [benefitId=111, benefitName=HI, description=Health Insurance Benefits]]
//	sekhar[Benefits3 [benefitId=111, benefitName=HI, description=Health Insurance Benefits]]
//	srikanth[Benefits3 [benefitId=111, benefitName=HI, description=Health Insurance Benefits], Benefits3 [benefitId=222, benefitName=LI, description=Life Insurance Benefits]]


//4.Retrieve employee details -  employeeId, employeeName, Salary, deptName, locationName, locationCountry
	System.out.println("4.Retrieve employee details -  employeeId, employeeName, Salary, deptName, locationName, locationCountry");

	emp1.stream().forEach(e->System.out.println("employeeId="+e.employeeId+" employeeName= "+e.employeeName +" Salary= "+e.Salary+" departmentName= "+e.deptId.departmentName+" locationName="+e.locationId.locationName+" locationCountry"+e.locationId.locationCountry));
//	1111 20000 admin London UK
//	2222 50000 fraud chennai India
//	3333 60000 finance London UK"+e.Salary+"
//	4444 40000 admin Hyderabad India
//	5555 200000 healthcare Hyderabad India
	
	System.out.println();
	
//5.Retrieve employees who are in Chennai and India
	System.out.println("5.Retrieve employees who are in Chennai and India");

	emp1.stream().filter(e->e.locationId.locationCountry.equals("India") && e.locationId.locationName.equals("chennai")).forEach(e->System.out.println(e.employeeName));
//raj
	
	}

}
