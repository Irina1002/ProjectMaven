package JUnit;

	import static org.junit.Assert.*;


	import org.junit.Test;

	public class MultiplyTest2 {
			
			@Test
			public void MultiplyTest() {
				MyMathTest junit = new MyMathTest ();
				int result = junit.multiply(45, 7);
			assertEqual(315, result);	
			}

			private void assertEqual(int i, int result) {
				// TODO Auto-generated method stub
			
		}





}
