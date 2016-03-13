
import proof.Crafter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Magic
 */
public class CrafterTester {
    public static void main(String[] args) {
        Crafter lisbeth = new Crafter();
        lisbeth.setInput("Iron 8 OHD 17");
        System.out.println(lisbeth.getCraft());
    }
}
