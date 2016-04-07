/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.swordland;

/**
 *
 * @author Kazumi
 */
public class Attack {

    private float damage;
    private String action;

    /**
     *
     * @param damage
     */
    public Attack(float damage) {
        this.damage = damage;
    }

    /**
     *
     * @param action
     */
    public Attack(String action) {
        this.damage = 0;
        this.action = action;
    }

    public float getDamage() {
        return damage;
    }

    public void doAction(Player player, Mob mob) {
        if (action == null) {
            return;
        }
        // FIXME: Do stuff to the mob.
    }

    public void doAction(Player player1, Player player2) {
        if (action == null) {
            return;
        }
        // FIXME: Do stuff to the second player.
    }

}
