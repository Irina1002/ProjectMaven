package JUnit;

import org.junit.Test;

public class DivideTest1 {
		
		@Test
		public void DividTest() {
			MyMathTest junit = new MyMathTest ();
			int result = junit.add(566, 2);
		assertEqual(283, result);	
		}

		private void assertEqual(int i, int result) {
			// TODO Auto-generated method stub
		
	}
}
