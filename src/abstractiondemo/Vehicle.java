/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractiondemo;

/**
 *
 * @author johnny
 */
public interface Vehicle {
    
    
    public abstract int getYear();

    public abstract void setYear(int year);

    public abstract String getName();

    public abstract void setName(String name);
    
    public abstract String getManufacName();

    public abstract void setManufacName(String manufacName);
}
