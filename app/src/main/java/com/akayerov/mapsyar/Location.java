package com.akayerov.mapsyar;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by a_kayerov on 11.06.2016.
 */
public class Location {
    LatLng loc;
    String name;
    String title;
    int idIcon;

    int type;
    Location( String title, String name,  int idIcon, double n, double w) {
        this.name = name;
        this.title = title;
        loc = new LatLng(w,n);

        this.idIcon = idIcon;
    }
    public LatLng getPosition() {
        return loc;
    }
    public String getTitle() {
        return title;
    }
    public String getName() {
        return name;
    }

    public String getIcon() {
        return "pic" + Integer.toString(idIcon) + ".png";
    }

    public int getIdIcon() {
        return idIcon;
    }

}
