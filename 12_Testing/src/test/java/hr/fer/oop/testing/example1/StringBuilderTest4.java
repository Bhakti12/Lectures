package hr.fer.oop.testing.example1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringBuilderTest4 {

    private StringBuilder sb;

    @BeforeEach
    public void setUp() {
        sb = new StringBuilder();
    }

    @Test
    public void testEmpty() {
        assertTrue(sb.toString().equals(""));
        assertTrue(sb.length() == 0);
    }

    @Test
    public void testAppend() {
        sb.append("Some text");
        assertEquals("Some text", sb.toString());
        assertEquals(9, sb.length());
    }

    @Test
    public void testReverse() {
        sb.append("Some text");
        sb.reverse();
        assertEquals("txet emoS", sb.toString());
        assertEquals(9, sb.length());
    }

    @Test
    public void testInsert() {
        sb.append("Some text");
        sb.insert(5, "other ");
        assertEquals("Some other text", sb.toString());
        assertEquals(15, sb.length());
    }

    @Test
    public void testDelete() {
        sb.append("Some text");
        sb.delete(4, 9);
        assertEquals("Some", sb.toString());
        assertEquals(4, sb.length());
    }
    
    @Test
    public void testDeleteChatAt() {
        sb.append("Some text");
        sb.deleteCharAt(4);
        assertEquals("Sometext", sb.toString());
        assertEquals(8, sb.length());
    }

    @Test
    public void testReplace() {
        sb.append("Some text");
        sb.replace(5, 9, "characters");
        assertEquals("Some characters", sb.toString());
        assertEquals(15, sb.length());
    }

    @Test
    public void testLastIndexOf() {
        sb.append("Some text with some other text");
        int li = sb.lastIndexOf("text");
        assertEquals(26, li);
        li = sb.lastIndexOf("text", 9);
        assertEquals(5, li);
        li = sb.lastIndexOf("text", 0);
        assertEquals(-1, li);
    }
}
