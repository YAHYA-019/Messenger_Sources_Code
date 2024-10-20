package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: I6E.class */
public abstract class I6E {
    public static final void A00(HCL hcl, String str, String str2, java.util.Map map) {
        A01(hcl.eventName, str, str2, hcl.tags, map, hcl.isCritical);
    }

    public static final void A01(String str, String str2, String str3, List list, java.util.Map map, boolean z) {
        List A0V;
        1UG A08;
        int i;
        11T.A0H(str, list);
        IDO ido = IDO.A00;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Reliability event:\n");
        A0k.append(str);
        A0k.append("\nlocalCallId=");
        A0k.append(str2);
        A0k.append("\nsharedCallId=");
        A0k.append(str3);
        ido.A03("RpAnalyticsLog", AnonymousClass001.A0Z(map, "\neventData=", A0k), (Throwable) null);
        List list2 = 1hK.A00().A00;
        synchronized (list2) {
            A0V = 0QD.A0V(list2);
        }
        Iterator it = A0V.iterator();
        while (it.hasNext()) {
            1hC r0 = ((1hE) it.next()).A00;
            1Br r02 = 1hC.A05;
            1hD.A01(r0, new C2y1(str, r0, 9));
        }
        04J r03 = (04J) 1BK.A0D().get();
        if (r03 != null) {
            if (z) {
                A08 = 1BK.A08(r03, 1BJ.A00(1997));
                i = 288;
            } else {
                A08 = 1BK.A08(r03, 1BJ.A00(1998));
                i = 289;
            }
            2R2 A082 = AbF.A08(A08, i);
            if (4YU.A1X(A082)) {
                A082.A0E("event", str);
                A082.A0F("tags", list);
                if (map != null) {
                    ((0D7) A082).A00.A6J("event_data", map);
                }
                if (str2 != null) {
                    A082.A0E("local_call_id", str2);
                }
                if (str3 != null) {
                    A082.A0E("shared_call_id", str3);
                }
                A082.BZL();
            }
        }
    }

    public static final void A02(String str, List list, java.util.Map map) {
        A01(str, null, null, list, map, true);
    }
}
