import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class Get {
	public static void main (String args[]){
		System.setProperty("webdriver.ie.driver","E:\\selenium\\ie driverServer\\2.exe");
		WebDriver dr=new InternetExplorerDriver();
		String url="www.baidu.com";
		System.out.println("��ǰurl��"+url);
		dr.get(url);
		System.out.println("����ҳ��");
		dr.quit();
	}
}
