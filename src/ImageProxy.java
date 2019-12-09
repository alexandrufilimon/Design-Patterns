import java.util.ArrayList;

public class ImageProxy implements Element,Observable {
	String imageName;
	Image realImage;
	String oldValue;
	ArrayList<Observer> observersList = new ArrayList<Observer>();
	
	public ImageProxy(String imageName){
		this.imageName = imageName;
		this.addObserver(DocumentManager.getInstance().getFirstObserver());
	}
	
	
	@Override
	public void print() {
		if(realImage == null){
			this.realImage = new Image(imageName);
		}
		realImage.print();
	}
	
	public String toString(){
		return this.getClass().getName() + " " + this.imageName;
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
			x.update(this.oldValue, this.imageName);
		}
	}


	@Override
	public void setNewValue(String newValue) {
		// TODO Auto-generated method stub
		this.oldValue = this.imageName;
		this.imageName = newValue;
	}
	
	
	
	
	
}
