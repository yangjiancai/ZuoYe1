import java.io.File;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class File1 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static String File1(String file_path) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		File file=new File(file_path);
		String filepath="file:///"+file.getAbsolutePath();
		System.out.println(filepath);
		return filepath;
		
	}
}