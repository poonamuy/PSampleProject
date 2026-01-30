package pac2;

import org.testng.annotations.Test;

class Prog2Test {

	@Test
	public void createOrgTest()
	{
		System.out.println("Execute createorgTest");
	}

	@Test 
	
	
	public void modifyOrgTest()
	{
		System.out.println("Excecute Modify org");
	}
	
}
/*<build>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-surefire-plugin</artifactId>
				<version>3.5.4</version>
				<configuration>
					<suiteXmlFiles>
						<suiteXmlFile>testng.xml</suiteXmlFile>
					</suiteXmlFiles>
				</configuration>
			</plugin>
		</plugins>
	</build>
 * */
