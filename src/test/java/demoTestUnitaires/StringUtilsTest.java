package demoTestUnitaires;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringUtilsTest
{
	@Test
	public void testLevenshtein()
	{
		assertEquals(StringUtils.levenshteinDistance("chat", "chats"), 1);
		assertEquals(StringUtils.levenshteinDistance("machins", "machine"), 1);
		assertEquals(StringUtils.levenshteinDistance("aviron", "avion"), 1);
		assertEquals(StringUtils.levenshteinDistance("distance", "instance"), 2);
		assertEquals(StringUtils.levenshteinDistance("Chien", "Chine"), 2);
		assertEquals(StringUtils.levenshteinDistance(null, null), 0);
		assertEquals(StringUtils.levenshteinDistance("", ""), 0);
	}
}
