import java.util.concurrent.TimeUnit;

public class Image implements Element {
	private String nume;

	public Image(){}
	
	public Image(String nume) {
		this.nume = nume;
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
	
}
