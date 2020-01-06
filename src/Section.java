import java.util.ArrayList;
import java.util.List;

public class Section implements Element,Observable {
	private String sectionTitle;
	private List<Element> content = new ArrayList<>();
	private String oldContent;
	private ArrayList<Observer> observersList = new ArrayList<Observer>();
	
	public Section(String sectionTitle) {
		this.sectionTitle = sectionTitle;
		this.addObserver(DocumentManager.getInstance().getFirstObserver());
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
	
	public List<Element> getContent(){
		return this.content;
	}
	

	@Override
	public void print() {
		System.out.println(sectionTitle);
		for(Element x : content) {
			x.print();		
		}
	}
	
	public void removeLastElement(){
		this.content.remove(content.size());
	}

	public void accept(Visitor visitor) {
		for(Element x : content){
			x.accept(visitor);
		}
	}

	@Override
	public void setNewValue(String newValue) {
		// TODO Auto-generated method stub
		this.oldContent = this.sectionTitle;
		this.sectionTitle = newValue;
	}

	@Override
	public void addObserver(Observer obs) {
		// TODO Auto-generated method stub
		this.observersList.add(obs);
		
	}

	@Override
	public void removeObserver(Observer obs) {
		// TODO Auto-generated method stub
		this.observersList.remove(obs);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer x : this.observersList){
			x.update(this.oldContent, this.sectionTitle);
		}
	}
	
}
