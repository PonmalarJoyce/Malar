package week3.college;

public class ExecutionCollege {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("************COLLEGE***************");
		
		College clgObj = new College();
		clgObj.collegeName();
		clgObj.collegeCode();
		clgObj.collegeRank();
		
		System.out.println("************Department*********");
		
		Department andrDeptObj = new Department();
		andrDeptObj.collegeName();
		andrDeptObj.collegeCode();
		andrDeptObj.collegeRank();
		andrDeptObj.deptName();
		
		System.out.println("************Student************");
		
		Student studentObj = new Student();
		studentObj.collegeName();
		studentObj.collegeCode();
		studentObj.collegeRank();
		studentObj.deptName();
		studentObj.studentName();
		studentObj.studentDept();
		studentObj.studentId();
		
		
		
	}

}
