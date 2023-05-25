package TestScripts;

import Generic.Generic_Data;
import Pom.POM;

public class Sample extends GenericClass

{
@Test
public void test()
{
	String user_name = Generic_Data.get_data("Sheet1", 0, 0);
	String password = Generic_Data.get_data("Sheet1", 0, 1);
	POM p= new Pom(driver);
	p.un(user_name);
	p.pwd(password);
	p.btn();
	}
}
