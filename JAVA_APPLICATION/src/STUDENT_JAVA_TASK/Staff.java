package STUDENT_JAVA_TASK;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Staff {
	
	String staffId;
	String staffName;
	String staffEmail;
	Boolean isTeaching;
	LocalDate staffJoinDate;
	List<String> teachingYearsOrWorkingYears;
	List<StaffAttendance> StaffAttendanceAndDetails;
	List<Subjects> teachingsubjects;
	List<String> teachingOrWorkingBranches;
	
	public Staff(String staffId, String staffName, String staffEmail, Boolean isTeaching, LocalDate staffJoinDate,
			List<String> teachingYearsOrWorkingYears, List<StaffAttendance> staffAttendanceAndDetails,
			List<Subjects> teachingsubjects, List<String> teachingOrWorkingBranches) {
		this.staffId = staffId;
		this.staffName = staffName;
		this.staffEmail = staffEmail;
		this.isTeaching = isTeaching;
		this.staffJoinDate = staffJoinDate;
		this.teachingYearsOrWorkingYears = teachingYearsOrWorkingYears;
		StaffAttendanceAndDetails = staffAttendanceAndDetails;
		this.teachingsubjects = teachingsubjects;
		this.teachingOrWorkingBranches = teachingOrWorkingBranches;
	}
	
	
	
	
}
