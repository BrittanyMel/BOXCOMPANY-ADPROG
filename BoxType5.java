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
 * Box Type 5 extends BoxTYpe 3 and inherites all methods associated with BoxType3 class
 */
public class BoxType5 extends BoxType3 { 

    // creates box of type five if it is validated
    public BoxType5(int width, int length, int height, int grade, int color, int qty, Boolean reinBottom, Boolean reinCorners, Boolean sealableTop) {

        super(width, length, height, grade, color, qty, reinBottom, reinCorners, sealableTop); // gets the values entered from the super class

    }

}
