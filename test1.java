import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tintu\\Work\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://spicejet.com");
		driver.findElement(By.id("divpaxinfo")).click();

		   Thread.sleep(3000L);

		   /*int i=1;

		while(i<5)

		{

		driver.findElement(By.id("hrefIncAdt")).click();//4 times

		i++;

		}*/

		   System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		   driver.findElement(By.id("divpaxinfo")).click();
		 driver.findElement(By.id("divpaxOptions")).click();

		   /*for(int i=1;i<5;i++)

		{

		driver.findElement(By.id("hrefIncAdt")).click();

		}*/
		   Select s= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		   driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
		   s.selectByValue("7");

		driver.findElement(By.id("btnclosepaxoption")).click();

		//Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());


	}

}
