
	package JUnit;

	import static org.junit.Assert.*;

	import org.junit.Test;

	public class AddTest1 {

		@Test
		public void AddTest() {
			MyMathTest junit = new MyMathTest ();
			int result = junit.add(235, 26);
		assertEqual(261, result);	
		}

		private void assertEqual(int i, int result) {
			// TODO Auto-generated method stub
			
		}
	}
