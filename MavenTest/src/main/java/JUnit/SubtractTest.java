package JUnit;

	import static org.junit.Assert.*;


	import org.junit.Test;

	public class SubtractTest {
			
			@Test
			public void SubtractTest() {
				MyMathTest junit = new MyMathTest ();
				int result = junit.subtract(35, 7);
			assertEqual(28, result);	
			}

			private void assertEqual(int i, int result) {
				// TODO Auto-generated method stub
			
		}
}
