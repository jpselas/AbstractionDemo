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
public class Boat implements Vehicle{
    private int year;
    private int engineHP;
    private String name;
    private String manufacName;
    private String engineSize;
    private String color;
    public Boat() {
    }

    public Boat(int year, int engineHP, String name, String manufacName, String engineSize, String color) {
        this.year = year;
        this.engineHP = engineHP;
        this.name = name;
        this.manufacName = manufacName;
        this.engineSize = engineSize;
        this.color = color;
    }

   @Override
    public int getYear() {
        return year;
    }
    @Override
    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public int getEngineHP() {
        return engineHP;
    }
    @Override
    public void setEngineHP(int engineHP) {
        this.engineHP = engineHP;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getManufacName() {
        return manufacName;
    }
    @Override
    public void setManufacName(String manufacName) {
        this.manufacName = manufacName;
    }
    @Override
    public String getEngineSize() {
        return engineSize;
    }
    @Override
    public void setEngineSize(String engineSize) {
        this.engineSize = engineSize;
    }
    @Override
    public String getColor() {
        return color;
    }
    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Boat{" + "year=" + year + ", engineHP=" + engineHP + ", name=" + name + ", manufacName=" + manufacName + ", engineSize=" + engineSize + ", color=" + color + '}';
    }

    
    
}
