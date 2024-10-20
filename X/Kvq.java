package X;

import com.facebook.android.maps.model.CameraPosition;
import com.facebook.android.maps.model.LatLng;

/* loaded from: Kvq.class */
public abstract class Kvq {
    public static CameraPosition A00(com.mapbox.mapboxsdk.camera.CameraPosition cameraPosition) {
        if (cameraPosition == null) {
            return null;
        }
        float f = (float) cameraPosition.bearing;
        return new CameraPosition(A01(cameraPosition.target), (float) cameraPosition.zoom, (float) cameraPosition.tilt, f);
    }

    public static LatLng A01(com.mapbox.mapboxsdk.geometry.LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        return new LatLng(latLng.latitude, latLng.longitude);
    }
}
