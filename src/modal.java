import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


public class modal {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "E:\\selenium\\ie driverServer\\2.exe");
		WebDriver dr=new InternetExplorerDriver();
		//File1.File1("src/modal.html");
		dr.get(File1.File1("src/modal.html"));
		Thread.sleep(3000);
		dr.findElement(By.linkText("Click")).click();
		(new WebDriverWait(dr,20)).until(new ExpectedCondition<Boolean>(){
			public Boolean apply(WebDriver d){
				return d.findElement(By.id("myModal")).isDisplayed();
			}
		});
		WebElement link=dr.findElement(By.id("myModal")).findElement(By.id("click"));
		((JavascriptExecutor)dr).executeScript("$(arguments[0]).click()", link);
		Thread.sleep(1000);
		dr.quit();
	}

}
