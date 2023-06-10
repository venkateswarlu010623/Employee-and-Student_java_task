package STUDENT_JAVA_TASK;

public class Subjects {
	
	int subjectId;
	String subjectName;
	String subjectyear;
	String branch;
	
	
	public Subjects(int subjectId, String subjectName, String subjectyear, String branch) {
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.subjectyear = subjectyear;
		this.branch = branch;
	}


	@Override
	public String toString() {
		return "Subjects [subjectId=" + subjectId + ", subjectName=" + subjectName + ", subjectyear=" + subjectyear
				+ ", branch=" + branch + "]";
	}
	
	}
