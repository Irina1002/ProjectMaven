package JUnit;

	import static org.junit.Assert.*;


	import org.junit.Test;

	public class SubtractTest4 {
			
			@Test
			public void SubtractTest() {
				MyMathTest junit = new MyMathTest ();
				int result = junit.subtract(860, 8);
			assertEqual(852, result);	
			}

			private void assertEqual(int i, int result) {
				// TODO Auto-generated method stub
			
		}


}
