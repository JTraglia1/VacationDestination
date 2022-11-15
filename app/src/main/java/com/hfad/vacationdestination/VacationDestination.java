package com.hfad.vacationdestination;

public class VacationDestination {

    private String placeName;
    private int imageID;
    private boolean isFavorite;

    public VacationDestination(String placeName, int imageID, boolean isFavorite)
    {
        this.placeName = placeName;
        this.imageID = imageID;
        this.isFavorite = isFavorite;
    }

    public String getPlaceName()
    {
        return placeName;
    }

    public int getImageID()
    {
        return imageID;
    }

    public void setFavorite(boolean favorite)
    {
        isFavorite = favorite;
    }

    public boolean isFavorite() { return isFavorite; }
}
