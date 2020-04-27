public class StudentInfo{
   public static void main(String[] args){
   StudentGrad myStudent = new StudentGrad();
   myStudent.Write(201856015, 1,"Bayu","lana", 2020,"Polmain Univercity");
   myStudent.Display();
   }
}
class Student {
   public void Write(int ID, int Grad, String Fname, String Lname) {
   m_ID = ID;
   m_Graduation = Grad;
   m_First = Fname;
   m_Last = Lname;
   }
   public void Display(){
      System.out.println("Student ID: " + m_ID);
      System.out.println("Student name : "+m_First + " " + m_Last);
      System.out.println("Graduated: " + m_Graduation);
   }
   private int m_ID, m_Graduation;
   private String m_First;
   private String m_Last;
}
class StudentGrad extends Student {
   public void Write(int ID, int Grad, String Fname, String Lname, int yrGrad, String unSch) {
      super.Write(ID, Grad, Fname, Lname);
      m_UndergradSchool = unSch;
      m_Grad = Grad;
      YearGraduated = yrGrad;
   }
   public void Display(){
      super.Display();
      System.out.println("Graduated From: "+ m_UndergradSchool);
      System.out.println("Graduation Year : "+ YearGraduated);
   }
   private Integer YearGraduated,m_Grad;
   private String m_UndergradSchool;
   private String m_Major;
   }