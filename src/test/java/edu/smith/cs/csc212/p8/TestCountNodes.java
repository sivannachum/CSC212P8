package edu.smith.cs.csc212.p8;

import org.junit.Assert;
import org.junit.Test;

public class TestCountNodes {
	// Test a Trie that only has a root node
	@Test
	public void testEmpty() {
		CharTrie trie = new CharTrie();
		Assert.assertEquals(1, trie.countNodes());
	}
	
	// Test a Trie that actually has words in it
	@Test
	public void testMultiple() {
		CharTrie trie = new CharTrie();
		trie.insert("bug");
		trie.insert("bus");
		trie.insert("apple");
		Assert.assertEquals(10, trie.countNodes());
	}
}
