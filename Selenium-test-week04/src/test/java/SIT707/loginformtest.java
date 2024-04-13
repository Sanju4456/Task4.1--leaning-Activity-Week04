package SIT707;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class loginformtest {
	
		loginform inst;

	    @Test
		public void testloginUserFalsepassworddontcareresultUsernamemissmatch() {
			String results =  loginform.Login("xxxxxxxxeeee", "");
			Assert.assertEquals(results, "username mismatch");
			System.out.println("inside test");
			
		}

		@Before
		public void setup() {
			inst = new loginform();
			System.out.println("--setup");
		}
		
	}



