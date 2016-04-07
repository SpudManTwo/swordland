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
public class Location
{
    private Location northernNeighbour;
    private Location easternNeighbour;
    private Location southernNeighbour;
    private Location westernNeighbour;
    private PointOfInterest[] pointsOfInterest;
    private String description;
    
    public static Location ToBCentralPlaza()
    {
        return new Location(null, null, null, null, null, null);
    }

    /**
     *
     * @param northernNeighbour the value of northernNeighbour
     * @param easternNeighbour the value of easternNeighbour
     * @param southernNeighbour the value of southernNeighbour
     * @param westernNeighbour the value of westernNeighbour
     * @param pointsOfInterest the value of pointsOfInterest
     * @param description the value of description
     */
    public Location(Location northernNeighbour, Location easternNeighbour, Location southernNeighbour, Location westernNeighbour, PointOfInterest[] pointsOfInterest, String description) {
        this.northernNeighbour = northernNeighbour;
        this.easternNeighbour = easternNeighbour;
        this.southernNeighbour = southernNeighbour;
        this.westernNeighbour = westernNeighbour;
    }

    public Location getNorthernNeighbour() {
        return northernNeighbour;
    }

    public void setNorthernNeighbour(Location northernNeighbour) {
        this.northernNeighbour = northernNeighbour;
    }

    public Location getEasternNeighbour() {
        return easternNeighbour;
    }

    public void setEasternNeighbour(Location easternNeighbour) {
        this.easternNeighbour = easternNeighbour;
    }

    public Location getSouthernNeighbour() {
        return southernNeighbour;
    }

    public void setSouthernNeighbour(Location southernNeighbour) {
        this.southernNeighbour = southernNeighbour;
    }

    public Location getWesternNeighbour() {
        return westernNeighbour;
    }

    public void setWesternNeighbour(Location westernNeighbour) {
        this.westernNeighbour = westernNeighbour;
    }

    public PointOfInterest[] getPointsOfInterest() {
        return pointsOfInterest;
    }

    public void setPointsOfInterest(PointOfInterest[] pointsOfInterest) {
        this.pointsOfInterest = pointsOfInterest;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
