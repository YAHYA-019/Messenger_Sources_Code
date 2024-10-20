package X;

import com.mapbox.mapboxsdk.location.LocationComponent;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: Kzo.class */
public final class Kzo {
    public final long A00;
    public final long A01 = 1000;

    public Kzo(long j) {
        this.A00 = j;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.mapbox.mapboxsdk.location.LocationComponent$InternalLocationEngineProvider, java.lang.Object] */
    public static CopyOnWriteArrayList A00(LocationComponent locationComponent) {
        locationComponent.internalLocationEngineProvider = new Object();
        locationComponent.locationEngineRequest = new Kzo(1000L);
        locationComponent.currentLocationEngineListener = new LocationComponent.CurrentLocationEngineCallback(locationComponent);
        locationComponent.lastLocationEngineListener = new LocationComponent.LastLocationEngineCallback(locationComponent);
        return new CopyOnWriteArrayList();
    }
}
