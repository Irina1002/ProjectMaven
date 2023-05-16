package JUnit;

	import static org.junit.Assert.*;

	import org.junit.Test;

	public class AddTest3 {

		@Test
		public void AddTest() {
			MyMathTest junit = new MyMathTest ();
			int result = junit.add(3500, 6);
		assertEqual(3506, result);	
		}

		private void assertEqual(int i, int result) {
			// TODO Auto-generated method stub
			
		}
	}