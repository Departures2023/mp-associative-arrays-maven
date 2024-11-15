package edu.grinnell.csc207;

import edu.grinnell.csc207.util.AssociativeArray;
import edu.grinnell.csc207.util.NullKeyException;
import edu.grinnell.csc207.util.KeyNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;
import java.security.KeyException;
import org.junit.jupiter.api.Test;

/**
 * A place for you to put your own tests (beyond the shared repo).
 *
 * @author Kevin Tang
 */
public class TestsFromStudent {
  /**
   * Check general functionality of set() and hasKey().
   * 
   * @throws NullKeyException
   */
  @Test
  public void TangKevinTest1() throws NullKeyException, KeyNotFoundException {
    AssociativeArray<String, Integer> testArray = new AssociativeArray<String, Integer>();
    testArray.set("mango", 1);
    assertEquals(true, testArray.hasKey("mango"), "setted key should be found");
    assertEquals(false, testArray.hasKey("Mango"), "edge case of key");
    testArray.remove("mango");
    assertFalse(testArray.hasKey("Mango"), "removed key couldn't be found");
  } // kevinTangTest1

  /**
   * Check general functionality of set() and hasKey().
   * 
   * @throws NullKeyException
   */
  @Test
  public void TangKevinTest2() throws NullKeyException, KeyNotFoundException {
    AssociativeArray<Character, Integer> testArray = new AssociativeArray<Character, Integer>();
    testArray.set('a', 65);
    assertTrue(testArray.hasKey('a'), "setted key should be found");
    assertFalse(testArray.hasKey('A'), "edge case of key");
    testArray.remove('a');
    assertFalse(testArray.hasKey('a'), "removed key couldn't be found");
  } // kevinTangTest2

  /**
   * Check general functionality of repeated set() and hasKey().
   * 
   * @throws NullKeyException
   */
  @Test
  public void TangKevinEdge() throws NullKeyException, KeyNotFoundException {
    AssociativeArray<Boolean, Integer> testArray = new AssociativeArray<Boolean, Integer>();
    // Setting value to null should be handled.
    testArray.set(true, null);
    // Repeated key and value shouldn't be store two times.
    testArray.set(true, null);
    assertTrue(testArray.hasKey(true), "setted key should be found");
    assertFalse(testArray.hasKey(false), "edge case of key");
    testArray.remove(true);
    assertFalse(testArray.hasKey(true), "removed key couldn't be found");
  } // kevinTangEdge
} // class TestsFromSam
