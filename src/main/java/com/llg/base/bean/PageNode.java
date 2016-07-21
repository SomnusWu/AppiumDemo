package com.llg.base.bean;
public class PageNode {
	public PageNode() {

	}

	public PageNode(XmlNode xmlNode) {
		this.name = xmlNode.getName();
		this.value = xmlNode.getValue();
		this.nodeName = xmlNode.getNodeName();
		this.path = xmlNode.getPath();
		this.order = xmlNode.getOrder();
	}

	public PageNode(String name, String value, String nodeName, String path, int order) {
		super();
		this.name = name;
		this.value = value;
		this.nodeName = nodeName;
		this.path = path;
		this.order = order;
	}

	private String name;
	private String value;
	private String nodeName;
	private String path;
	private int order;

	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}

	public String getNodeName() {
		return nodeName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public String getPath() {
		return path;
	}

	public int getOrder() {
		return order;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public void setOrder(int order) {
		this.order = order;
	}

}
