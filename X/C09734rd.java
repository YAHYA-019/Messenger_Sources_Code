package X;

import android.text.TextUtils;
import com.facebook.common.util.TriState;
import com.google.common.collect.ImmutableList;

/* renamed from: X.4rd, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4rd.class */
public final class C09734rd extends AbstractC09704ra {
    public final C09744re A02 = (C09744re) 1Bn.A0A(49312);
    public final C00i A01 = new 1BQ(33013);
    public long A00 = 24;

    @Override // X.InterfaceC04003zj
    public 4qU AZ3() {
        return new 4qU() { // from class: X.3Xh
            public Iterable B0L() {
                return ImmutableList.of((Object) new C4r6(TriState.NO, C09734rd.this.A02, null, null, "mqtt_config"));
            }

            public void CA9(java.util.Map map) {
                String str;
                24X r0;
                java.util.Map map2 = (java.util.Map) map.get("mqtt_config");
                if (map2 == null || (r0 = (24X) map2.get("mqtt_config")) == null) {
                    str = "";
                } else {
                    str = r0.toString();
                    C09734rd c09734rd = C09734rd.this;
                    c09734rd.A00 = Math.min(c09734rd.A00, r0.A0E("fetch_delay_hours").A09(c09734rd.A00));
                }
                C00i c00i = C09734rd.this.A01;
                c00i.get();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                1Ql A0V = 1BL.A0V(c00i);
                A0V.CaL(C1ly.A03, str);
                A0V.commit();
            }
        };
    }

    @Override // X.InterfaceC04003zj
    public long Axo() {
        return this.A00 * 3600000;
    }
}
