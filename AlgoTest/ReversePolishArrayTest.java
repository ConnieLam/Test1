import static org.junit.Assert.*;

import org.junit.Test;

import EvaluateReversePolishNotation.ReversePolishArray;


public class ReversePolishArrayTest {

	@Test
	public void testConstruction() {
		String[] array_Cmd = {"2","3","+","3","*"};
		ReversePolishArray test = new ReversePolishArray(array_Cmd);
		String result = test.Solution();
		assertEquals("15",result);
	}

}
