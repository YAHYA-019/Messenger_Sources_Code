package com.mapbox.mapboxsdk.location;

import com.mapbox.mapboxsdk.maps.Style;
import com.mapbox.mapboxsdk.style.layers.Layer;

/* loaded from: LocationComponentPositionManager.class */
public class LocationComponentPositionManager {
    public String layerAbove;
    public String layerBelow;
    public final Style style;

    public LocationComponentPositionManager(Style style, String str, String str2) {
        this.style = style;
        this.layerAbove = str;
        this.layerBelow = str2;
    }

    public void addLayerToMap(Layer layer) {
        String str = this.layerAbove;
        if (str != null) {
            this.style.addLayerAbove(layer, str);
            return;
        }
        String str2 = this.layerBelow;
        Style style = this.style;
        if (str2 != null) {
            style.addLayerBelow(layer, str2);
        } else {
            style.addLayer(layer);
        }
    }

    public boolean update(String str, String str2) {
        String str3;
        String str4 = this.layerAbove;
        boolean z = (str4 != str && (str4 == null || !str4.equals(str))) || ((str3 = this.layerBelow) != str2 && (str3 == null || !str3.equals(str2)));
        this.layerAbove = str;
        this.layerBelow = str2;
        return z;
    }
}
