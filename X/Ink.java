package X;

import com.facebook.messaging.livelocation.xma.LiveLocationActiveXMAView;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.MapboxMap;

/* loaded from: Ink.class */
public final class Ink implements MapboxMap.OnMapClickListener {
    public final /* synthetic */ LiveLocationActiveXMAView A00;

    public Ink(LiveLocationActiveXMAView liveLocationActiveXMAView) {
        this.A00 = liveLocationActiveXMAView;
    }

    @Override // com.mapbox.mapboxsdk.maps.MapboxMap.OnMapClickListener
    public boolean onMapClick(LatLng latLng) {
        LiveLocationActiveXMAView.A02(this.A00);
        return false;
    }
}
