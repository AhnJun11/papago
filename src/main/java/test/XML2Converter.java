package test;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONObject;
import org.json.XML;

public class XML2Converter {
	
	public static void main(String[] args) {
		String xml="<testXML>\r\n"
				+ "   <tests>\r\n"
				+ "      <rows>\r\n"
				+ "         <row>\r\n"
				+ "            <name>hahah</name>\r\n"
				+ "            <age>22</age>\r\n"
				+ "         </row>\r\n"
				+ "         <row>\r\n"
				+ "            <name>kim</name>\r\n"
				+ "            <age>32</age>\r\n"
				+ "         </row>\r\n"
				+ "         <row>\r\n"
				+ "            <name>lee</name>\r\n"
				+ "            <age>42</age>\r\n"
				+ "         </row>\r\n"
				+ "      </rows>\r\n"
				+ "   </tests>\r\n"
				+ "   <testTitle>Title</testTitle>\r\n"
				+ "   <testSubTitle>subTitle</testSubTitle>\r\n"
				+ "</testXML>";
		
		JSONObject jo= XML.toJSONObject(xml);
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(jo.toString());
		
	}

}
