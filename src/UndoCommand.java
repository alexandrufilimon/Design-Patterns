public class UndoCommand implements Command {

	public void execute() {
		DocumentManager.getInstance();
		Book getBook = DocumentManager.getBook();
		Section sect = (Section) getBook.content.get(0);
		sect.add(DocumentManager.getStack().pop());
	}
	
	public void unexecute() {
		
	}
}
