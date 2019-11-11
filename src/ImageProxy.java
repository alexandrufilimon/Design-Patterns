
public class ImageProxy implements Element {
	String imageName;
	Image realImage;
	
	public ImageProxy(String imageName){
		this.imageName = imageName;
	}
	
	
	@Override
	public void print() {
		if(realImage == null){
			this.realImage = new Image(imageName);
		}
		realImage.print();
	}
	
	public String toString(){
		return this.imageName;
	}


	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
	
	
	
	
	
}
