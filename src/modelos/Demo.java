package modelos;

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

/**
 *
 * @author luis
 */
public class Demo {
    
    
  
    public static void main(String[] args) {
         Animal a1 = new Animal();
         Animal a2 = new Animal();
         
         
         Integer x = 5;
         Integer y = 5;
         
         
         
         int x0 = 5;
         int y0 = 5;
         
         
         
          System.out.println("x == y = " + (x == y));
         
         System.out.println("x equals y = " + (x.equals(y)));
         
         
         System.out.println("a1 == a2 = " + (a1 == a2));
         
         System.out.println("a1 equals a2 = " + (a1.equals(a2)));

         
       Animal.saludo();
        System.out.println("--->" + a1.getClass());
    }
    
}
