import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*****************************************************************
// ITC155 - Final - Problem 3 - JUnit Tests
// IntTree: isFull method
******************************************************************/

class JTestIntTree {


	@Test
	void testEmptyTree() {
		IntTree empty = new IntTree(); // empty IntTree (1 empty branch e.g. overallRoot)
		assertTrue(empty.isFull());
	}
	
	@Test 
	void testSingleNodeTree() {
		IntTree root = new IntTree(1);
		assertTrue(root.isFull()); // True since there are no branches off of root
	}
	

	@Test
	
	void testSequencialTree() {
		IntTree sequence = new IntTree(12);
		assertFalse(sequence.isFull());
	}
	
	@Test 

	void testSmallTree() {
		IntTree full = new IntTree(3);
		assertTrue(full.isFull());
	}
		
}
