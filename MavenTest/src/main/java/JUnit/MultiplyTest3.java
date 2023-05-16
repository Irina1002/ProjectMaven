package JUnit;

	import static org.junit.Assert.*;


	import org.junit.Test;

	public class MultiplyTest3 {
			
			@Test
			public void MultiplyTest() {
				MyMathTest junit = new MyMathTest ();
				int result = junit.multiply(0, 7);
			assertEqual(0, result);	
			}

			private void assertEqual(int i, int result) {
				// TODO Auto-generated method stub
			
		}

	}



