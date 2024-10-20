package X;

import android.graphics.Bitmap;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.Style;

/* loaded from: Lho.class */
public final class Lho implements Style.OnStyleLoaded {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Lho(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // com.mapbox.mapboxsdk.maps.Style.OnStyleLoaded
    public void onStyleLoaded(Style style) {
        switch (this.A00) {
            case 0:
                ((RpX) this.A01).A02.locationComponent.getLocationEngine().Cgy(null, new S5l(this), new Kzo(0L));
                return;
            case 1:
                style.addImage(((RpY) this.A01).A09, (Bitmap) this.A02);
                return;
            default:
                KKE kke = (KKE) this.A01;
                MapboxMap mapboxMap = (MapboxMap) this.A02;
                Ket ket = KKE.A0D;
                if (ket == null || mapboxMap.getStyle() == null) {
                    return;
                }
                C1kw c1kw = (C1kw) ket.A00.get();
                if (JkK.A00 == null) {
                    synchronized (JkK.class) {
                        if (JkK.A00 == null) {
                            JkK.A00 = new C2J3(c1kw);
                        }
                    }
                }
                AbstractC01593ro A0A = AbJ.A0A(JkK.A00, "mapbox_render_map");
                if (A0A.A0B()) {
                    A0A.A06("surface", kke.A0C.A03);
                    A0A.A0A();
                    return;
                }
                return;
        }
    }
}
