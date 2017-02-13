/*
*This project is FlexBox Order System 
*The system validates and determine what box can be created by the company
*It also allows customers to see all orders made and total cost of order
 */
package flexbox;

/**
 *
 * @author UP750825
 * @author Up794190
 */

/**
 * 
 * BoxType3 extends superclass FlexBox and inherates all methods within FlexBox class
 */
public class BoxType3 extends FlexBox { 

    private double totalCost, colorCost, cornerCost, bottomCost, topCost, extraCost; // private variable created to use within BoxType3 class

    public BoxType3(int width, int length, int height, int grade, int color, int qty, Boolean reinBottom, Boolean reinCorners, Boolean sealableTop) {
        super(width, length, height, grade, color, qty, reinBottom, reinCorners, sealableTop);

    }

    /**
     * Cost method overrides cost method in FlexBox class
     *
     * @return cost
     */
    @Override
    public double cost() { // cost method which overrides abstract cost method in FlexBox class to calculate basic box class
        if (grade == 2) {
            cost = (boxArea() * 0.60 * qty); // bamsic cost if grade 2 is selected
        } else if (grade == 3) {
            cost = (boxArea() * 0.72 * qty); // basic cost if grade 3 is selected
        } else if (grade == 4) {
            cost = (boxArea() * 0.90 * qty);  // basic cost if grade 4 is selected
        } else if (grade == 5) {
            cost = (boxArea() * 1.5 * qty); //basic cost if grade 5 is selected
        }
        return cost;

    }

    /**
     * addition method overrides addition method in FlexBox class
     *
     * @return extraCost
     */
    @Override
    public double addition() {// addition method which overrides abstract addition method in FlexBox class to calculate any additional made to a box order
        colorCost = (0.16 * cost);// cost of two colors selected 
        if (sealableTop) {
            topCost = (0.08 * cost);// cost of 8% of basic cost for sealable tops 
        }
        if (reinBottom) {
            bottomCost = (0.14 * cost); // reinforced bottoms 14% of basic cost
        }
        if (reinCorners) {
            cornerCost = (0.10 * cost); // reinforced corners 10% of basic cost
        }
        extraCost = colorCost + topCost + bottomCost + cornerCost; // total of extra cost
        return extraCost;

    }

    /**
     * Total method overrides Total method in FlexBox class
     *
     * @return totalCost
     */
    @Override
    public double Total() {// Total method which overrides abstract Total method in FlexBox class to calculate total output of order
        totalCost = (extraCost + cost); // total cost equal extra cost plus baisc cost.
        return totalCost;
    }

}
