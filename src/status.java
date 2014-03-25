import java.io.File;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class status {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "E:\\selenium\\ie driverServer\\2.exe");
		WebDriver dr=new InternetExplorerDriver();
		File file=new File("src/status.html");
		String filePath="file:///"+file.getAbsolutePath();
		System.out.println(filePath);
		dr.get(filePath);
		Thread.sleep(3000);
		//�ж��Ƿ񱻻һ�
		WebElement isEnable=dr.findElement(By.name("user"));
		System.out.println("�Ƿ񱻻һ�:"+isEnable.isEnabled());
		System.out.println(dr.findElement(By.className("btn disabled")).isEnabled());
		//�ж��Ƿ�ѡ��
		WebElement radio=dr.findElement(By.name("radio"));
		radio.click();
		System.out.println("�Ƿ�ѡ�У�"+radio.isSelected());
		try{
			dr.findElement(By.id("none"));
		}catch(NoSuchElementException e){
			System.out.print("element is not exesit");
		}
		//�ж��Ƿ���ʾ
		((JavascriptExecutor)dr).executeScript("(arguments[0]).hide()", textField);
		System.out.println(textField.isDisplayed);
		System.out.println("close Browse");
		dr.quit();
	}

}
