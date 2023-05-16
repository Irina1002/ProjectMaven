package JUnit;

	import static org.junit.Assert.*;


	import org.junit.Test;

	public class SubtractTest3 {
			
			@Test
			public void SubtractTest() {
				MyMathTest junit = new MyMathTest ();
				int result = junit.subtract(7800, 8);
			assertEqual(7792, result);	
			}

			private void assertEqual(int i, int result) {
				// TODO Auto-generated method stub
			
		}

}
