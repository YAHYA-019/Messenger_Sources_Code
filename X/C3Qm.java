package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3Qm, reason: invalid class name */
/* loaded from: 3Qm.class */
public final class C3Qm {
    public static C3Qm A01;
    public final AnonymousClass244 A00 = AnonymousClass243.A00();

    public static HashMap A00(C3Qm c3Qm, 24X r302) {
        try {
            Iterator A0N = c3Qm.A00.A0I(r302.toString().contains("\\") ? r302.A0H() : r302.toString()).A0N();
            HashMap A0u = AnonymousClass001.A0u();
            while (A0N.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0N);
                A0u.put(A0z.getKey(), ((24X) A0z.getValue()).A0H());
            }
            return A0u;
        } catch (2LD | IOException unused) {
            return null;
        }
    }

    public ArrayList A01(24X r302) {
        ArrayList A0s;
        String str;
        String str2;
        if (r302 == null) {
            A0s = null;
        } else {
            A0s = AnonymousClass001.A0s();
            if (!r302.A0R()) {
                try {
                    str = r302 instanceof 2Jz ? r302.A0I() : this.A00.A0W(r302);
                } catch (2LD unused) {
                    str = null;
                }
                A0s.add(str);
                return A0s;
            }
            Iterator it = r302.iterator();
            while (it.hasNext()) {
                24X r0 = (24X) it.next();
                if (r0 instanceof 2Jz) {
                    try {
                        str2 = r0.A0I();
                    } catch (2LD unused2) {
                        str2 = null;
                    }
                } else {
                    str2 = this.A00.A0W(r0);
                }
                A0s.add(str2);
            }
        }
        return A0s;
    }
}
