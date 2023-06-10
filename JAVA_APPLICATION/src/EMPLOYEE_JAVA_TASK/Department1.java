package EMPLOYEE_JAVA_TASK;

public class Department1 {
	
	int departmentId;
	String departmentName;
	
	public Department1(int departmentId, String departmentName) 
	{
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}
	@Override
	public String toString() {
		return "Department1 [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
}

//Department
//----------
//deptId
//deptName (healthcare, finance, admin, fraud)

