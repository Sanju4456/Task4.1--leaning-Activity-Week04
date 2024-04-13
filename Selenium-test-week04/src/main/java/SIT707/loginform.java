package SIT707;

public class loginform {
	public static String Login(String username, String password ) {
		if (!username.equals("testuser"))
			return "username mismatch";
		
		if (!username.equals("testuser"))
			return "password mismatch";
		
		return "success";
	}

}
