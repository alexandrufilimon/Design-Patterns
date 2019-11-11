import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
	String sectionTitle;
	List<Element> content = new ArrayList<>();
	
	public Section(String sectionTitle) {
		this.sectionTitle = sectionTitle;
	}
	
	public int add(Element elm) {
		content.add(elm);
		return content.indexOf(elm);
	}
	
	public void remove(Element elm) {
		content.remove(elm);
	}
	
	public Element getElement(int index) {
		return content.get(index);
	}

	@Override
	public void print() {
		System.out.println(sectionTitle);
		for(Element x : content) {
			x.print();		
		}
	}

	public void accept(Visitor visitor) {
		for(Element x : content){
			x.accept(visitor);
		}
	}
	
//	public String toString() {
//		StringBuilder sb = new StringBuilder();
//		sb.append(sectionTitle + "\n");
//		for(Element x : content) {
//			sb.append(x + "\n");
//		}
//		return sb.toString();
//	}
	
	
}
