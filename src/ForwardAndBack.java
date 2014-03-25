import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class ForwardAndBack  {
	public static void main(String []args)throws InterruptedException{
		System.setProperty("webdriver.ie.driver", "E:\\selenium\\ie driverServer\\2.exe");
		WebDriver dr=new InternetExplorerDriver();
		String FirstUrl="www.baidu.com";
		System.out.println("当前页面url："+FirstUrl);
		dr.get(FirstUrl);
		Thread.sleep(3000);
		String SecondUrl="www.sina.com";
		System.out.println("当前页面url："+SecondUrl);
		dr.get(SecondUrl);
		Thread.sleep(3000);
		System.out.println("back后的url："+FirstUrl);
		dr.navigate().back();
		Thread.sleep(1000);
		System.out.println("前进后的url"+SecondUrl);
		dr.navigate().forward();
		System.out.println("即将关闭浏览器");
		dr.quit();
	}
}
