
public class DocumentManager {
	private static DocumentManager instance = null;
	private static Book book = null;

	
	
	public static DocumentManager getInstance(){
		if(instance == null){	
			instance = new DocumentManager();
		}
		return instance;
	}
	
	public static Book getBook() {
		if(book == null){
			book = new Book(null);
		}
		return book;
	}

	public void setBook(Book book) {
		DocumentManager.book = book;
	}
	
	
	
	
	
}
