package STUDENT_JAVA_TASK;

import java.time.LocalDate;
import java.util.Map;
import java.util.Set;

public class Student {
	
	String studentId;
	String studentName;
	String studentEmail;
	String studentbranch;
	LocalDate studentJoinDate;
	String currentYear;
	Map<String,Set<StudentAttendance>> studentYearlyAttendance;
	Map<String,Set<StudentSubjectsAndMarksAndResult>> yearWiseStudentSubjectsAndMarksAndResult;
	
	
	public Student(String studentId, String studentName, String studentEmail, String studentbranch,
			LocalDate studentJoinDate, String currentYear, Map<String, Set<StudentAttendance>> studentYearlyAttendance,
			Map<String, Set<StudentSubjectsAndMarksAndResult>> yearWiseStudentSubjectsAndMarksAndResult) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentbranch = studentbranch;
		this.studentJoinDate = studentJoinDate;
		this.currentYear = currentYear;
		this.studentYearlyAttendance = studentYearlyAttendance;
		this.yearWiseStudentSubjectsAndMarksAndResult = yearWiseStudentSubjectsAndMarksAndResult;
	}


	public String getStudentId() {
		return studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public String getStudentEmail() {
		return studentEmail;
	}


	public String getStudentbranch() {
		return studentbranch;
	}


	public LocalDate getStudentJoinDate() {
		return studentJoinDate;
	}


	public String getCurrentYear() {
		return currentYear;
	}


	public Map<String, Set<StudentAttendance>> getStudentYearlyAttendance() {
		return studentYearlyAttendance;
	}


	public Map<String, Set<StudentSubjectsAndMarksAndResult>> getYearWiseStudentSubjectsAndMarksAndResult() {
		return yearWiseStudentSubjectsAndMarksAndResult;
	}


	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}


	public void setStudentbranch(String studentbranch) {
		this.studentbranch = studentbranch;
	}


	public void setStudentJoinDate(LocalDate studentJoinDate) {
		this.studentJoinDate = studentJoinDate;
	}


	public void setCurrentYear(String currentYear) {
		this.currentYear = currentYear;
	}


	public void setStudentYearlyAttendance(Map<String, Set<StudentAttendance>> studentYearlyAttendance) {
		this.studentYearlyAttendance = studentYearlyAttendance;
	}


	public void setYearWiseStudentSubjectsAndMarksAndResult(
			Map<String, Set<StudentSubjectsAndMarksAndResult>> yearWiseStudentSubjectsAndMarksAndResult) {
		this.yearWiseStudentSubjectsAndMarksAndResult = yearWiseStudentSubjectsAndMarksAndResult;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentEmail=" + studentEmail
				+ ", studentbranch=" + studentbranch + ", studentJoinDate=" + studentJoinDate + ", currentYear="
				+ currentYear + ", studentYearlyAttendance=" + studentYearlyAttendance
				+ ", yearWiseStudentSubjectsAndMarksAndResult=" + yearWiseStudentSubjectsAndMarksAndResult + "]";
	}


}
