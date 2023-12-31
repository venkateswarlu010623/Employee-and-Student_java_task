package STUDENT_JAVA_TASK;

import java.util.List;

public class StudentSubjectsAndMarksAndResult {
	
	String subjectId;
	String subjectName;
	int marks;
	String result;
	
	public StudentSubjectsAndMarksAndResult(String subjectId, String subjectName, int marks, String result) {
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.marks = marks;
		this.result = result;
	}

	public String getSubjectId() {
		return subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public int getMarks() {
		return marks;
	}

	public String getResult() {
		return result;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "StudentSubjectsAndMarksAndResult [subjectId=" + subjectId + ", subjectName=" + subjectName + ", marks="
				+ marks + ", result=" + result + "]";
	}
	
}
