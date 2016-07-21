package com.llg.base.utils;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.llg.base.bean.PageNode;
import com.llg.base.bean.XmlNode;

public class XmlUtils {
	public static void main(String[] args) {
		String xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?><AppiumAUT><UIAApplication name=\"风购全球\" label=\"风购全球\" value=\"\" dom=\"\" enabled=\"true\" valid=\"true\" visible=\"true\" hint=\"\" path=\"/0\" x=\"0\" y=\"0\" width=\"375\" height=\"667\"><UIAWindow name=\"\" label=\"\" value=\"\" dom=\"\" enabled=\"true\" valid=\"true\" visible=\"true\" hint=\"\" path=\"/0/0\" x=\"0\" y=\"0\" width=\"375\" height=\"667\"><UIAScrollView name=\"\" label=\"\" value=\"\" dom=\"\" enabled=\"true\" valid=\"true\" visible=\"true\" hint=\"\" path=\"/0/0/0\" x=\"0\" y=\"0\" width=\"375\" height=\"413.54\"><UIAButton name=\"\" label=\"\" value=\"\" dom=\"\" enabled=\"true\" valid=\"true\" visible=\"true\" hint=\"\" path=\"/0/0/0/0\" x=\"0\" y=\"0\" width=\"375\" height=\"413.54\"></UIAButton><UIAImage name=\"\" label=\"\" value=\"\" dom=\"\" enabled=\"true\" valid=\"true\" visible=\"false\" hint=\"\" path=\"/0/0/0/1\" x=\"3\" y=\"408.04\" width=\"369\" height=\"2.5\"></UIAImage><UIAImage name=\"\" label=\"\" value=\"\" dom=\"\" enabled=\"true\" valid=\"true\" visible=\"false\" hint=\"\" path=\"/0/0/0/2\" x=\"369.5\" y=\"403.54\" width=\"2.5\" height=\"7\"></UIAImage></UIAScrollView><UIAButton name=\"重庆市\" label=\"重庆市\" value=\"\" dom=\"\" enabled=\"true\" valid=\"true\" visible=\"true\" hint=\"\" path=\"/0/0/1\" x=\"8\" y=\"20\" width=\"56\" height=\"30\"></UIAButton><UIAImage name=\"bjg_shouye_hongbao1\" label=\"\" value=\"\" dom=\"\" enabled=\"true\" valid=\"true\" visible=\"true\" hint=\"\" path=\"/0/0/2\" x=\"335\" y=\"358.54\" width=\"36\" height=\"45\"></UIAImage><UIAPageIndicator name=\"\" label=\"\" value=\"page 1 of 2\" dom=\"\" enabled=\"true\" valid=\"true\" visible=\"true\" hint=\"\" path=\"/0/0/3\" x=\"167.5\" y=\"393.54\" width=\"40\" height=\"25\"></UIAPageIndicator><UIAButton name=\"商品汇\" label=\"商品汇\" value=\"\" dom=\"\" enabled=\"true\" valid=\"true\" visible=\"true\" hint=\"\" path=\"/0/0/4\" x=\"0\" y=\"413.54\" width=\"125\" height=\"126.72999999999996\"></UIAButton><UIAButton name=\"团购商家\" label=\"团购商家\" value=\"\" dom=\"\" enabled=\"true\" valid=\"true\" visible=\"true\" hint=\"\" path=\"/0/0/5\" x=\"125\" y=\"413.54\" width=\"125\" height=\"126.72999999999996\"></UIAButton><UIAButton name=\"个人中心\" label=\"个人中心\" value=\"\" dom=\"\" enabled=\"true\" valid=\"true\" visible=\"true\" hint=\"\" path=\"/0/0/6\" x=\"250\" y=\"413.54\" width=\"125\" height=\"126.72999999999996\"></UIAButton><UIAButton name=\"邀请好友\" label=\"邀请好友\" value=\"\" dom=\"\" enabled=\"true\" valid=\"true\" visible=\"true\" hint=\"\" path=\"/0/0/7\" x=\"0\" y=\"540.27\" width=\"125\" height=\"126.73000000000002\"></UIAButton><UIAButton name=\"我的广告\" label=\"我的广告\" value=\"\" dom=\"\" enabled=\"true\" valid=\"true\" visible=\"true\" hint=\"\" path=\"/0/0/8\" x=\"125\" y=\"540.27\" width=\"125\" height=\"126.73000000000002\"></UIAButton><UIAButton name=\"电话\" label=\"电话\" value=\"\" dom=\"\" enabled=\"true\" valid=\"true\" visible=\"true\" hint=\"\" path=\"/0/0/9\" x=\"250\" y=\"540.27\" width=\"125\" height=\"126.73000000000002\"></UIAButton><UIAToolbar name=\"\" label=\"\" value=\"\" dom=\"\" enabled=\"true\" valid=\"true\" visible=\"false\" hint=\"\" path=\"/0/0/10\" x=\"0\" y=\"667\" width=\"375\" height=\"44\"><UIAImage name=\"\" label=\"\" value=\"\" dom=\"\" enabled=\"true\" valid=\"true\" visible=\"false\" hint=\"\" path=\"/0/0/10/0\" x=\"0\" y=\"666.5\" width=\"375\" height=\"0.5\"></UIAImage><UIAImage name=\"\" label=\"\" value=\"\" dom=\"\" enabled=\"true\" valid=\"true\" visible=\"false\" hint=\"\" path=\"/0/0/10/1\" x=\"0\" y=\"667\" width=\"375\" height=\"44\"></UIAImage></UIAToolbar></UIAWindow><UIAWindow name=\"\" label=\"\" value=\"\" dom=\"\" enabled=\"true\" valid=\"true\" visible=\"false\" hint=\"\" path=\"/0/1\" x=\"0\" y=\"0\" width=\"375\" height=\"667\"></UIAWindow><UIAWindow name=\"\" label=\"\" value=\"\" dom=\"\" enabled=\"true\" valid=\"true\" visible=\"true\" hint=\"\" path=\"/0/2\" x=\"0\" y=\"0\" width=\"375\" height=\"667\"><UIAStatusBar name=\"\" label=\"\" value=\"\" dom=\"\" enabled=\"true\" valid=\"true\" visible=\"true\" hint=\"\" path=\"/0/2/0\" x=\"0\" y=\"0\" width=\"375\" height=\"20\"><UIAElement name=\"无服务\" label=\"无服务\" value=\"\" dom=\"\" enabled=\"true\" valid=\"true\" visible=\"true\" hint=\"Swipe down with three fingers to reveal the notification center., Swipe up with three fingers to reveal the control center, Double-tap to scroll to top\" path=\"/0/2/0/0\" x=\"6\" y=\"0\" width=\"36\" height=\"20\"></UIAElement><UIAElement name=\"3 of 3 Wi-Fi bars\" label=\"3 of 3 Wi-Fi bars\" value=\"SSID\" dom=\"\" enabled=\"true\" valid=\"true\" visible=\"true\" hint=\"Swipe down with three fingers to reveal the notification center., Swipe up with three fingers to reveal the control center, Double-tap to scroll to top\" path=\"/0/2/0/1\" x=\"47\" y=\"0\" width=\"13\" height=\"20\"></UIAElement><UIAElement name=\"08:13\" label=\"08:13\" value=\"\" dom=\"\" enabled=\"true\" valid=\"true\" visible=\"true\" hint=\"Swipe down with three fingers to reveal the notification center., Swipe up with three fingers to reveal the control center, Double-tap to scroll to top\" path=\"/0/2/0/2\" x=\"172\" y=\"0\" width=\"34\" height=\"20\"></UIAElement><UIAElement name=\"Orientation Locked\" label=\"Orientation Locked\" value=\"\" dom=\"\" enabled=\"true\" valid=\"true\" visible=\"true\" hint=\"Swipe down with three fingers to reveal the notification center., Swipe up with three fingers to reveal the control center, Double-tap to scroll to top\" path=\"/0/2/0/3\" x=\"285\" y=\"0\" width=\"12\" height=\"20\"></UIAElement><UIAElement name=\"100% battery power, On AC Power\" label=\"100% battery power, On AC Power\" value=\"\" dom=\"\" enabled=\"true\" valid=\"true\" visible=\"true\" hint=\"Swipe down with three fingers to reveal the notification center., Swipe up with three fingers to reveal the control center, Double-tap to scroll to top\" path=\"/0/2/0/4\" x=\"303\" y=\"0\" width=\"67\" height=\"20\"></UIAElement></UIAStatusBar></UIAWindow></UIAApplication></AppiumAUT>";
		XmlNode xmlNode = getXmlNode(xml);
		List<PageNode> list = getPageNodes(xml);
		
		Lcc.print(list);
		
		Lcc.print(xmlNode);
	}

	public static XmlNode getXmlNode(String xml) {
		try {
			Map<String, String> map = Maps.newHashMap();
			Document document = DocumentHelper.parseText(xml);
			Element nodeElement = document.getRootElement();
			XmlNode xmlNode = new XmlNode();
			Element first = (Element) nodeElement.elements().get(0);
			xmlNode.setNodeName(first.getName());
			xmlNode.setName(first.attributeValue("name"));
			xmlNode.setPath("//" + first.getName() + "[1]");
			xmlNode.setOrder(1);
			List<PageNode> pageNodes = Lists.newArrayList();
			pageNodes.add(new PageNode(xmlNode));
			dealChilds(first, xmlNode, pageNodes,true);
			nodeElement = null;
			document = null;
			return xmlNode;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static List<PageNode> getPageNodes(String xml) {
		try {
			Map<String, String> map = Maps.newHashMap();
			Document document = DocumentHelper.parseText(xml);
			Element nodeElement = document.getRootElement();
			XmlNode xmlNode = new XmlNode();
			Element first = (Element) nodeElement.elements().get(0);
			xmlNode.setNodeName(first.getName());
			xmlNode.setName(first.attributeValue("name"));
			xmlNode.setPath("//" + first.getName() + "[1]");
			xmlNode.setOrder(1);
			List<PageNode> pageNodes = Lists.newArrayList();					
			pageNodes.add(new PageNode(xmlNode));
			dealChilds(first, xmlNode, pageNodes,true);
			nodeElement = null;
			document = null;
			return pageNodes;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void dealChilds(Element elm, XmlNode parent, List<PageNode> pageNodes,boolean isAll) {
		List node = elm.elements();
		int i = 1;
		for (Iterator it = node.iterator(); it.hasNext();) {
			XmlNode child = new XmlNode();
			Element childNode = (Element) it.next();
			child.setNodeName(childNode.getName());
			
			child.setName(childNode.attributeValue("name"));
			
			child.setOrder(i);
			child.setPath(parent.getPath() + "/" + childNode.getName() + "[" + i + "]");
			parent.getChilds().add(child);
			
			pageNodes.add(new PageNode(child));
			
			dealChilds(childNode, child, pageNodes,isAll);
			i++;
		}
	}
}
