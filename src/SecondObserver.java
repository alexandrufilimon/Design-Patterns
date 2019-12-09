
public class SecondObserver implements Observer{

	@Override
	public void update(String oldValue, String newValue) {
		// TODO Auto-generated method stub
		System.out.println("SecondObserver: Valorea " + oldValue + " s-a schimbat in " + newValue);
	}

}
