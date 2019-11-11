
public interface Visitor {
	public void visit(Paragraph paragraph);
	public void visit(ImageProxy imageProxy);
	public void visit(Table table);
	public void visit(Image image);
}
