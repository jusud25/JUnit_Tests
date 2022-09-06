
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester {
//The instance fields of GradeBook objects
private GradeBook book1;
private GradeBook book2;
	@BeforeEach
	void setUp() throws Exception {
	/*
	 * The instance of GradeBook and its size
	 */
		book1=new GradeBook(5);
		book2=new GradeBook(5);
	//The object takes in a score
		book1.addScore(75);
		book1.addScore(5);
		book1.addScore(20);
		book2.addScore(20);
		book2.addScore(10);
		book2.addScore(5);
	}
	@AfterEach
	void tearDown() throws Exception {
		book1=null;
		book2=null;
	}
	@Test
	/*
	 * This mathod takes the sum of all 
	 * the numbers in each object
	 */
	void testSum() {
	assertEquals(100,book1.sum(), .0001);
	assertEquals(35,book2.sum(), .0001);		
	}
	@Test
	/*
	 * The method reads the number 
	 * in each of the object
	 */
	void testMinimum() {
	assertEquals(5, book1.minimum(),.001);
	assertEquals(5, book2.minimum(),.001);	
		}
	@Test
	/*
	 * To return a string representation 
	 */
	void addScoreTest() {
	assertEquals(false,book1.toString().equals("75 5 20"));
	assertEquals(false,book2.toString().equals("20 10 5"));
	}
	@Test
	 /*
	  * To add all the scores in each object 
	  * and subtract from it the smallest number. 
	  */
	void finalScore() {
	assertEquals(95,book1.finalScore(), .001);
	assertEquals(30,book2.finalScore(), .001);
	}
}

