package JUnit;

	import static org.junit.Assert.*;

	import org.junit.Test;

	public class AddTest2 {

		@Test
		public void AddTest() {
			MyMathTest junit = new MyMathTest ();
			int result = junit.add(35, 26);
		assertEqual(61, result);	
		}

		private void assertEqual(int i, int result) {
			// TODO Auto-generated method stub
			
		}
	}
	
