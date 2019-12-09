import java.util.ArrayList;

public class Table implements Element,Observable {
	private String nume;
	private String oldValue;
	private ArrayList<Observer> observersList = new ArrayList<Observer>();
	
	public Table(String nume) {
		this.nume = nume;
		this.addObserver(DocumentManager.getInstance().getFirstObserver());
	}
	
	public void print() {
		System.out.println("Table with Title: " + nume);
	}
	
	public String toString() {
		return this.nume;
	}

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

	@Override
	public void setNewValue(String newValue) {
		// TODO Auto-generated method stub
		this.oldValue = this.nume;
		this.nume = newValue;
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
			x.update(this.oldValue, this.nume);
		}
	}
}
