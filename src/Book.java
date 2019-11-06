import java.util.ArrayList;
import java.util.List;

public class Book {
	
	String nume;
	List<Author> autori = new ArrayList<Author>();
	List<Element> content = new ArrayList<Element>();
	

	public Book(String nume) {
		super();
		this.nume = nume;
	}
	
	
	public void addAutor(Author e) {
		autori.add(e);
	}
	
	public void addContent(Element elm) {
		content.add(elm);
	}
	
	public Author getAutor(int index) {
		return autori.get(index);
	}
	
	public void print() {
		System.out.println("Book: " + nume);
		System.out.println();
		System.out.println("Authors:");
		for(Author x : autori)
			x.print();
		System.out.println();
		for(Element x : content)
			x.print();
	}
	
	
	
}
