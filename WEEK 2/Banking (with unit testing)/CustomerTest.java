package Banking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerTest {
	
	Customer customer;
	@BeforeEach
	void setUp() throws Exception {
		this.customer=new Customer("Brandon");
	}

	@Test
	void testSetAddress() {
		
		//confirms initial value of address is null
		assertNull(this.customer.getAddress());
		
		this.customer.setAddress("Brooklyn,NY");
		
		//checks the address was set correctly
		assertEquals("Brooklyn,NY",this.customer.getAddress());
		
		//reset address for customer
		this.customer.setAddress("Cranston,RI");
		
		//checks that address was reset correctly
		assertEquals("Cranston,RI",this.customer.getAddress());
		
	}

}
