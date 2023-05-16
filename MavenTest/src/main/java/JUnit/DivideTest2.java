package JUnit;

import static org.junit.Assert.*;


import org.junit.Test;

public class DivideTest2 {
		
		@Test
		public void DividTest() {
			MyMathTest junit = new MyMathTest ();
			int result = junit.add(66, 2);
		assertEqual(33, result);	
		}

		private void assertEqual(int i, int result) {
			// TODO Auto-generated method stub
		
	}

}
