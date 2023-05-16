package JUnit;

	import static org.junit.Assert.*;


	import org.junit.Test;

	public class SubtractTest2 {
			
			@Test
			public void SubtractTest() {
				MyMathTest junit = new MyMathTest ();
				int result = junit.subtract(78, 8);
			assertEqual(70, result);	
			}

			private void assertEqual(int i, int result) {
				// TODO Auto-generated method stub
			
		}

}
