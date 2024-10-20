package X;

import com.mapbox.mapboxsdk.maps.Style;
import com.mapbox.mapboxsdk.style.layers.Layer;

/* loaded from: Lhm.class */
public final class Lhm implements Style.OnStyleLoaded {
    public final int A00;
    public final Object A01;

    public Lhm(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // com.mapbox.mapboxsdk.maps.Style.OnStyleLoaded
    public void onStyleLoaded(Style style) {
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                RpY rpY = (RpY) obj;
                style.addLayer(rpY.A07);
                style.addSource(rpY.A08);
                return;
            case 1:
                RpY rpY2 = (RpY) obj;
                style.removeLayer(rpY2.A07);
                style.removeSource(rpY2.A08);
                style.removeImage(rpY2.A09);
                return;
            case 2:
                Rpb rpb = (Rpb) obj;
                style.addSource(rpb.A04);
                style.addLayer(rpb.A03);
                return;
            default:
                KKE kke = (KKE) obj;
                kke.setForeground(null);
                if (kke.A0C.A04) {
                    Layer layer = style.getLayer("OSM_POIs_Labels");
                    Layer layer2 = style.getLayer("airport_labels");
                    if (layer != null) {
                        layer.setProperties(JQz.A0c("none", "visibility"));
                    }
                    if (layer2 != null) {
                        layer2.setProperties(JQz.A0c("none", "visibility"));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
