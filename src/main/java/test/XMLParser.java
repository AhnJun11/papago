package test;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLParser {
	public static void main(String[] args) {
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder db = dbFactory.newDocumentBuilder();
			Document document = db.parse("http://api.kcisa.kr/openapi/service/rest/convergence2017/conver3?serviceKey=2be8f524-9309-481e-b7e6-33ff1d09b448");
			Element root = document.getDocumentElement();
			NodeList nodeList = root.getChildNodes();
			for(int i=0;i<nodeList.getLength();i++) { // 2번돔 해드,바디
				Node n = nodeList.item(i);
				if(n.getNodeName().equals("body")) { // 바디면
					NodeList bodyNodeList = n.getChildNodes(); // 또 뽑아
					for(int j=0;j<bodyNodeList.getLength();j++) { // 4번돔 
						Node n2 = bodyNodeList.item(j);
						
						
						System.out.println(j+" n2번: "+n2.getNodeName());
						NodeList itemNodeList = n2.getChildNodes();
						for(int k=0;k<itemNodeList.getLength();k++) { // 10번돔 
							Node n3 = itemNodeList.item(k);
							System.out.println(k+ " n3번 : "+n3.getNodeName());
							System.out.println(n3.getTextContent());
						}
					}
				}
				System.out.println(n);
			}
		} catch (SAXException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ParserConfigurationException e) {

			e.printStackTrace();
		}
	}

}
