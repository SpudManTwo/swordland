/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.swordland.enums;

/**
 * The ten fingers.
 *
 * @author Kazumi
 */
public enum Fingers 
{

    /**
     * The outermost, smallest finger of the left hand.
     */
    LEFT_PINKY (0),

    /**
     * The second most outer finger. Generally known as ring finger. This specimen is on the left hand.
     */
    LEFT_RING (1),

    /**
     * The middle finger of the left hand. Most people use it to flip others the bird.
     */
    LEFT_MIDDLE (2),

    /**
     * Also known as the forefinger. Left hand version.
     */
    LEFT_INDEX (3),

    /**
     * Do I really need to explain the thumb of the left hand?
     */
    LEFT_THUMB (4),

    /**
     * This here is the thumb of the right hand, the innermost finger.
     */
    RIGHT_THUMB (5),

    /**
     * People can consider you rude if you use the index finger to point at them. This is the right hand version.
     */
    RIGHT_INDEX (6),

    /**
     * NO! STOP IT! NO FLIPPING BIRDS WITH THE <b>RIGHT MIDDLE FINGER</b> EITHER!
     */
    RIGHT_MIDDLE (7),

    /**
     * We're going full circle here. The lesser important rings get to be on the right ring finger.
     */
    RIGHT_RING (8),

    /**
     * And the right little finger. We're done.
     */
    RIGHT_PINKY (9);
    
    private final int finger;
    
    Fingers(int finger)
    {
        this.finger = finger;
    }
    
    /**
     * Get the specified integer value of the finger for use in Arrays.
     * 
     * @return the value of the finger
     */
    public int Finger()
    {
        return finger;
    }
}
