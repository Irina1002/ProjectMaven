package JUnit;

import static org.junit.Assert.*;


import org.junit.Test;

public class DivideTest {
		
		@Test
		public void DividTest() {
			MyMathTest junit = new MyMathTest ();
			int result = junit.add(400, 200);
		assertEqual(2, result);	
		}

		private void assertEqual(int i, int result) {
			// TODO Auto-generated method stub
		
	}

}
