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
 * BoxType4 extends BoxType3 and inherites all methods associated  with BoxType3 
 */
public class BoxType4 extends BoxType3 { 

    // creates BoxType4 if all selction options are validated
    public BoxType4(int width, int length, int height, int grade, int color, int qty, Boolean reinBottom, Boolean reinCorners, Boolean sealableTop) {
        super(width, length, height, grade, color, qty, reinBottom, reinCorners, sealableTop);// gets the values from the super class
    }

}
