import java.util.Stack;

public class DocumentManager {
	private static DocumentManager instance = null;
	private static Book book = null;
	private FirstObserver firstObserver = new FirstObserver();
	private SecondObserver secondObserver = new SecondObserver();
	private static Stack<Element> stack = new Stack<>();
	private static int itemsDeleted = 0;

	
	
	public static DocumentManager getInstance(){
		if(instance == null){	
			instance = new DocumentManager();
		}
		return instance;
	}
	
	public static Stack<Element> getStack(){
		return stack;
	}
	
	public static void setItemsDeleted(int itemsDel){
		itemsDeleted = itemsDel;
	}
	
	public static int getItemsDeleted(){
		return itemsDeleted;
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
	
	public void setBook(Section section){
		Book bk = new Book(null);
		bk.addContent(section);
		book = bk;
	}
	
	public void addCommand(Command command){
		
	}
	
	
	
	
	
}
