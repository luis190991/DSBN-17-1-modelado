/*
 * The MIT License
 *
 * Copyright 2017 luis.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package test.modelos;

import modelos.Animal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author luis
 */
public class AnimalTest {

    @Before
    public void antesPrueba() {
    }

    @After
    public void despuesPrueba() {
    }

    @BeforeClass
    public static void antesPruebas() {
    }

    @AfterClass
    public static void despuesPruebas() {
    }

    @Test
    public void testEquals() {
        Animal a1 = new Animal();
        Animal a2 = new Animal();

        Assert.assertEquals(a1, a2);

        Assert.assertTrue(a1.getPeso().equals(a2.getPeso()));
        Assert.assertTrue(a1.getColor().equals(a2.getColor()));

        Assert.assertFalse((a1.getPeso().equals(a2.getColor())));
    }

    @Test
    public void testCambioColor() {
        Assert.assertTrue(true);
    }
    
    @Test
    public void testToString(){
        Animal a1 = new Animal();
        System.out.println("a1 = " + a1);
    }
    
    @Test
    public void testListarAnimales(){
        Animal a1 = new Animal();
        Assert.assertTrue(a1.getGenero().getPuedeHacerVariasTareas());
        
       Assert.assertEquals(a1.listarAnimales(
               "Perro", "Gato", "Cocodrilo", "Perico"),
               "Perro, Gato, Cocodrilo, Perico");
        
    }

}
