package Counter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {
	Counter counter;
	@BeforeEach
	void setUp() throws Exception {
		this.counter=new Counter();//initialize counter before every test method
	}

	@Test
	void testIncrement() {
		//on incrementing the first time it should give 1
		assertTrue(this.counter.increment()==1); // TODO
		
		//on incrementing the second time it should give 2
		assertTrue(this.counter.increment()==2);
		
		this.counter.increment();
		assertFalse(this.counter.getCount()==2,"should not return 2 after incrementing 3 times");
		
		assertEquals(3,this.counter.getCount()); //expects 3 when calling get count
		
		//calling increment again should not return 3
		assertNotEquals(3,this.counter.increment());
	}

	@Test
	void testDecrement() {
		
		//calling decrement for the first time should return -1
		assertEquals(-1,this.counter.decrement());
		
		//calling decrement again returns -2
		assertTrue(this.counter.decrement()==-2);
		
		this.counter.decrement();
		
		assertFalse(this.counter.getCount()==-2,"should not return -2 after calling decrement again");
		
		assertTrue(this.counter.getCount()==-3);
		
	}

}
