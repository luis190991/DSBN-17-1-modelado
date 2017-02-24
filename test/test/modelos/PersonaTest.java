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

import java.util.ArrayList;
import java.util.List;
import modelos.Labrador;
import modelos.Perro;
import modelos.interfaces.Caminar;
import modelos.personas.Adulto;
import modelos.personas.Anciano;
import modelos.personas.Bebe;
import org.junit.Test;

/**
 *
 * @author luis
 */
public class PersonaTest {

    @Test
    public void test() {
        List<Caminar> caminantes = new ArrayList<>();

        Adulto a = new Adulto();
        Anciano b = new Anciano();
        Bebe c = new Bebe();
        
        caminantes.add(a);
        caminantes.add(b);
        caminantes.add(c);
        
        for (Caminar caminante : caminantes) {
            caminante.moverse();
        }
        
        Labrador l = new Labrador();
        Perro p = new Perro() {
            @Override
            public void moverse() {
                System.out.println("me muevo 1");
            }
        };
        
        
        Perro p2 = new Perro() {
            @Override
            public void moverse() {
                System.out.println("me muevo 2");
            }
        };
        
        
        p.moverse();
        p2.moverse();
    }

}
