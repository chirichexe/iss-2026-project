package main.java.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.conway.domain.IGrid;
import main.java.conway.domain.Life;
import main.java.conway.domain.LifeInterface;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/*
 * TEST PLAN
 */
public class LifeTest {
private LifeInterface lifeModel;

	int NUM_ROWS = 10;
	int NUM_COLS = 10;

	@Before
	public void setup() {
		System.out.println("GridTest | setup");	
		lifeModel = new Life(NUM_ROWS, NUM_COLS);
	}
	@After
	public void down() {
		System.out.println("GridTest | down");
	}
	
	@Test
	public void testSetCellAlive() {
	    
	    lifeModel.setCell(3, 3, true);
	
	    assertTrue(lifeModel.isAlive(3, 3));
	}
	
	@Test
	public void testSetCellDead() {
	
	    lifeModel.setCell(2, 1, false);
	
	    assertFalse(lifeModel.isAlive(2, 1));
	}
	
	@Test
	public void testLonelyCellDies() {
	
	    lifeModel.setCell(1, 1, true);
	    
	    lifeModel.nextGeneration();
	
	    assertFalse(lifeModel.isAlive(1, 1));
	}
	
	@Test
	public void testBlockStillLife() {
	
		lifeModel.setCell(1,1,true);
		lifeModel.setCell(1,2,true);
		lifeModel.setCell(2,1,true);
		lifeModel.setCell(2,2,true);
	
		lifeModel.nextGeneration();
	
	    assertTrue(lifeModel.isAlive(1,1));
	    assertTrue(lifeModel.isAlive(1,2));
	    assertTrue(lifeModel.isAlive(2,1));
	    assertTrue(lifeModel.isAlive(2,2));
	}
	
	@Test
	public void testReset() {
	
		lifeModel.setCell(3,3,true);
	
		lifeModel.resetGrids();
	
	    assertFalse(lifeModel.isAlive(3,3));
	}
	
	@Test
	public void testGetGrid() {
	
	    IGrid grid = lifeModel.getGrid();
	
	    assertNotNull(grid);
	}


}
