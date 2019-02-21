//user class
import java.util.Scanner;
class Driver
{

	public static void main(String...args)throws ClassNotFoundException,IllegalAccessException,InstantiationException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Vehicle:  ");
		String clssName=sc.nextLine();
		Class cls=Class.forName(clssName);
		System.out.println(clssName+"  is loaded");
		Object obj=cls.newInstance();
		System.out.println(clssName+"  Object is created");
		System.out.println(obj);
		if(obj instanceof Vehicle){
	      Vehicle v =(Vehicle)obj;
			  v.start();
			  v.move();
			  v.stop();
				  }
				  else{
				  System.out.println("this obj not a Vehicle object");
				  }

	}
}
/*   Enter Vehicle:
      java.lang.String
     java.lang.Stringis loaded
     java.lang.StringObject is created
                                                         <-------this  plc empty becoz String cls is empty cls
														 9776466716-mihir
      this obj not a Vehicle object*/
