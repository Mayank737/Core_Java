package Exaptionhandling;

public class TestLoginExep {

	public static void main(String[] args) throws LoginExep  {
		/*try {
			auth("vijay");
		} catch (LoginExep e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		auth("vijay");
	}

	private static void auth(String name) throws LoginExep {
		// TODO Auto-generated method stub
		if(!name.equals("admin")) {
			LoginExep e = new LoginExep();
			System.out.println(e.getMessage());
			throw e;
					
		}
	}

}
