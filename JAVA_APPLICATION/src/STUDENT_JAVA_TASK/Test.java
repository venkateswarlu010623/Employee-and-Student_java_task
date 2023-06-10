package STUDENT_JAVA_TASK;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

		List<Subjects> subjectsList1 = List.of(
			    new Subjects(101, "mechanics", "year 1", "mechanical"),
			    new Subjects(102, "ES", "year 2", "ECE"),
			    new Subjects(103, "C++", "year 3", "CSC")
			);
		
		List<Subjects> subjectsList2 = List.of(
			    new Subjects(101, "mechanics", "year 2", "mechanical"),
			    new Subjects(103, "C++", "year 3", "CSC")
			);
		
		List<Subjects> subjectsList3 = List.of(
			    new Subjects(101, "mechanics", "year 1", "mechanical"),
			    new Subjects(102, "ES", "year 2", "ECE"),
			    new Subjects(103, "C++", "year 4", "CSC")
			);
		
		
		LocalDate attendanceYear1=LocalDate.of(2020, 1, 1);
		LocalDate attendanceYear2=LocalDate.of(2021, 1, 1);
		LocalDate attendanceYear3=LocalDate.of(2022, 1, 1);
		LocalDate attendanceYear4=LocalDate.of(2023, 1, 1);



		LocalDate staff1 = LocalDate.of(2020, 1, 1);
		LocalDate staff2 = LocalDate.of(2022, 1, 1);
		LocalDate staff3 = LocalDate.of(2018, 1, 1);
		LocalDate staff4 = LocalDate.of(2023, 1, 1);
		LocalDate staff5 = LocalDate.of(2022, 1, 1);
		
		LocalDate student1 = LocalDate.of(2020, 1, 1);
		LocalDate student2 = LocalDate.now();
		LocalDate student3 = LocalDate.of(2020, 1, 1);
		LocalDate student4 = LocalDate.of(2023, 1, 1);
		LocalDate student5 = LocalDate.of(2022, 1, 1);
		
		
		List<StaffAttendance> StaffAttendanceAndDetails= List.of(
				new StaffAttendance(staff1,"Present") , 
				new StaffAttendance(staff2,"Present") , 
				new StaffAttendance(staff3,"Present") , 
				new StaffAttendance(staff4,"Present") , 
				new StaffAttendance(staff5,"Present"));
		
		Set<StudentAttendance> StudentAttendanceAndDetails= Set.of(
				new StudentAttendance(LocalDate.of(2023, 6, 5),"Present") , 
				new StudentAttendance(LocalDate.of(2023, 6, 6),"Present") , 
				new StudentAttendance(LocalDate.of(2023, 6, 7),"Present") , 
				new StudentAttendance(LocalDate.of(2023, 6, 8),"Present") , 
				new StudentAttendance(LocalDate.now(),"Present"));
		
		
		Set<StudentSubjectsAndMarksAndResult> StudentSubjectsAndMarksAndResult11 = Set.of(
			    new StudentSubjectsAndMarksAndResult("101", "Mathematics", 99, "PASS"),
			    new StudentSubjectsAndMarksAndResult("102", "Physics", 99, "PASS"),
			    new StudentSubjectsAndMarksAndResult("103", "Mechanics", 22, "Fail")
			);
		
		Set<StudentSubjectsAndMarksAndResult> StudentSubjectsAndMarksAndResult12 = Set.of(
			    new StudentSubjectsAndMarksAndResult("101", "Mathematics", 99, "PASS"),
			    new StudentSubjectsAndMarksAndResult("102", "Physics", 99, "Fail"),
			    new StudentSubjectsAndMarksAndResult("103", "Mechanics", 22, "Fail")
			);
		
		Set<StudentSubjectsAndMarksAndResult> StudentSubjectsAndMarksAndResult13 = Set.of(
			    new StudentSubjectsAndMarksAndResult("101", "Mathematics", 99, "PASS"),
			    new StudentSubjectsAndMarksAndResult("102", "Physics", 99, "PASS"),
			    new StudentSubjectsAndMarksAndResult("103", "Mechanics", 22, "Fail")
			);

			Set<StudentSubjectsAndMarksAndResult> StudentSubjectsAndMarksAndResult2 = Set.of(
			    new StudentSubjectsAndMarksAndResult("101", "Computer Programming", 99, "PASS"),
			    new StudentSubjectsAndMarksAndResult("102", "Electrical Circuits", 99, "Fail"),
			    new StudentSubjectsAndMarksAndResult("103", "Digital Electronics", 22, "Fail")
			);

			Set<StudentSubjectsAndMarksAndResult> StudentSubjectsAndMarksAndResult3 = Set.of(
			    new StudentSubjectsAndMarksAndResult("101", "Thermodynamics", 99, "Fail"),
			    new StudentSubjectsAndMarksAndResult("102", "Fluid Mechanics", 99, "Fail"),
			    new StudentSubjectsAndMarksAndResult("103", "Structural Analysis", 22, "Fail")
			);

			Set<StudentSubjectsAndMarksAndResult> StudentSubjectsAndMarksAndResult4 = Set.of(
			    new StudentSubjectsAndMarksAndResult("101", "Civil Engineering Materials", 99, "PASS"),
			    new StudentSubjectsAndMarksAndResult("102", "Transportation Engineering", 99, "PASS"),
			    new StudentSubjectsAndMarksAndResult("103", "Geotechnical Engineering", 22, "Fail")
			);

		
		
		
		
		Map<String,Set<StudentAttendance>> studentYearlyAttendance1 = new LinkedHashMap<>();
		studentYearlyAttendance1.put("year 1", StudentAttendanceAndDetails);
		
		
		Map<String,Set<StudentAttendance>> studentYearlyAttendance2 = new LinkedHashMap<>();
		studentYearlyAttendance2.put("year 1", StudentAttendanceAndDetails);
		studentYearlyAttendance2.put("year 2", StudentAttendanceAndDetails);

		
		Map<String,Set<StudentAttendance>> studentYearlyAttendance3 = new LinkedHashMap<>();
		studentYearlyAttendance3.put("year 1", StudentAttendanceAndDetails);
		studentYearlyAttendance3.put("year 2", StudentAttendanceAndDetails);
		studentYearlyAttendance3.put("year 3", StudentAttendanceAndDetails);

	
		Map<String,Set<StudentAttendance>> studentYearlyAttendance4 = new LinkedHashMap<>();
		studentYearlyAttendance4.put("year 1", StudentAttendanceAndDetails);
		studentYearlyAttendance4.put("year 2", StudentAttendanceAndDetails);
		studentYearlyAttendance4.put("year 3", StudentAttendanceAndDetails);
		studentYearlyAttendance4.put("year 4", StudentAttendanceAndDetails);

		
		
		Map<String,Set<StudentSubjectsAndMarksAndResult>> yearWiseStudentSubjectsAndMarksAndResult1 = new LinkedHashMap<>();
		yearWiseStudentSubjectsAndMarksAndResult1.put("year 1", StudentSubjectsAndMarksAndResult11);
		yearWiseStudentSubjectsAndMarksAndResult1.put("year 2", StudentSubjectsAndMarksAndResult2);
		yearWiseStudentSubjectsAndMarksAndResult1.put("year 3", StudentSubjectsAndMarksAndResult3);
		yearWiseStudentSubjectsAndMarksAndResult1.put("year 4", StudentSubjectsAndMarksAndResult4);

		
		Map<String,Set<StudentSubjectsAndMarksAndResult>> yearWiseStudentSubjectsAndMarksAndResult2 = new LinkedHashMap<>();
		yearWiseStudentSubjectsAndMarksAndResult2.put("year 1", StudentSubjectsAndMarksAndResult12);
		yearWiseStudentSubjectsAndMarksAndResult2.put("year 2", StudentSubjectsAndMarksAndResult2);
		yearWiseStudentSubjectsAndMarksAndResult2.put("year 3", StudentSubjectsAndMarksAndResult3);
		yearWiseStudentSubjectsAndMarksAndResult2.put("year 4", StudentSubjectsAndMarksAndResult4);

		
		Map<String,Set<StudentSubjectsAndMarksAndResult>> yearWiseStudentSubjectsAndMarksAndResult3 = new LinkedHashMap<>();
		yearWiseStudentSubjectsAndMarksAndResult3.put("year 1", StudentSubjectsAndMarksAndResult13);
		yearWiseStudentSubjectsAndMarksAndResult3.put("year 2", StudentSubjectsAndMarksAndResult2);
		yearWiseStudentSubjectsAndMarksAndResult3.put("year 3", StudentSubjectsAndMarksAndResult3);
		yearWiseStudentSubjectsAndMarksAndResult3.put("year 4", StudentSubjectsAndMarksAndResult4);

		
	
				
		List<String> teachingYearOrWorkingYear1 = List.of("year 1","year 2","year 3","year 4");
		List<String> teachingYearOrWorkingYear2 = List.of("year 1","year 3","year 4");
		List<String> teachingYearOrWorkingYear3 = List.of("year 2","year 4");
		List<String> teachingYearOrWorkingYear4 = List.of("year 1","year 2");
		
		LocalDate staffJoinDate1 = LocalDate.of(2020, 1, 1);
		LocalDate staffJoinDate2 = LocalDate.of(2022, 1, 1);
		LocalDate staffJoinDate3 = LocalDate.of(2018, 1, 1);
		LocalDate staffJoinDate4 = LocalDate.of(2023, 1, 1);
		LocalDate staffJoinDate5 = LocalDate.of(2022, 1, 1);
		
		LocalDate studentJoinDate1 = LocalDate.of(2020, 1, 1);
		LocalDate studentJoinDate2 = LocalDate.of(2022, 1, 1);
		LocalDate studentJoinDate3 = LocalDate.of(2018, 1, 1);
		LocalDate studentJoinDate4 = LocalDate.of(2023, 1, 1);
		
		List<String> teachingOrWorkingBranches1 = List.of("mechanical","ECE","CEC");
		List<String> teachingOrWorkingBranches2 = List.of("ECE","CEC");
		List<String> teachingOrWorkingBranches3 = List.of("mechanical","ECE");
		
		
		Set<Student> students = Set.of(
				
				new Student("sid1","venkat","venkat@gmail.com","CSE",studentJoinDate1,"year 1",studentYearlyAttendance1,yearWiseStudentSubjectsAndMarksAndResult1),
				new Student("sid2","ramesh","ramesh@gmail.com","CSE",studentJoinDate1,"year 1",studentYearlyAttendance1,yearWiseStudentSubjectsAndMarksAndResult2),
				new Student("sid3","raghav","raghav@gmail.com","ECE",studentJoinDate1,"year 1",studentYearlyAttendance1,yearWiseStudentSubjectsAndMarksAndResult3),
				new Student("sid4","raju","raju@gmail.com","mechanical",studentJoinDate2,"year 2",studentYearlyAttendance2,yearWiseStudentSubjectsAndMarksAndResult1),
				new Student("sid7","keshav","keshav@gmail.com","ECE",studentJoinDate2,"year 2",studentYearlyAttendance2,yearWiseStudentSubjectsAndMarksAndResult2),
				new Student("sid5","krishna","krishna@gmail.com","CSE",studentJoinDate3,"year 3",studentYearlyAttendance3,yearWiseStudentSubjectsAndMarksAndResult3),
				new Student("sid6","gourav","gourav@gmail.com","CSE",studentJoinDate4,"year 4",studentYearlyAttendance4,yearWiseStudentSubjectsAndMarksAndResult1));


		List<Staff> staff = List.of(
				
		new Staff("id1","syam","syam@gmail.com",true,staffJoinDate1,teachingYearOrWorkingYear1,StaffAttendanceAndDetails,subjectsList1,teachingOrWorkingBranches1),
		new Staff("id2","ram","ram@gmail.com",true,staffJoinDate3,teachingYearOrWorkingYear4,StaffAttendanceAndDetails,subjectsList2,teachingOrWorkingBranches2),
		new Staff("id3","ratan","ratan@gmail.com",false,staffJoinDate5,teachingYearOrWorkingYear3,StaffAttendanceAndDetails,null,teachingOrWorkingBranches3),
		new Staff("id4","durga ","durga@gmail.com",true,staffJoinDate4,teachingYearOrWorkingYear2,StaffAttendanceAndDetails,subjectsList3,teachingOrWorkingBranches1),
		new Staff("id5","vnrao","vnrao@gmail.com",true,staffJoinDate1,teachingYearOrWorkingYear1,StaffAttendanceAndDetails,subjectsList2,teachingOrWorkingBranches1));
		
		
	//1) Retrieve student details in year 1
		System.out.println("1) Retrieve student details in year 1");
		System.out.println();
		students.stream().filter(s->s.currentYear.equals("year 1"))
						.forEach(f->System.out.println("Student id ="+f.studentId+" "+
														"Student name ="+f.studentName+" "+
														"current year="+f.currentYear));
		
     System.out.println();
	
	//2) Retrieve staff details who teach year 1
			System.out.println("2) Retrieve staff details who teach year 1");
			System.out.println();
			staff.stream().filter(s->s.teachingYearsOrWorkingYears.contains("year 1") &&
									s.isTeaching==true)
							.forEach(st->System.out.println(
									"staffName ="+st.staffName+" "+
									"staffEmail ="+st.staffEmail+" "+
									"isTeaching ="+st.isTeaching+" "+
									"studentJoinDate ="+st.staffJoinDate));
			
		     System.out.println();
		     
	//3) Retrieve Students who is present today in year 1 and branch CSE
	System.out.println("3) Retrieve employee who is present today in year 1 and branch CSE");
	System.out.println();
			
	LocalDate today = LocalDate.now();
	students.stream().filter(st->st.currentYear.equals("year 1") &&
								st.studentbranch.equalsIgnoreCase("CSE") && 
								st.studentYearlyAttendance.get("year 1").stream().
								anyMatch(e->e.studentAttendanceDate.isEqual(today))).
			forEach(f->System.out.println(
			"student name ="+f.studentName+" ,"+
			"current year ="+f.currentYear+" ,"+
			"Today attendance status ="+f.getStudentYearlyAttendance().get("year 1").
								stream().filter(f1->f1.studentAttendanceDate.isEqual(today)).
										findFirst().get().studentAttendancestatus));								
				    
			System.out.println();
	
	//4) Retrieve staff who is present today and who teaches Subject1
	System.out.println("4) Retrieve staff who is present today and who teaches Subject1");
	System.out.println();
	
staff.stream().filter(s->s.teachingsubjects != null)
	.filter(s->s.teachingsubjects.stream()
	.anyMatch(sub->sub.subjectName.equalsIgnoreCase("mechanics")) && s.isTeaching==true)
	.forEach(st->System.out.println(
								"staffName ="+st.staffName+" "+
								"staffEmail ="+st.staffEmail+" "));
	
			System.out.println();

	//5) Retrieve students who are not passed in year 1
	System.out.println("5) Retrieve students who are not passed in year 1");
	System.out.println();
			
	students.stream().filter(fs->!fs.getCurrentYear().equalsIgnoreCase("year 1") &&
								fs.yearWiseStudentSubjectsAndMarksAndResult.get("year 1")
								.stream().anyMatch(a->a.getResult().contains("Fail")))
								.forEach(student->{
											
								System.out.println(
									"studentId = "+student.getStudentId()+" ,"+
									"studentName = "+student.getStudentName()+" ,"+
									"studentBranch = "+student.getStudentbranch()+" ,"+
									"currentyear = "+student.getCurrentYear());
										
									System.out.println();
										
						student.yearWiseStudentSubjectsAndMarksAndResult.get("year 1").
								stream().filter(a->a.getResult().contains("Fail"))
								.forEach(s1->System.out.println(
										"subjectId = "+s1.getSubjectId()+" ,"+
										"subjectName = "+s1.getSubjectName()+" ,"+
										"marks = "+s1.getMarks()+" ,"+
										"result = "+s1.getResult()));
								
									System.out.println();
							});
			
			System.out.println();
		
	//6) Retrieve staff who teaches more than 2 subjects in year 2 (edited) 
	System.out.println("6) Retrieve staff who teaches more than 2 subjects in year 2");
	System.out.println();
			
	staff.stream().filter(s->s.isTeaching == true && s.teachingsubjects.stream().count()>2)
				.forEach(st->System.out.println(
						"Staffid ="+ st.staffId+" ,"+
						"StaffName ="+ st.staffName+" ,"+
						"StaffEmail = "+ st.staffEmail+" ,"+
						"No of subjects = "+st.teachingsubjects.stream().count()));
	}
	
}