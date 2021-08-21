
public class Students {

	public void getStudentInfo(int id)
	{
		
	}
	public void getStudentInfo(int id,String name)
	{
		
	}
	public void getStudentInfo(String email,int phonenumber)
	{
		
	}
	public static void main(String[] args)
	{
		Students sd=new Students();
		sd.getStudentInfo(99);
		sd.getStudentInfo(99, "PK");
		sd.getStudentInfo("pk@gmail.com", 267676273);
		System.out.println("My Id is: " + 99);
		System.out.println("My name is:" + "PK");
		System.out.println("My Email id is:" + "pk@gmail.com");
		System.out.println("My Phone number is:" + 267676273);
	}
	}

