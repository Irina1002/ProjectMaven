
    package JUnit;

	import static org.junit.Assert.*;


	import org.junit.Test;

	public class MultiplyTest {
			
			@Test
			public void MultiplyTest() {
				MyMathTest junit = new MyMathTest ();
				int result = junit.multiply(566, 1);
			assertEqual(566, result);	
			}

			private void assertEqual(int i, int result) {
				// TODO Auto-generated method stub
			
		}



}


