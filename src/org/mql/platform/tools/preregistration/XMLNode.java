package org.mql.platform.tools.preregistration;

import java.util.Vector;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/*
 * Used in DOM parser
 *
 * @author abdelaliboumaiz
 * */
public class XMLNode {

  private Node node;
  private NamedNodeMap attributes;

  public XMLNode(Node node) {
    super();
    this.node = node;
    attributes = node.getAttributes();
  }

  public XMLNode(String source) {
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance(); //Factory class
    try {
      DocumentBuilder builder = factory.newDocumentBuilder();
      Document document = builder.parse(source); //org.w3c.dom
      node = document.getFirstChild();
      while (node.getNodeType() != Node.ELEMENT_NODE) {
        node = node.getNextSibling();
      }
    } catch (Exception e) {
      System.out.println("Erreur : " + e.getMessage());
    }
  }

  public Vector<XMLNode> getChildren(String name) {
    Vector<XMLNode> children = new Vector<>();
    NodeList list = node.getChildNodes();
    for (int i = 0; i < list.getLength(); i++) {
      Node a = list.item(i);
      if (a.getNodeName().equals(name)) {
        children.add(new XMLNode(a));
      }

    }
    return children;
  }

  public Vector<XMLNode> getChildren() {
    Vector<XMLNode> children = new Vector<>();
    NodeList list = node.getChildNodes();
    for (int i = 0; i < list.getLength(); i++) {
      Node a = list.item(i);
      if (a.getNodeType() == Node.ELEMENT_NODE) {
        children.add(new XMLNode(a));
      }

    }
    return children;
  }

  public XMLNode getChild(String name) {
    NodeList list = node.getChildNodes();
    for (int i = 0; i < list.getLength(); i++) {
      Node a = list.item(i);
      if (a.getNodeName().equals(name)) {
        return new XMLNode(a);
      }

    }
    return null;
  }

  public String getAttribute(String name) {
    return attributes.getNamedItem(name).getNodeValue();
  }

  public int getIntAttribute(String name) {
    String a = getAttribute(name);
    try {
      return Integer.parseInt(a);
    } catch (Exception e) {
      return -1;
    }
  }

  public double getDoubleAttribute(String name) {
    String a = getAttribute(name);
    try {
      return Double.parseDouble(a);
    } catch (Exception e) {
      return -1;
    }
  }

  public Long getLongAttribute(String name) {
    String a = getAttribute(name);
    try {
      return Long.parseLong(a);
    } catch (Exception e) {
      return -1L;
    }
  }

  public String getValue() {
    Node n = node.getFirstChild();
    if (n == null) {
      return "";
    } else {
      return n.getNodeValue();
    }
  }

  public int getIntValue() {
    Node n = node.getFirstChild();
    if (n == null) {
      return -1;
    } else {
      return Integer.parseInt(n.getNodeValue());
    }
  }

  public double getDoubleValue() {
    Node n = node.getFirstChild();
    if (n == null) {
      return -1;
    } else {
      return Double.parseDouble(n.getNodeValue());
    }
  }

  public Boolean getBooleanValue() {
    Node n = node.getFirstChild();
    if (n == null) {
      return null;
    } else {
      return Boolean.parseBoolean(n.getNodeValue());
    }
  }

  public Vector<XMLNode> select(String keyword) {
    keyword = keyword.toLowerCase();
    Vector<XMLNode> children = new Vector<>();
    NodeList list = node.getChildNodes();
    for (int i = 0; i < list.getLength(); i++) {
      Node a = list.item(i);
      if (a.getNodeType() == Node.ELEMENT_NODE) {
        XMLNode n = new XMLNode(a);
        if (n.contains(keyword)) {
          children.add(n);
        }
      }
    }
    return children;
  }

  public boolean contains(String keyword) {
    keyword = keyword.toLowerCase();
    if (getValue().toLowerCase().contains(keyword)) {
      return true;
    }
    Vector<XMLNode> children = getChildren();
    for (XMLNode child : children) {
      if (child.contains(keyword)) {
        return true;
      }
    }
    return false;
  }

}
