package Pom;

public class POM 
{
@FindBy(id = "email")
private WebElement un_ele;
@FindBy(id= "pass")
private WebElement un_pwd;
@FindBy (name= "login")
private WebElement un_btn;
public Pom(webDriver driver)
{
	PageFactory.initElements(driver,this);
	}
public void un(String u)
{
	un_ele.sendKeys(u);
	}
public void pwd (String p)
{
	un_pwd.sendKeys(p);
	
}
public void btn()
{
  un_btn.click();
}
}
