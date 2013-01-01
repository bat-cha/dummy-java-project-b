package org.batcha.dummy.project.b;

import static org.junit.Assert.*;

import org.batcha.dummy.project.b.BStuff;
import org.batcha.dummy.project.b.ProjectBAPI;
import org.junit.Test;

public class BStuffTest {

	@Test
	public void test() {
		ProjectBAPI api = new BStuff();
		String input = "test";
		String output = api.typicalBStuff(input);
		assertTrue(output.equals(input));		
	}

}
