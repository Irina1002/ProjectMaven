 package JUnit;

	import static org.junit.Assert.*;


	import org.junit.Test;

	public class MultiplyTest1 {
			
			@Test
			public void MultiplyTest() {
				MyMathTest junit = new MyMathTest ();
				int result = junit.multiply(5, 7);
			assertEqual(35, result);	
			}

			private void assertEqual(int i, int result) {
				// TODO Auto-generated method stub
			
		}




}
