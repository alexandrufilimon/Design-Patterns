
public class FirstObserver implements Observer{

	@Override
	public void update(String oldValue, String newValue) {
		System.out.println("FirstObserver: Valorea " + oldValue + " s-a schimbat in " + newValue);
		
	}
	
}
