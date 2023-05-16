package JUnit;

	import static org.junit.Assert.*;


	import org.junit.Test;

	public class SubtractTest1 {
			
			@Test
			public void SubtractTest() {
				MyMathTest junit = new MyMathTest ();
				int result = junit.subtract(350, 7);
			assertEqual(343, result);	
			}

			private void assertEqual(int i, int result) {
				// TODO Auto-generated method stub
			
		}

}
