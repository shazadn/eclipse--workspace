import static org.junit.Assert.*;

import org.junit.Test;

public class GoldilockTest {
//	@Test
//	public void testy() {
//		fail();
//	}
//	@Test
//	public void twoTesty() {
//		System.out.println("Hello");
//	}
	
	@Test
	public void hot() {
		App app = new App();
		assertEquals("Too hot error", "Too hot", app.goldilocks(35));
	}
	
	@Test
	public void cold() {
		App app = new App();
		assertEquals("Too cold error", "Too cold", app.goldilocks(3));
	}
	
	@Test
	public void good() {
		App app = new App();
		assertEquals("Just right error", "Just right", app.goldilocks(20));
	}
	
}
