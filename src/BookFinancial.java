
public class BookFinancial extends BookStatistics implements Visitor {
	
	public void printFinancial(){
		System.out.println("Book Financial:");
		System.out.println("*** Price of images: " + imgCounter * 5 + "$");
		System.out.println("*** Price of tables: " + tableCounter * 5 + "$");
		System.out.println("*** Price of paragraphes: " + paraCounter * 5 + "$");
	}
}
