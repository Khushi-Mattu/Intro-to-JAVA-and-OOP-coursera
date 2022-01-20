package People;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class personTest {

	@Test
	void testPerson() {
		person person1=new person("Ted",22);
		person person2=new person("ted",22);
		
		//assertEquals uses == to compare primitives
		//lets compare ages of person 1 and person2
		assertEquals(person1.age,person2.age);
		
		//Ted is not equal to ted
		assertEquals(person1,person2);
		
		person person3=new person("Ted",34);
		assertEquals(person1,person3);
	}

}
