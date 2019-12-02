import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XMLBuilder implements Builder {
	String filename;
	Element document;
	
	XMLBuilder(String filename){
		this.filename = filename;
	}
	
	@Override
	public Element getResult() {
		return this.document;
	}

	@Override
	public void build() {
		try {
			XmlMapper mapper = new XmlMapper();
			HashMap<String, Object> map = mapper.readValue(new File(filename),
			HashMap.class);
//			document = processMap(map);
			
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

	private Element processMap(HashMap<String, Object> childMap) {
		String className = (String) childMap.get("class");
		if(className.equals("Paragraph")){
			return this.buildParagraph(childMap);
		}else if(className.equals("Image")){
			return this.buildImage(childMap);
		}else if(className.equals("ImageProxy")){
			return this.buildImageProxy(childMap);
		}else if(className.equals("Section")){
			return this.buildSection(childMap);
		}else return this.buildTable(childMap);
	}

	@Override
	public Element buildSection(HashMap<String, Object> map) {
		Section section = new Section((String)map.get("class"));
		Collection<HashMap<String, Object>> children = (Collection)map.get("children");
		children.forEach((childMap) -> {

		Element e = this.processMap(childMap);
		if (e != null) {
			try {
				section.add(e);
			} catch (Exception var5) {
				var5.printStackTrace();
			}
		}
		});
		return section;
	}

	@Override
	public Element buildParagraph(HashMap<String, Object> map) {
		Paragraph paragraph = new Paragraph((String)map.get("text"));
		return paragraph;
	}

	@Override
	public Element buildImage(HashMap<String, Object> map) {
		Image image = new Image((String)map.get("url"));
		return image;
	}

	@Override
	public Element buildImageProxy(HashMap<String, Object> map) {
		ImageProxy imageProxy = new ImageProxy((String)map.get("url"));
		return imageProxy;
	}

	@Override
	public Element buildTable(HashMap<String, Object> map) {
		Table table = new Table((String)map.get("text"));
		return table;
	}

}
