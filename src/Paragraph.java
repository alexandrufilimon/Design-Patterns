import java.util.ArrayList;

public class Paragraph implements Element,Observable {
	private String nume;
	private AlignStrategy strategy;
	private String oldValue;
	private ArrayList<Observer> observersList = new ArrayList<Observer>();

	public Paragraph(String nume) {
		super();
		this.nume = nume;
		this.addObserver(DocumentManager.getInstance().getFirstObserver());
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
	
	
	public void print() {
		if(this.strategy != null){
			this.strategy.print(nume);
			System.out.println();
		}else {
			System.out.println("Paragraph with name: " + this.nume);
		}
		
	}
	
	public String toString() {
		return this.getClass().getName() + " " + nume;
	}
	
	public void setAlignStrategy(AlignStrategy obj){
		this.strategy = obj;
	}

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
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

	@Override
	public void setNewValue(String newValue) {
		// TODO Auto-generated method stub
		this.oldValue = this.nume;
		this.nume = newValue;
		notifyObservers();
	}
	
}
