
public interface Element {
	public void accept(Visitor visitor);
	public void print();
	public void setNewValue(String newValue);
}
