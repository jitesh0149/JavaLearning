/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples.comparator;

import java.util.Comparator;

/**
 *
 * @author Krishna
 */
public class HDTV1 implements Comparator<HDTV1> {

    private int size;
    private String brand;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public HDTV1() {
    }

    public HDTV1(int size, String brand) {
        this.size = size;
        this.brand = brand;
    }

    @Override
    public int compare(HDTV1 tv1, HDTV1 tv2) {
        int tv1Size = tv1.getSize();
        int tv2Size = tv2.getSize();

        if (tv1Size > tv2Size) {
            return 1;
        } else if (tv1Size < tv2Size) {
            return -1;
        } else {
            return 0;
        }
    }

}
