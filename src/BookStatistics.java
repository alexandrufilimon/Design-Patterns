
public class BookStatistics implements Visitor {
	private int imgCounter;
	private int paraCounter;
	private int tableCounter;

	@Override
	public void visit(Image image) {
		imgCounter++;
	}

	@Override
	public void visit(Paragraph paragraph) {
		paraCounter++;
		
	}

	@Override
	public void visit(ImageProxy imageProxy) {
		imgCounter++;
	}

	@Override
	public void visit(Table table) {
		tableCounter++;
	}
	
	public void printStatistics(){
		System.out.println("Book Statistics: ");
		System.out.println("*** Number of images: " + imgCounter);
		System.out.println("*** Number of tables: " + tableCounter);
		System.out.println("*** Number of paragraphes: " + paraCounter);
	}
	
}
