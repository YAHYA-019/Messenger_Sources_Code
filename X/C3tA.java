package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3tA, reason: invalid class name */
/* loaded from: 3tA.class */
public abstract class C3tA {
    public static final 2Jd A00() {
        2Jd r0 = new 2Jd(71);
        r0.A06("is_flipper_enabled", false);
        r0.A09("debug_tooling_metadata_token", null);
        int[] iArr = {0, 1};
        ArrayList arrayList = new ArrayList();
        11T.A0D(iArr);
        int i = 0;
        do {
            int i2 = iArr[i];
            List A05 = 1Wg.A05(i2);
            if (A05 != null) {
                if (i2 != 0 && i2 != 1) {
                    throw AnonymousClass001.A0L(String.format(DKB.A00(0), AnonymousClass001.A1a(i2)));
                }
                11T.A0F("XMDS", 1);
                2Jd r02 = new 2Jd(9);
                r02.A0A("value", A05);
                r02.A09("design_system_name", "XMDS");
                arrayList.add(r02);
            }
            i++;
        } while (i < 2);
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        r0.A0A("theme_params", arrayList);
        return r0;
    }
}
