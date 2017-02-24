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
package modelos;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import modelos.enums.Genero;

/**
 * Modelo que reprenta todos los elementos de un animal.
 *
 * @author Luis Antonio Ramirez
 * @see Byte
 * @since 07/02/2017
 * @version 1
 */
public class Animal extends Object {

    public static final String PLURAL_ANIMAL = "Animales";

    private Color color;
    private Region region;
    private Date fechaNacimiento;
    private Float peso;
    private Genero genero;

    public Animal() {
        this.color = Color.ORANGE;
        this.region = null;
        this.fechaNacimiento = new Date();
        this.peso = 0.1f;
        this.genero = Genero.FEMENINO;
    }

    public Animal(Float peso, Genero genero) {
        this();
        this.peso = peso;
        this.genero = genero;
    }

    /**
     * Contructor para un tigre naranja.
     *
     * @param region Se refiere al lugar de nacimeinto.
     * @param fechaNacimiento con formato dd/mm/yyyy del naciento del animal.
     * @param peso peso del animal expresado en kg.
     * @param genero es un valor que solo puede ser MASCULINO y FEMENINO.
     */
    public Animal(Region region, Date fechaNacimiento, Float peso,
            Genero genero) {
        this(peso, genero);
        this.region = region;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Animal(Color color, Region region, Date fechaNacimiento,
            Float peso, Genero genero) {
        this(region, fechaNacimiento, peso, genero);
        this.color = color;

    }

    public static String saludo() {
        return "Saludo";
    }

    public String saludo2() {
        return "Saludo " + this.fechaNacimiento;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return this.color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @return the region
     */
    public Region getRegion() {
        return region;
    }

    /**
     * @param region the region to set
     */
    public void setRegion(Region region) {
        this.region = region;
    }

    /**
     * @return the fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the peso
     */
    public Float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(Float peso) {
        this.peso = peso;
    }

    /**
     * @return the genero
     */
    public Genero getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public boolean equals(Object obj) {

        Boolean resultado = obj.getClass().equals(Animal.class);
        if (resultado) {
            Animal animal = (Animal) obj;
            resultado = this.color.equals(animal.color);
            resultado = resultado && (this.peso.equals(animal.peso));
            resultado = resultado && (this.fechaNacimiento
                    .equals(animal.fechaNacimiento));
        }

        return resultado;
    }

    public String listarAnimales(String... animales) {

        List<String> animalesList = new ArrayList<>();
        animalesList.addAll(Arrays.asList(animales));
        String listado = "";
        for (String animal : animalesList) {
            listado = String.format("%s, %s", listado, animal);
        }
        return listado.substring(2);
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.region,
                this.fechaNacimiento.toString());
    }

}
