package com.mapbox.mapboxsdk.maps;

import X.AnonymousClass001;
import android.text.TextUtils;
import com.mapbox.mapboxsdk.annotations.InfoWindow;
import com.mapbox.mapboxsdk.annotations.Marker;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: InfoWindowManager.class */
public class InfoWindowManager {
    public boolean allowConcurrentMultipleInfoWindows;
    public MapboxMap.InfoWindowAdapter infoWindowAdapter;
    public final List infoWindows = AnonymousClass001.A0s();
    public MapboxMap.OnInfoWindowClickListener onInfoWindowClickListener;
    public MapboxMap.OnInfoWindowCloseListener onInfoWindowCloseListener;
    public MapboxMap.OnInfoWindowLongClickListener onInfoWindowLongClickListener;

    public void add(InfoWindow infoWindow) {
        this.infoWindows.add(infoWindow);
    }

    public MapboxMap.InfoWindowAdapter getInfoWindowAdapter() {
        return this.infoWindowAdapter;
    }

    public MapboxMap.OnInfoWindowClickListener getOnInfoWindowClickListener() {
        return this.onInfoWindowClickListener;
    }

    public MapboxMap.OnInfoWindowCloseListener getOnInfoWindowCloseListener() {
        return this.onInfoWindowCloseListener;
    }

    public MapboxMap.OnInfoWindowLongClickListener getOnInfoWindowLongClickListener() {
        return this.onInfoWindowLongClickListener;
    }

    public boolean isAllowConcurrentMultipleOpenInfoWindows() {
        return this.allowConcurrentMultipleInfoWindows;
    }

    public boolean isInfoWindowValidForMarker(Marker marker) {
        if (marker != null) {
            return (TextUtils.isEmpty(marker.getTitle()) && TextUtils.isEmpty(marker.getSnippet())) ? false : true;
        }
        return false;
    }

    public void setAllowConcurrentMultipleOpenInfoWindows(boolean z) {
        this.allowConcurrentMultipleInfoWindows = z;
    }

    public void setInfoWindowAdapter(MapboxMap.InfoWindowAdapter infoWindowAdapter) {
        this.infoWindowAdapter = infoWindowAdapter;
    }

    public void setOnInfoWindowClickListener(MapboxMap.OnInfoWindowClickListener onInfoWindowClickListener) {
        this.onInfoWindowClickListener = onInfoWindowClickListener;
    }

    public void setOnInfoWindowCloseListener(MapboxMap.OnInfoWindowCloseListener onInfoWindowCloseListener) {
        this.onInfoWindowCloseListener = onInfoWindowCloseListener;
    }

    public void setOnInfoWindowLongClickListener(MapboxMap.OnInfoWindowLongClickListener onInfoWindowLongClickListener) {
        this.onInfoWindowLongClickListener = onInfoWindowLongClickListener;
    }

    public void update() {
        if (this.infoWindows.isEmpty()) {
            return;
        }
        Iterator it = this.infoWindows.iterator();
        while (it.hasNext()) {
            ((InfoWindow) it.next()).update();
        }
    }
}
