import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class TitleAndUrl {
	public static void main (String []args)throws InterruptedException {
		System.setProperty("webdriver.ie.driver", "E:\\selenium\\ie driverServer\\2.exe");
		WebDriver driver=new InternetExplorerDriver();
		String url="www.baidu.com";
		driver.get(url);
		System.out.println("����ٶ�ҳ��");
		Thread.sleep(3000);
		System.out.println("��ǰ���⣺"+driver.getTitle());
		System.out.println("��ǰURL��"+driver.getCurrentUrl());
		System.out.println("�ر������");
		driver.quit();
	}
}
//InterruptedException 