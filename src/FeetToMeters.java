/*@author Tushar Balarajan
   CSC 201-004N
   Professor Tanes Kanchanawanchai
   Assignment 2.3


***** BEGIN LICENSE BLOCK *****
        Version: MPL 1.1/GPL 2.0/LGPL 2.1

        The contents of this file are subject to the Mozilla Public License Version
        1.1 (the "License"); you may not use this file except in compliance with
        the License. You may obtain a copy of the License at
        http://www.mozilla.org/MPL/

        Software distributed under the License is distributed on an "AS IS" basis,
        WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
        for the specific language governing rights and limitations under the
        License.

        The Initial Developer of the Original Code is
        Tushar Balarajan.
        Portions created by the Initial Developer are Copyright (C) 2017
        the Initial Developer. All Rights Reserved.

        Contributor(s):

        Alternatively, the contents of this file may be used under the terms of
        either the GNU General Public License Version 2 or later (the "GPL"), or
        the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
        in which case the provisions of the GPL or the LGPL are applicable instead
        of those above. If you wish to allow use of your version of this file only
        under the terms of either the GPL or the LGPL, and not to allow others to
        use your version of this file under the terms of the MPL, indicate your
        decision by deleting the provisions above and replace them with the notice
        and other provisions required by the GPL or the LGPL. If you do not delete
        the provisions above, a recipient may use your version of this file under
        the terms of any one of the MPL, the GPL or the LGPL.

        ***** END LICENSE BLOCK *****
*/
import java.util.*;
public class FeetToMeters {
    //<p>This function handles the calculation and returns the distance in meters</p>
    public static double Calculate(double feet){
        double meters = (.305 * feet);
        return(meters);
    }

    /**
     * <h3>Java Doc</h3>
     *<p>The purpose of this program is to convert an input a distance in feet and calculate the distance in meters</p>
     *
     */

    public static void main(String[] args) {
        System.out.print("Enter a value for feet: ");
        Scanner kybd = new Scanner(System.in);
        Double feet = kybd.nextDouble();
            if (feet <=0) {
                //<p>I included an if else statement in case the user puts a negative distance or zero.</p>
            System.out.println("Please put a value greater than zero!");
            }

            else {
                //<p>This statement calls the function and displays the distance.</p>
            double meters = Calculate(feet);
            System.out.println(feet + " feet is " + meters + " meters.");
            }
        }
    }

