package dev;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import demoTestUnitaires.Saison;

public class SaisonTest
{
	@Test
	public void test()
	{
		assertTrue(Saison.FromLibelle("Hiver").equals(Saison.HIVER));
		assertTrue(Saison.FromLibelle("Hiveeeeeeer") != Saison.HIVER);
		assertNull(Saison.FromLibelle(null));
	}
}
