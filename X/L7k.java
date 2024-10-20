package X;

import android.graphics.RectF;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.mapbox.geojson.Feature;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: L7k.class */
public final class L7k {
    public final EQp A00;
    public final String A02;
    public final String A03;
    public final boolean A05;
    public final 1Br A01 = 1BK.A0D();
    public final String A04 = 7zR.A0s();

    public L7k(EQp eQp, String str, String str2, boolean z) {
        this.A00 = eQp;
        this.A02 = str;
        this.A03 = str2;
        this.A05 = z;
    }

    public static final java.util.Map A00(JNf jNf, L7k l7k) {
        AbstractMap linkedHashMap;
        if (l7k.A05) {
            linkedHashMap = AnonymousClass001.A0u();
        } else {
            if (jNf.AvW() != 0S2.A01) {
                return null;
            }
            RpX rpX = (RpX) jNf;
            MapboxMap mapboxMap = rpX.A02;
            11T.A0A(mapboxMap);
            KKE kke = rpX.A01;
            List<Feature> queryRenderedFeatures = mapboxMap.queryRenderedFeatures(new RectF(0.0f, 0.0f, kke.getMeasuredWidth(), kke.getMeasuredHeight()), new String[0]);
            11T.A0A(queryRenderedFeatures);
            HashMap A0u = AnonymousClass001.A0u();
            for (Feature feature : queryRenderedFeatures) {
                String stringProperty = feature.getStringProperty(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                String stringProperty2 = feature.getStringProperty("layer");
                if (stringProperty != null && stringProperty2 != null) {
                    Set set = (Set) A0u.get(stringProperty2);
                    if (set == null) {
                        set = AnonymousClass001.A0v();
                        A0u.put(stringProperty2, set);
                    }
                    set.add(stringProperty);
                }
            }
            linkedHashMap = new LinkedHashMap(02J.A00(A0u.size()));
            Iterator A0x = AnonymousClass001.A0x(A0u);
            while (A0x.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0x);
                linkedHashMap.put(A0z.getKey(), 0QD.A0V((Iterable) A0z.getValue()));
            }
        }
        return linkedHashMap;
    }

    public static void A01(1UG r301, L7k l7k, double d) {
        r301.A7R("map_sessionid", l7k.A04);
        r301.A7R("map_type", l7k.A03);
        r301.A5c(l7k.A00, "surface");
        r301.A7R("entry_point", l7k.A02);
        r301.A5Z("zoom_level", Double.valueOf(d));
    }
}
