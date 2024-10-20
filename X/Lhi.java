package X;

import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;
import com.mapbox.mapboxsdk.maps.Style;

/* loaded from: Lhi.class */
public final class Lhi implements OnMapReadyCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Lhi(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // com.mapbox.mapboxsdk.maps.OnMapReadyCallback
    public final void onMapReady(MapboxMap mapboxMap) {
        int i = this.A00;
        KKE kke = (KKE) this.A01;
        if (i == 0) {
            MFR mfr = (MFR) this.A02;
            RpX rpX = kke.A06;
            if (rpX == null) {
                rpX = new RpX(kke.getContext(), kke, mapboxMap);
                kke.A06 = rpX;
            }
            mfr.C5X(rpX);
            return;
        }
        Object obj = this.A02;
        Style.Builder builder = new Style.Builder();
        String str = kke.A0C.A02;
        str.getClass();
        builder.styleUri = str;
        mapboxMap.setStyle(builder, (Style.OnStyleLoaded) null);
        mapboxMap.getStyle(new Lhm(kke, 3));
        MLl mLl = kke.A01;
        mLl.markerStart(19136522);
        try {
            kke.A08 = mapboxMap;
            kke.A00.setOnClickListener(new LKM(4, obj, kke, mapboxMap));
        } finally {
            kke.A01.Bcp(19136522);
        }
    }
}
