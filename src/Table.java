
public class Table implements Element {
	String nume;

	public Table(String nume) {
		super();
		this.nume = nume;
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
}
