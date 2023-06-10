package STUDENT_JAVA_TASK;

import java.time.LocalDate;

public class StudentAttendance {
	
	LocalDate studentAttendanceDate;
	String studentAttendancestatus;
	
	
	public StudentAttendance(LocalDate studentAttendanceDate, String studentAttendancestatus) {
		this.studentAttendanceDate = studentAttendanceDate;
		this.studentAttendancestatus = studentAttendancestatus;
	}


	@Override
	public String toString() {
		return "StudentAttendance [studentAttendanceDate=" + studentAttendanceDate + ", studentAttendancestatus="
				+ studentAttendancestatus + "]";
	}
}
