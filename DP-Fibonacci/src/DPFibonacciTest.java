import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author Dijkyon
 * 
 */
public class DPFibonacciTest {

	@Test
	public void testTopDownFibonacciOne() {
		System.out.println("Testing topDownFibonacci ");
		DPFibonacci dpfib = new DPFibonacci();
		assertTrue(dpfib.topdownFibonacci(1) == 1);
		assertTrue(dpfib.topdownFibonacci(2) == 1);
	}

	@Test
	public void testTopDownFibonacciTwo() {
		System.out.println("Testing topDownFibonacci ");
		DPFibonacci dpfib = new DPFibonacci();
		assertTrue(dpfib.topdownFibonacci(2) == 1);
	}

	@Test
	public void testTopDownFibonacciFive() {
		System.out.println("Testing topDownFibonacci ");
		DPFibonacci dpfib = new DPFibonacci();
		int val = 5;
		int s = dpfib.topdownFibonacci(val);
		assertTrue(s == 5);

	}

	@Test
	public void testBottomUpFibonacciOne() {
		System.out.println("Testing bottomupFibonacci ");
		DPFibonacci dpfib = new DPFibonacci();
		assertTrue(dpfib.bottomUpFibonacci(1) == 1);

	}

	@Test
	public void testBottomUpFibonacciTwo() {
		System.out.println("Testing bottomupFibonacci ");
		DPFibonacci dpfib = new DPFibonacci();
		assertTrue(dpfib.bottomUpFibonacci(2) == 1);
	}

	@Test
	public void testBottomUpFibonacciSix() {
		System.out.println("Testing bottomupFibonacci ");
		DPFibonacci dpfib = new DPFibonacci();
		int val = 6;
		int s = dpfib.bottomUpFibonacci(val);
		assertTrue(s == 8);
	}

}
