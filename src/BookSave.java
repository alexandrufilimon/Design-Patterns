import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookSave implements Visitor {
	List<Element> content = new ArrayList<>();

	@Override
	public void visit(Paragraph paragraph) {
		// TODO Auto-generated method stub
		content.add(paragraph);
	}

	@Override
	public void visit(ImageProxy imageProxy) {
		// TODO Auto-generated method stub
		content.add(imageProxy);
	}

	@Override
	public void visit(Table table) {
		// TODO Auto-generated method stub
		content.add(table);
	}

	@Override
	public void visit(Image image) {
		// TODO Auto-generated method stub
		content.add(image);
	}
	
	public void saveBook(){
		try{
		    FileOutputStream outputStream = new FileOutputStream("BookSave.txt");
		    for(Element x : content){
		    	String str = x.toString() + "\n";
		    	byte[] strToBytes = str.getBytes();
		    	outputStream.write(strToBytes);
		    }
		 
		    outputStream.close();
		} catch(IOException e){
			System.out.println("File couldn't be created / found");
		}
	}
	public void readBook(){
		File file = new File("BookSave.txt");
		FileInputStream fis = null;

		try {
			fis = new FileInputStream(file);

			System.out.println("Reading Book from file:");
			
			int content;
			while ((content = fis.read()) != -1) {
				System.out.print((char) content);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

}
