package com.demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testMessage() {
        assertEquals("Hello Jenkins + Maven!", App.message());
    }
}

