package JUnit;

	import static org.junit.Assert.*;


	import org.junit.Test;

	public class MultiplyTest4 {
			
			@Test
			public void MultiplyTest() {
				MyMathTest junit = new MyMathTest ();
				int result = junit.multiply(5, 8);
			assertEqual(40, result);	
			}

			private void assertEqual(int i, int result) {
				// TODO Auto-generated method stub
			
		}
}
