package com.llg.web.main;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class AndroidContactsTest {
	private AppiumDriver<AndroidElement> driver;
	private static final String APPPID = "com.bjg.lcc.privateproject:id/";

	@Before
	public void setUp() throws Exception {
		// set up appium
		File classpathRoot = new File(System.getProperty("user.dir"));
		// 存放app目录：apps
		File appDir = new File(classpathRoot, "apps");
		File app = new File(appDir, "PrivateLLG-release.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("device", "Android");
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		// 我真机的安卓版本是4.2.2
		capabilities.setCapability(CapabilityType.VERSION, "4.4.4");
		capabilities.setCapability("deviceName", "MI_3");
		capabilities.setCapability("platformName", "Android");

		// 使用的是windows平台
		capabilities.setCapability(CapabilityType.PLATFORM, "WINDOWS");
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("app-package", "com.bjg.lcc.privateproject");
		capabilities.setCapability("appActivity", "com.llg.privateproject.actvity.web.WelcomeActivity");

		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		// unicode包，这样就能对中文更好的支持
		capabilities.setCapability("unicodeKeyboard", "True");
		capabilities.setCapability("resetKeyboard", "True");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void addContact() throws Exception {
		System.out.print("start ... ");

		WebElement el = driver.findElement(By.name("启动Layout")); // ok
		
		double x = driver.manage().window().getSize().getWidth();// x的值为安卓设备的宽
		double y = driver.manage().window().getSize().getHeight();// y的值为安卓设备的高

		System.out.println("x - " + x + "y -- >" + y);
		/**
		 * app引导页 滑动
		 */
		for (int i = 0; i < 4; i++)// 有时左滑手势不行，故多循环了几次
		{

			System.out.println(i);
			driver.swipe((int) (x * 0.9), (int) (y * 0.8), (int) (x * 0.1), (int) (y * 0.8), 500);// 左滑手势

		}
		el.click();

		//点击首页个人中心
		driver.findElement(By.id("com.bjg.lcc.privateproject:id/wodehoutai")).click();
		// // ok
		//点击登陆/注册
		driver.findElement(By.id("com.bjg.lcc.privateproject:id/ralay_head")).click();

		Thread.sleep(2000);
		// Set<String> contextNames = driver.getContextHandles();
		// for (String contextName : contextNames) {
		// System.out.println(contextName);
		// if (contextName.contains("WEBVIEW")) {
		// driver.context(contextName);
		// }
		// }
		
		try {
			//弹窗 跳转微信自动登陆  点击取消
			driver.findElement(By.name("取消 Link")).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
		

		/**
		 * 登陆注册 输入框
		 */
		List<AndroidElement> textFieldsList = driver.findElementsByClassName("android.widget.EditText");

		System.out.println("textFieldsList" + textFieldsList);
		
		textFieldsList.get(0).sendKeys("14045678901");//账号
		textFieldsList.get(1).sendKeys("chrdwHDHXT.");//密码

		driver.findElement(By.name("登录 Link")).click();

		//登陆完成 返回按钮
		driver.findElement(By.id("back")).click();

		
		/**
		 * 进入电话界面
		 */
		driver.findElement(By.id(APPPID + "dianhua")).click();

		/**
		 * 拨号键盘 按键
		 */
		driver.findElement(By.id(APPPID + "view_keyborad_01")).click();
		driver.findElement(By.id(APPPID + "view_keyborad_03")).click();
		driver.findElement(By.id(APPPID + "view_keyborad_07")).click();
		driver.findElement(By.id(APPPID + "view_keyborad_06")).click();
		driver.findElement(By.id(APPPID + "view_keyborad_04")).click();
		driver.findElement(By.id(APPPID + "view_keyborad_07")).click();
		driver.findElement(By.id(APPPID + "view_keyborad_11")).click();//代表  0 
		driver.findElement(By.id(APPPID + "view_keyborad_11")).click();
		driver.findElement(By.id(APPPID + "view_keyborad_05")).click();
		driver.findElement(By.id(APPPID + "view_keyborad_03")).click();
		driver.findElement(By.id(APPPID + "view_keyborad_05")).click();
		
		

		// inputField.sendKeys("Some name");
		// inputField.submit();

		Thread.sleep(5000);
		System.out.print("sssssssss");

	}

}
