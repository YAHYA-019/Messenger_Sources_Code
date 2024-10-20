package X;

import com.mapbox.mapboxsdk.location.LocationComponentOptions;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;

/* loaded from: Lhh.class */
public final class Lhh implements OnMapReadyCallback {
    public final int A00;
    public final Object A01;

    public Lhh(KKE kke, int i) {
        this.A00 = i;
        this.A01 = kke;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // com.mapbox.mapboxsdk.maps.OnMapReadyCallback
    public final void onMapReady(MapboxMap mapboxMap) {
        Lho s63;
        switch (this.A00) {
            case 0:
                final KKE kke = (KKE) this.A01;
                kke.addOnDidFinishRenderingMapListener(new MapView.OnDidFinishRenderingMapListener() { // from class: X.LhQ
                    @Override // com.mapbox.mapboxsdk.maps.MapView.OnDidFinishRenderingMapListener
                    public final void onDidFinishRenderingMap(boolean z) {
                        C00i c00i = kke.A02;
                        c00i.getClass();
                        ((C1vf) c00i.get()).A01("map_surface_load", 836603876839895L);
                    }
                });
                return;
            case 1:
                KKE kke2 = (KKE) this.A01;
                mapboxMap.uiSettings.setAttributionEnabled(false);
                LocationComponentOptions.Builder builder = LocationComponentOptions.builder(kke2.getContext());
                builder.accuracyColor(-12888163);
                builder.foregroundTintColor = -12888163;
                builder.bearingTintColor = -12888163;
                builder.foregroundStaleTintColor = -12888163;
                builder.padding(mapboxMap.projection.contentPadding);
                LocationComponentOptions build = builder.build();
                C00i c00i = kke2.A03;
                c00i.getClass();
                MJh mJh = (MJh) c00i.get();
                if (mJh == null) {
                    0fH.A0n("AbstractMapboxMapView", "location engine not initialized, skipping location component setup");
                    return;
                } else {
                    s63 = new S63(kke2, mJh, build, mapboxMap);
                    mapboxMap.getStyle(s63);
                    return;
                }
            case 2:
                KKE kke3 = (KKE) this.A01;
                S5u s5u = new S5u(mapboxMap);
                kke3.A07 = s5u;
                MLl mLl = kke3.A01;
                if (mLl != null) {
                    s5u.A00 = mLl;
                }
                mapboxMap.addOnMapLongClickListener(new S60(kke3));
                mapboxMap.addOnMapClickListener(new S5x(kke3));
                mapboxMap.addOnMapDoubleClickListener(new S5z(kke3));
                mapboxMap.addOnCameraIdleListener(kke3.A07);
                return;
            default:
                s63 = new Lho(mapboxMap, this.A01, 2);
                mapboxMap.getStyle(s63);
                return;
        }
    }
}
