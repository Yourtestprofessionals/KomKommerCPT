package codebase;

public class CheckArgs {

	
	public static String CheckArg1(String arg1) {
		  if (arg1.equals("PRO")) {
              arg1 = "PRO";
		  	}
		  if (arg1.equals("ACC")) {
              arg1 = "ACC";
		  }
		return arg1;
		  } 
		  
	
		  public static String CheckArg2(String arg2) {
			  if (arg2.equals("testleader")) {
	              arg2 = "testleader";
			  	}
			  if (arg2.equals("tester")) {
	              arg2 = "tester";
			  }
			  if (arg2.equals("developer")) {
	              arg2 = "developer";
			  }
			  if (arg2.equals("projectmanager")) {
	              arg2 = "projectmanager";
			  }
			  return arg2;
		  }	  
		  
		  
		  
		  
		  public static String CheckArg3(String arg3) {
			  if (arg3.equals("Chrome")) {
	              arg3 = "Chrome";
			  	}
			  if (arg3.equals("Firefox")) {
	              arg3 = "Firefox";
			  }
			return arg3;
			  }	 

}
