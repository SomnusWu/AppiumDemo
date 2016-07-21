package com.llg.base.bean;

import java.util.List;

import com.google.common.collect.Lists;

public class XmlNode {

	private XmlNode parent;
	private List<XmlNode> childs = Lists.newArrayList();
	private String name;
	private String value;
	private String nodeName;
	private String path;
	private int order;

	public XmlNode getParent() {
		return parent;
	}

	public List<XmlNode> getChilds() {
		return childs;
	}

	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}

	public String getNodeName() {
		return nodeName;
	}

	public void setParent(XmlNode parent) {
		this.parent = parent;
	}

	public void setChilds(List<XmlNode> childs) {
		this.childs = childs;
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
