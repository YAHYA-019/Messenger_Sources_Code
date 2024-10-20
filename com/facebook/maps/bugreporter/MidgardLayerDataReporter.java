package com.facebook.maps.bugreporter;

import X.0Pz;
import X.0fH;
import X.1BK;
import X.AnonymousClass001;
import X.C4EE;
import X.JQz;
import X.RWc;
import android.text.TextUtils;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Set;

/* loaded from: MidgardLayerDataReporter.class */
public final class MidgardLayerDataReporter implements C4EE {
    public final Set A01 = AnonymousClass001.A0v();
    public int A00 = 0;

    @Override // X.C4EE
    public ImmutableMap AlO() {
        MapboxMap mapboxMap;
        ImmutableMap.Builder A0c = 1BK.A0c();
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            Reference reference = (Reference) it.next();
            if (reference == null || (mapboxMap = (MapboxMap) reference.get()) == null) {
                it.remove();
            } else {
                LinkedList A00 = RWc.A00(mapboxMap, RWc.A00);
                A00.add(String.format(Locale.US, "zoom: %f, lat: %f, lon: %f", Double.valueOf(JQz.A0Z(mapboxMap).zoom), Double.valueOf(JQz.A0Z(mapboxMap).target.latitude), Double.valueOf(JQz.A0Z(mapboxMap).target.longitude)));
                A0c.put(0Pz.A0T("midgard_layers map", this.A00), TextUtils.join("\n", A00));
                Iterator it2 = A00.iterator();
                while (it2.hasNext()) {
                    0fH.A0j("com.facebook.maps.bugreporter.MidgardLayerDataReporter", AnonymousClass001.A0i(it2));
                }
                this.A00++;
            }
        }
        return A0c.build();
    }

    @Override // X.C4EE
    public ImmutableMap AlP() {
        return RegularImmutableMap.A03;
    }

    @Override // X.C4EE
    public String getName() {
        return "midgard_layers";
    }
}
