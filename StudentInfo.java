package week3.day1.classroom;

public class StudentInfo {
       int studentID;
       String studentName;
       Long studentMob;
       String studentCollege;
       
       public void StudentInfo(int studentID, String studentName ) {
    	   System.out.println(studentMob+"****"+studentCollege);
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
              StudentInfo ram=new StudentInfo();
              ram.StudentInfo(2, "Divya");
              ram.StudentInfo(986656,"St" );
	}

}
