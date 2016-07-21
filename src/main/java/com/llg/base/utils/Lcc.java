package com.llg.base.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.alibaba.fastjson.JSON;

public class Lcc {

	public static void printE(WebElement e) {

		try {
			print("===========");
			print(e.getText());
			print(e.getTagName());
			print("===========");
		} catch (Exception e2) {
			print("===========");
		}

	}

	public static void print(Object object) {
		try {
			System.out.println(JSON.toJSONString(object, true));
		} catch (Exception e) {
			System.out.println(object.getClass().getName() + object + "打印JSON失败");
		}
	}

	public static void printPageNode(WebDriver wd) {
		try {
			print(XmlUtils.getPageNodes(wd.getPageSource().toString()));
		} catch (Exception e) {
			System.out.println("打印page失败" + e.getMessage());
		}	
	}
	
	
	public static void printPage(WebDriver wd) {
		try {
			System.out.println(wd.getPageSource().toString());
		} catch (Exception e) {
			System.out.println("打印page失败" + e.getMessage());
		}

	}

}
