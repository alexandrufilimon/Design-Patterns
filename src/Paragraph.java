public class Paragraph implements Element {
	private String nume;
	private AlignStrategy strategy;

	public Paragraph(String nume) {
		super();
		this.nume = nume;
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
		}
		
	}
	
	public String toString() {
		return "Paragraph: " + nume;
	}
	
	public void setAlignStrategy(AlignStrategy obj){
		this.strategy = obj;
	}
	
}
