package JUnit;

public class AddTest {
	public void AddTest() {
		MyMathTest junit = new MyMathTest ();
		int result = junit.add(100, 200);
	assertEqual(300, result);	
	}

	private void assertEqual(int i, int result) {
		// TODO Auto-generated method stub
		
	}
}
