package JUnit;

	import static org.junit.Assert.*;

	import org.junit.Test;

	public class AddTest4 {

		@Test
		public void AddTest() {
			MyMathTest junit = new MyMathTest ();
			int result = junit.add(370, 6);
		assertEqual(376, result);	
		}

		private void assertEqual(int i, int result) {
			// TODO Auto-generated method stub
			
		}
	}
