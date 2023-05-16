
	package JUnit;

	import static org.junit.Assert.*;


	import org.junit.Test;

	public class DivideTest3 {
			
			@Test
			public void DividTest() {
				MyMathTest junit = new MyMathTest ();
				int result = junit.add(2, 2);
			assertEqual(1, result);	
			}

			private void assertEqual(int i, int result) {
				// TODO Auto-generated method stub
			
		}


}
