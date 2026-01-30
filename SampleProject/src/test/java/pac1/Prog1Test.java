package pac1;

import org.testng.annotations.Test;

class Prog1Test {

	@Test
	public void createContactTest()
	{
		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("browser","chrome");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println("Execute createcontactTest");
	}

	@Test 
	public void modifyContactTest()
	{
		System.out.println("Excecute Modify contact");
	}
	
}
