package class6;

class Student{   
	  private String name;
	   private String idNo;
	   
	   public Student(String name, String idNo) {
	      this.name = name;
	      this.idNo = idNo;
	   }

	   public void showInfo()   {
	      System.out.println("이름:"+ name);
	      System.out.println("학번:"+ idNo+"\n");
	   }
	}