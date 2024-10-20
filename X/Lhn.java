package X;

import com.facebook.fury.context.ReqContext;
import com.facebook.fury.context.ReqContextTypeResolver;
import com.mapbox.mapboxsdk.location.LocationComponent;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.Style;

/* loaded from: Lhn.class */
public final class Lhn implements Style.OnStyleLoaded {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public Lhn(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    @Override // com.mapbox.mapboxsdk.maps.Style.OnStyleLoaded
    public void onStyleLoaded(Style style) {
        if (this.A00 != 0) {
            MapboxMap mapboxMap = (MapboxMap) this.A01;
            mapboxMap.locationComponent.setLocationComponentEnabled(this.A02);
            return;
        }
        ReqContext A04 = AnonymousClass018.A04("", ReqContextTypeResolver.resolveName(AnonymousClass000.A00(228)));
        try {
            RpX rpX = (RpX) this.A01;
            LocationComponent locationComponent = rpX.A02.locationComponent;
            boolean z = this.A02;
            locationComponent.setLocationComponentEnabled(z);
            rpX.A01.getMapAsync(new S62(z));
            if (A04 != null) {
                A04.close();
            }
        } catch (Throwable th) {
            if (A04 != null) {
                try {
                    A04.close();
                    throw th;
                } catch (Throwable th2) {
                    7kF.A00(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }
}
