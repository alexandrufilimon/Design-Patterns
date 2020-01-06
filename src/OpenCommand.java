
public class OpenCommand implements Command {
	String filename;
	
	public OpenCommand(String filename){
		this.filename = filename;
	}
	
	
	public void execute() {
		Builder jsonBuilder = new JSONBuilder(filename);
		jsonBuilder.build();
		Element myBook = jsonBuilder.getResult();
		DocumentManager.getBook().addContent(myBook);
	}
	
	public void unexecute() {
		
	}

}
