package JUnit;

	import static org.junit.Assert.*;


	import org.junit.Test;

	public class DivideTest4 {
			
			@Test
			public void DividTest() {
				MyMathTest junit = new MyMathTest ();
				int result = junit.add(566, 0);
			assertEqual(0, result);	
			}

			private void assertEqual(int i, int result) {
				// TODO Auto-generated method stub
			
		}



}
