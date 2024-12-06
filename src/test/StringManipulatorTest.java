package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.StringManipulator;

public class StringManipulatorTest {
   StringManipulator stringManipulator = new StringManipulator();

   @Test
   public void testReverse() {
      assertEquals("ELPmAxE", stringManipulator.reverse("ExAmPLE"));
      assertEquals("701 ESC", stringManipulator.reverse("CSE 107"));
   }

   @Test
   public void testIsPalindrome() {
      assertEquals(false, stringManipulator.isPalindrome("example"));
      assertEquals(true, stringManipulator.isPalindrome("ELpmpLE"));
   }

   @Test
   public void testIsContained() {
      assertEquals(true, stringManipulator.isContained("ExAmPLE", "Ex"));
      assertEquals(false, stringManipulator.isContained("ExAmPLE", "ex"));
   }

   @Test
   public void testNumberRemoved() {
      assertEquals("ExAmPLE", stringManipulator.numberRemoved("ExAm1PLE2"));
      assertEquals("Toan Tin Ung Dung", stringManipulator.numberRemoved("T0oan T1in Un5g D2ung"));
   }

   @Test
   public void testUpperString() {
      assertEquals("EXAMPLE", stringManipulator.upperString("example"));
      assertEquals("CSE 107", stringManipulator.upperString("cse 107"));
   }

   @Test
   public void testLowerString() {
      assertEquals("example", stringManipulator.lowerString("EXAMPLE"));
      assertEquals("toan tin ung dung", stringManipulator.lowerString("TOAN TIN UNG DUNG"));
   }

   @Test
   public void testCapitalString() {
      assertEquals("Example String", stringManipulator.capitalString("example string"));
      assertEquals("Toan Tin Ung Dung", stringManipulator.capitalString("toan tin ung dung"));
   }

   @Test
   public void testCountVowels() {
      assertEquals(3, stringManipulator.countVowels("Example"));
      assertEquals(5, stringManipulator.countVowels("Toan Tin Ung Dung"));
   }

   @Test
   public void testCountWords() {
      assertEquals(4, stringManipulator.countWords("Hello, how are you?"));
   }

   @Test
   public void testFindSubstringIndex() {
      assertEquals(5, stringManipulator.findSubstringIndex("Java programming", "programming"));
      assertEquals(-1, stringManipulator.findSubstringIndex("Java programming", "Programming"));
   }

   @Test(timeout = 1000)
   public void testReverseWords() {
      assertEquals("You Are How World Hello", stringManipulator.reverseWords("Hello World How Are You"));
   }

   @Test(timeout = 1000)
   public void testReverseWithTimeout() {
      assertEquals("ELPmAxE", stringManipulator.reverse("ExAmPLE"));
      assertEquals("701 ESC", stringManipulator.reverse("CSE 107"));
   }

   @Test(timeout = 1000)
   public void testIsPalindromeWithTimeout() {
      assertEquals(false, stringManipulator.isPalindrome("example"));
      assertEquals(true, stringManipulator.isPalindrome("ELpmpLE"));
   }

   @Test(timeout = 1000)
   public void testIsContainedWithTimeout() {
      assertEquals(true, stringManipulator.isContained("ExAmPLE", "Ex"));
      assertEquals(false, stringManipulator.isContained("ExAmPLE", "ex"));
   }

   @Test(timeout = 1000)
   public void testNumberRemovedWithTimeout() {
      assertEquals("ExAmPLE", stringManipulator.numberRemoved("ExAm1PLE2"));
      assertEquals("Toan Tin Ung Dung", stringManipulator.numberRemoved("T0oan T1in Un5g D2ung"));
   }

}
