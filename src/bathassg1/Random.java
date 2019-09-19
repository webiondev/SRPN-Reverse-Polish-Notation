/**
 * The Random class generates random number
 *
 * @author  
 * @version 1.0
 * @since 2019-09-30
 */
package bathassg1;

import java.util.*;

public class Random {

    List<Integer> rArray; //add random numbers generated
    private static int element = -1; //integer used to push element of the arrayList to the stack

    /**
     * Constructor.
     *
     *
     * creates an object with random numbers
     */
    public Random() {
        rArray = new ArrayList<Integer>();
        addRandomNum();
    }

    /**
     * listRandomNum method
     *
     *
     * @return a random number
     */
    public Integer listRandomNum() {
        element++;
        if (element == 50) {
            element = -1;
        }
        return (rArray.get(element));
    }

    /**
     * addRandomNum method
     *
     *
     * adds random numbers to list
     *
     */
    private void addRandomNum() {
        rArray.add(4289383);
        rArray.add(930886);
        rArray.add(168177);
        rArray.add(17636915);
        rArray.add(1747793);
        rArray.add(48335);
        rArray.add(1540383);
        rArray.add(3089172);
        rArray.add(13055736);
        rArray.add(35005211);
        rArray.add(521568);
        rArray.add(294702567);
        rArray.add(17256429);
        rArray.add(3365782);
        rArray.add(861021530);
        rArray.add(278722862);
        rArray.add(233665123);
        rArray.add(214067);
        rArray.add(468703135);
        rArray.add(11513929);
        rArray.add(1801802);
        rArray.add(1315022);
        rArray.add(65723058);
        rArray.add(1133069);
        rArray.add(1125167);
        rArray.add(19961393);
        rArray.add(29018456);
        rArray.add(628175011);
        rArray.add(656042);
        rArray.add(3117622);
        rArray.add(1653377373);
        rArray.add(859484421);
        rArray.add(1914544919);
        rArray.add(608413784);
        rArray.add(756898537);
        rArray.add(175198);
        rArray.add(19594324);
        rArray.add(49798315);
        rArray.add(38664370);
        rArray.add(29566413);
        rArray.add(184803526);
        rArray.add(412776091);
        rArray.add(9268980);
        rArray.add(11759956);
        rArray.add(749241873);
        rArray.add(1376862);
        rArray.add(49170);

    }
}
