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
 * BoxType1 extends superclass FlexBox and inherates all methods within FlexBox
 * class
 */

public class BoxType1 extends FlexBox {

    public BoxType1(int width, int length, int height, int grade, int color, int qty, Boolean reinBottom, Boolean reinCorners, Boolean sealableTop) {

        super(width, length, height, grade, color, qty, reinBottom, reinCorners, sealableTop);

    }
    private double topCost, totalCost;// private variables used within BoxType1 class

    /**
     * cost method overrides cost in FlexBox class
     *
     * @return cost
     */
    @Override
    public double cost() {
        if (grade == 1) {
            cost = ((boxArea() * 0.50 * qty));  // basic cost if grade 1 is selected                  
        } else if (grade == 2) {
            cost = ((boxArea() * 0.60 * qty)); // basic cost if grade 2 is selected
        } else if (grade == 3) {
            cost = ((boxArea() * 0.72 * qty)); // basic cost if grade 3 is selected
        }

        return cost; //return basic cost
    }

    /**
     * addition method overrides addition method in FlexBox class
     *
     * @return extraCost
     */
    @Override
    public double addition() {
        if (sealableTop) {
            topCost = (0.08 * cost); // calculate cost of sealable top if selected
        }
        return topCost; // return sealale top cost (addtional to basic cost)
    }

    /**
     * Total method overrides Total method in FlexBox class
     *
     * @return totalCost
     */
    @Override
    public double Total() {
        totalCost = (topCost + cost); // total cost of box when basic cost and topCost are added
        return totalCost; //return total cost.
    }

}
