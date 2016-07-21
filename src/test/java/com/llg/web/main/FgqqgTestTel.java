package com.llg.web.main;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import com.llg.base.CommonBaseTest;
import com.saucelabs.appium.page_object.ios.TestAppScreenSimple;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * 
 * @author Administrator
 *
 */
public class FgqqgTestTel extends CommonBaseTest {

	private TestAppScreenSimple uiTestApp;

	@Before
	public void setUp() throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.3");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6s");
		boolean isMoni = true;
		if (isMoni) {// 模拟器运行
			capabilities.setCapability("app",
					"/Users/root/Library/Developer/Xcode/DerivedData/LLG-bouqnctmduleunftywqjfuyebfyw/Build/Products/Release-iphonesimulator/LLG.app");
		} else {
			capabilities.setCapability("app", "com.gongsiname.LLG");// 真机
		}
		uiTestApp = new TestAppScreenSimple();
		wd = new IOSDriver<MobileElement>(new URL("http://192.168.0.4:4723/wd/hub"), capabilities);
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		PageFactory.initElements(new AppiumFieldDecorator(wd), uiTestApp);
	}

	@After
	public void tearDown() throws Exception {
		print("退出");
		wd.quit();// 结束退出
	}

	@Test
	public void testLoin() throws Exception {
		
		
		
		//printPage();//打印页面XML
		ppNode();//打印节点对象
		
		String path = "//UIAApplication[1]/UIAWindow[1]/UIAButton[7]";//电话的路径
		click(path);
		
		//sendKeys(path, "15111882335");
		
		//ppNode();//打印节点对象----电话主页
		
		

	}

	// private void doLogin() throws InterruptedException {
	// wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIATextField[1]"))
	// .clear();
	// wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIATextField[1]"))
	// .sendKeys("15111882335");
	// Thread.sleep(1000);
	//
	// wd.findElement(
	// By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIASecureTextField[1]"))
	// .clear();
	// wd.findElement(
	// By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIASecureTextField[1]"))
	// .sendKeys("123456");
	// Thread.sleep(1000);
	// wd.findElement(
	// By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIALink[5]/UIAStaticText[1]"))
	// .click();
	// Thread.sleep(1000);
	// }

}
