import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class ForwardAndBack  {
	public static void main(String []args)throws InterruptedException{
		System.setProperty("webdriver.ie.driver", "E:\\selenium\\ie driverServer\\2.exe");
		WebDriver dr=new InternetExplorerDriver();
		String FirstUrl="www.baidu.com";
		System.out.println("��ǰҳ��url��"+FirstUrl);
		dr.get(FirstUrl);
		Thread.sleep(3000);
		String SecondUrl="www.sina.com";
		System.out.println("��ǰҳ��url��"+SecondUrl);
		dr.get(SecondUrl);
		Thread.sleep(3000);
		System.out.println("back���url��"+FirstUrl);
		dr.navigate().back();
		Thread.sleep(1000);
		System.out.println("ǰ�����url"+SecondUrl);
		dr.navigate().forward();
		System.out.println("�����ر������");
		dr.quit();
	}
}
