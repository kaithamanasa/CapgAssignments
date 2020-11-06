/**
 * Desc: Generate the list of students eligible for scholarship 
 * @author MANASA KAITHA
 *
 */
import java.util.*;
public class StudentMedal {
	  public HashMap<String,String> getStudent(HashMap<String,Integer> stu)
      {
             HashMap<String,String> medal = new HashMap<>();
             Set<String> set = stu.keySet();
             for(String s:set)
             {
                    Integer marks = stu.get(s);
                    if(marks>=90)
                    {
                          medal.put(s,"Gold");
                    }
                    else if(marks >=80)
                    {
                          medal.put(s,"Silver");
                    }
                    else if(marks>=70)
                    {
                          medal.put(s,"Bronze");
                    }
             }
             return medal;
      }
      public static void main(String[] ar)
      {
             HashMap<String,Integer> student = new HashMap<>();
             StudentMedal p = new StudentMedal();
             /* Hardcoded values are used at this point
              */
             student.put("R13",85);
             student.put("R14",92);
             student.put("R15",78);
             student.put("R16",75);
             student.put("R17",87);
             System.out.println(p.getStudent(student));
      }
}
