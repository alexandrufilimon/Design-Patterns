import java.util.List;

public class DeleteCommand implements Command {
	
	public void execute() {
		Book getBook = DocumentManager.getBook();
		Section sect = (Section) getBook.content.get(0);
		List<Element> listContent = sect.getContent();
		DocumentManager.getStack().push(listContent.get(listContent.size()-1));
		listContent.remove(listContent.size()-1);
	}
	
	public void unexecute() {
		
	}
}
