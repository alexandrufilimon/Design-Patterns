
public class AppTest {

	public static void main(String[] args) {
//		Carte newCarte = new Carte("Book name");
//		
//		Autor auth = new Autor("Autor name");
//		newCarte.addAutor(auth);
//		int indexOfChapter = newCarte.addCapitol("Capitolul unu");
//		Capitol chaptOne = newCarte.getCapitol(indexOfChapter);
//		int indexOfSubChapter = chaptOne.addSubcapitol("Subcapitolul unu"); 
//		Subcapitol chapOneOne = chaptOne.getSubcapitol(indexOfSubChapter);
//		int indexOfImage = chapOneOne.addImagine("Imaginea unu");
//		int indexOfParagraph = chapOneOne.addParagraf("Paragraful unu");
//		chapOneOne.addParagraf("Paragraful doi");
//		chapOneOne.addParagraf("Paragraful trei");
//		chapOneOne.addImagine("Imaginea doi");
//		chapOneOne.addParagraf("Paragraful patru");
//		chapOneOne.addTabel("Tabel unu");
//		
//		chapOneOne.print();

//		Carte noapteBuna = new Carte("Noapte buna, copii!");
//		Autor rpGheo = new Autor("Radu Pavel Gheo");
//		noapteBuna.addAutor(rpGheo);
//		Section cap1 = new Section("Capitolul 1");
//		Section cap11 = new Section("Capitolul 1.1");
//		Section cap111 = new Section("Capitolul 1.1.1");
//		Section cap1111 = new Section("Subchapter 1.1.1.1");
//		noapteBuna.addContent(new Paragraf("Multumesc celor care au facut posibila......"));
//		noapteBuna.addContent(cap1);
//		cap1.add(new Paragraf("Moto capitol"));
//		cap1.add(cap11);
//		cap11.add(new Paragraf("Text from subchapter 1.1"));
//		cap11.add(cap111);
//		cap111.add(new Paragraf("Text from subchapter 1.1.1"));
//		cap111.add(cap1111);
//		cap1111.add(new Imagine("Image subchapter 1.1.1.1"));
//		noapteBuna.print();
		
//		long startTime = System.currentTimeMillis();
//		ImageProxy img1 = new ImageProxy("Pamela Anderson");
//		ImageProxy img2 = new ImageProxy("Kim Kardashian");
//		ImageProxy img3 = new ImageProxy("Kirby Griffin");
//		Section playboyS1 = new Section("Front Cover");
//		playboyS1.add(img1);
//		Section playboyS2 = new Section("Summer Girls");
//		playboyS2.add(img2);
//		playboyS2.add(img3);
//		Book playboy = new Book("Playboy");
//		playboy.addContent(playboyS1);
//		playboy.addContent(playboyS2);
//		long endTime = System.currentTimeMillis();
//		System.out.println("Creation of the content took " + (endTime -
//		startTime) + " milliseconds");
//		startTime = System.currentTimeMillis();
//		playboyS1.print();
//		endTime = System.currentTimeMillis();
//		System.out.println("Printing of the section 1 took " + (endTime -
//		startTime) + " milliseconds");
//		startTime = System.currentTimeMillis();
//		playboyS1.print();
//		endTime = System.currentTimeMillis();
//		System.out.println("Printing again the section 1 took " + (endTime -
//		startTime) + " milliseconds");
		
//		Section cap1 = new Section("Capitolul 1");
//		Paragraph p1 = new Paragraph("Paragraph 1");
//		cap1.add(p1);
//		Paragraph p2 = new Paragraph("Paragraph 2");
//		cap1.add(p2);
//		Paragraph p3 = new Paragraph("Paragraph 3");
//		cap1.add(p3);
//		Paragraph p4 = new Paragraph("Paragraph 4");
//		cap1.add(p4);
//		System.out.println("Printing without Alignment");
//
//		System.out.println();
//		cap1.print();
//		p1.setAlignStrategy(new AlignCenter());
//		p2.setAlignStrategy(new AlignRight());
//		p3.setAlignStrategy(new AlignLeft());
//		System.out.println();
//		System.out.println("Printing with Alignment");
//		System.out.println();
//		cap1.print();

//		Section cap1 = new Section("Capitolul 1");
//		Paragraph p1 = new Paragraph("Paragraph 1");
//		cap1.add(p1);
//		Paragraph p2 = new Paragraph("Paragraph 2");
//		cap1.add(p2);
//		Paragraph p3 = new Paragraph("Paragraph 3");
//		cap1.add(p3);
//		Paragraph p4 = new Paragraph("Paragraph 4");
//		cap1.add(p4);
//		cap1.add(new ImageProxy("ImageOne"));
//		cap1.add(new Image("ImageTwo"));
//		cap1.add(new Paragraph("Some text"));
//		cap1.add(new Table("Table 1"));
//		BookStatistics stats = new BookStatistics();
//		cap1.accept(stats);
//		stats.printStatistics();
//		
//		BookFinancial financial = new BookFinancial();
//		cap1.accept(financial);
//		financial.printFinancial();
//		
//		BookSave save = new BookSave();
//		cap1.accept(save);
//		save.saveBook();
//		save.readBook();
		
//		Builder jsonBuilder = new JSONBuilder("book.json");
//		jsonBuilder.build();
//		Element myBook = jsonBuilder.getResult();
//		myBook.print();
//		
//		Command cmd1 = new OpenCommand("book.json");
//		cmd1.execute();
//		Command cmd2 = new StatisticsCommand();
//		cmd2.execute();
//		DocumentManager.getBook().print();
		
//		Section cap1 = new Section("Capitolul 1");
//		Paragraph p1 = new Paragraph("Paragraph 1");
//		cap1.add(p1);
//		Paragraph p2 = new Paragraph("Paragraph 2");
//		cap1.add(p2);
//		Paragraph p3 = new Paragraph("Paragraph 3");
//		cap1.add(p3);
//		Paragraph p4 = new Paragraph("Paragraph 4");
//		cap1.add(p4);
//		cap1.add(new ImageProxy("ImageOne"));
//		cap1.add(new Image("ImageTwo"));
//		cap1.add(new Paragraph("Some text"));
//		cap1.add(new Table("Table 1"));
////		FirstObserver firstObserver = new FirstObserver();
////		SecondObserver secondObserver = new SecondObserver();
////		cap1.addObserver(firstObserver);
////		cap1.addObserver(secondObserver);
////		p1.addObserver(firstObserver);
////		p1.addObserver(secondObserver);
////		p2.addObserver(firstObserver);
//		cap1.setNewValue("CHAPTER 1");
//		p1.setNewValue("PARAGRAPH 2");
//		p2.setNewValue("PARAGRAPH 3");
////		cap1.removeObserver(firstObserver);
//		cap1.setNewValue("CHAPTER 1.1");
		
		
		Section cap1 = new Section("Capitolul 1");
		cap1.add(new Paragraph("Moto capitol"));
		cap1.add(new Paragraph("Another One"));
		cap1.add(new Paragraph("Another Two"));
		cap1.add(new Paragraph("Another Three"));
		DocumentManager.getInstance().setBook(cap1);
		System.out.println("Book Content: ");
		DocumentManager.getInstance().getBook().print();

		new DeleteCommand().execute();
		System.out.println("Book Content after the first delete: ");
		DocumentManager.getInstance().getBook().print();
		new DeleteCommand().execute();
		System.out.println("Book Content after the second delete: ");
		DocumentManager.getInstance().getBook().print();

		Command undoCommand = new UndoCommand();
		undoCommand.execute();
		System.out.println("Book Content after first undo: ");
		DocumentManager.getInstance().getBook().print();
		undoCommand.execute();
		System.out.println("Book Content after second undo: ");
		DocumentManager.getInstance().getBook().print();

	}

}
