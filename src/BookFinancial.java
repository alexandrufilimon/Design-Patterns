
public class BookFinancial extends BookStatistics implements Visitor {
	
	public void printFinancial(){
		System.out.println("Book Financial:");
		System.out.println("*** Price of images: " + this.imgCounter * 5 + "$");
		System.out.println("*** Price of tables: " + this.tableCounter * 5 + "$");
		System.out.println("*** Price of paragraphes: " + this.paraCounter * 5 + "$");
	}
}
