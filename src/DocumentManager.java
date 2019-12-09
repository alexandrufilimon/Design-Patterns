
public class DocumentManager {
	private static DocumentManager instance = null;
	private static Book book = null;
	private FirstObserver firstObserver = new FirstObserver();
	private SecondObserver secondObserver = new SecondObserver();

	
	
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
	
	public FirstObserver getFirstObserver(){
		return this.firstObserver;
	}
	
	public SecondObserver getSecondObserver(){
		return this.secondObserver;
	}

	public void setBook(Book book) {
		DocumentManager.book = book;
	}
	
	
	
	
	
}
