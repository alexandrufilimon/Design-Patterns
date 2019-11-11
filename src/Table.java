
public class Table implements Element {
	String nume;

	public Table(String nume) {
		super();
		this.nume = nume;
	}
	
	public void print() {
		System.out.println(toString());
	}
	
	public String toString() {
		return "Table with Title: " + nume;
	}

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
}
