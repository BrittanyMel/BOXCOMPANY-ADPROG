/*
*This project is FlexBox Order System 
*The system validates and determine what box can be created by the company
*It also allows customers to see all orders made and total cost of order
 */
package flexbox;

import java.io.*;
import java.util.*;

/**
 *
 * @author UP750825
 * @author Up794190
 */

/**
 * 
 * FlexBox class hold the common attributes of all its subclasses 
 */
public abstract class FlexBox {

    //variables 
    protected int grade, color, qty;
    protected int totalOrders;

    protected Boolean reinBottom, reinCorners, sealableTop;

    protected int width, length, height;
    protected double cost, fCost;
    protected double AreaOfBox;

    public FlexBox() { // empty flexbox constructor

    }

    public FlexBox(int width, int length, int height, int grade, int color, int qty, Boolean Bottom, Boolean Corners, Boolean sealTop) { // flexbox constructor to create box
        this.width = width;
        this.length = length;
        this.height = height;
        this.grade = grade;
        this.sealableTop = sealTop;
        this.reinCorners = Corners;
        this.reinBottom = Bottom;
        this.qty = qty;
    }

    public abstract double cost();//abstarct cost method which is overridden in class box types

    public abstract double addition(); //abstarct addtion method which is overridden in class box types

    public abstract double Total();//abstarct Total method which is overridden in class box types

    public double boxArea() {// finds area of every type of box
        double Area = ((2 * (this.height * this.width)) + (2 * (this.height * this.length)) + (2 * (this.length * this.width)));
        AreaOfBox = Area * 0.01;
        return AreaOfBox;
    }

    // access methods
    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getColor() {
        return color;
    }

    public int getQty() {
        return qty;
    }

    public Boolean getBottom() {
        return reinBottom;
    }

    public Boolean getCorner() {
        return reinCorners;
    }

    public Boolean getSealTop() {
        return sealableTop;
    }

    // update methods
    public void setWidth(int widthIn) {
        this.width = widthIn;
    }

    public void setLength(int lengthIn) {
        this.length = lengthIn;
    }

    public void setHeight(int heightIn) {
        this.height = heightIn;
    }

    public void setBottom(Boolean Bottom) {
        this.reinBottom = Bottom;
    }

    public void setCorner(Boolean Corner) {
        this.reinCorners = Corner;
    }

    public void setSealTop(Boolean sealTop) {
        this.sealableTop = sealTop;
    }

}
