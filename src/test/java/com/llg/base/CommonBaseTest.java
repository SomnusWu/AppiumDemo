package com.llg.base;

import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.llg.base.utils.Lcc;
import com.llg.base.utils.XmlUtils;

/**
 * 
 * @author yuanyh
 *
 */
// 对包含测试类的类或@Test注解方法使用@Ignore注解将使被注解的类或方法不会被当做测试执行
@Ignore
public abstract class CommonBaseTest {
	public static WebDriver wd;

	public static void printE(WebElement e) {
		Lcc.printE(e);
	}

	public static void print(String object) {
		Lcc.print(object);
	}
	/**
	 * 打印页面XML
	 * title
	 */
	public void printPage() {
		Lcc.print(wd);
	}

	public static WebElement getButtenByPath(String path) {
		WebElement telButton;
		telButton = wd.findElement(By.xpath(path));
		return telButton;
	}

	public static void cName(String name) {
		WebElement we = null;
		try {
			we = wd.findElement(By.name(name));
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (we == null) {
			
			
		}

	}

	public static void click(String path) {
		wd.findElement(By.xpath(path)).click();// 电话
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void sendKeys(String path, String value) {
		WebElement we = wd.findElement(By.xpath(path));
		we.clear();
		we.sendKeys(value);
	}

	public static void click(String path, long wait) {
		WebElement we = wd.findElement(By.xpath(path));
		we.click();//
		try {
			Thread.sleep(wait);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 打印节点对象
	 * title
	 */
	public static void ppNode() {
		Lcc.printPageNode(wd);
	}

	public static void pp() {
		Lcc.printPage(wd);

	}

}