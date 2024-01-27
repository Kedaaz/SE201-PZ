/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package test;

import entiteti.Radnik;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class JmbgTest {

    @Test
    public void JmbgTest() {

        assertTrue(Radnik.jeValidanJMBG("1111222233334"));
        assertFalse(Radnik.jeValidanJMBG("11112222333344"));

    }
}
