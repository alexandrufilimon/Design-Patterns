import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Image implements Element,Observable {
	private String nume;
	private String oldValue;
	private ArrayList<Observer> observersList = new ArrayList<Observer>();

	public Image(){}
	
	public Image(String nume) {
		this.nume = nume;
		this.addObserver(DocumentManager.getInstance().getFirstObserver());
		try {
			TimeUnit.SECONDS.sleep(5);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void print() {
		System.out.println("Image with name: " + nume);
	}
	
	public String toString(){
		return this.getClass().getName() + " " + this.nume;
	}

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

	@Override
	public void addObserver(Observer obs) {
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
	}
	
}
