package hacs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {

	Solution solution = new Solution();

	@Test
	void testToString() {
		solution.setTheAuthor("Rushikesh Patil");
		solution.setSolutionFileName("Solution");
		assertEquals("Rushikesh Patil Solution reported.", solution.toString());
	}

	@Test
	void testGetGradeString() {
		String expected = "-1";
		assertEquals(expected, solution.getGradeString());
	}

	@Test
	void testGetGradeInt() {
		int expected = 0;
		assertEquals(expected, solution.getGradeInt());
	}

	@Test
	void testSetReported() {
		solution.setReported(true);
		assertTrue(solution.isReported());
	}

	@Test
	void testIsReported() {
		solution.setReported(true);
		assertTrue(solution.isReported());
	}

}
