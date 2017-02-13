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
 * BoxType2 extends superclass FlexBox and inherates all methods within FlexBox class
 */
public class BoxType2 extends FlexBox { 

    private double topCost, totalCost, colorCost, extraCost; // private variables used within BoxType2 class

    public BoxType2(int width, int length, int height, int grade, int color, int qty, Boolean reinBottom, Boolean reinCorners, Boolean sealableTop) {
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
            cost = (boxArea() * 0.60 * qty); // basic cost if grade 2 is selected
        } else if (grade == 3) {
            cost = (boxArea() * 0.72 * qty);// basic cost if grade 3 is selected
        } else if (grade == 4) {
            cost = (boxArea() * 0.90 * qty); // basic cost if grade 4 is selected
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
        if (sealableTop == true) {
            topCost = (0.08 * cost); // additional cost if box has sealable top
        }
        colorCost = (0.13 * cost); // cost when box has one color
        extraCost = colorCost + topCost; //total extra cost encurred
        return extraCost; // return extra cost
    }

    /**
     * Total method overrides Total method in FlexBox class
     *
     * @return totalCost
     */
    @Override
    public double Total() {// Total method which overrides abstract Total method in FlexBox class to calculate total output of order
        totalCost = (extraCost + cost); // total cost consist of extra cost plus basic cost.
        return totalCost;
    }

}
