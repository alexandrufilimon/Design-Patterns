public class StatisticsCommand implements Command {
	
	public void execute() {
		Book myBook = DocumentManager.getInstance().getBook();
		BookStatistics stats = new BookStatistics();
		for(Element x : myBook.content){
			if(x instanceof Section)
				x.accept(stats);
		}
		stats.printStatistics();
	}

}
