package X;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: Hw2.class */
public abstract class Hw2 {
    /* JADX WARN: Code restructure failed: missing block: B:85:0x034b, code lost:
    
        if (r0.A05 != null) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.Hqj A00(X.JO9 r301, X.JO9 r302, X.I9d r303, boolean r304, boolean r305, boolean r306, boolean r307) {
        /*
            Method dump skipped, instructions count: 1238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Hw2.A00(X.JO9, X.JO9, X.I9d, boolean, boolean, boolean, boolean):X.Hqj");
    }

    public static void A01(JO9 jo9, JO9 jo92, HAy hAy, I9d i9d, HashMap hashMap, boolean z) {
        Hqj A00;
        HashMap A08 = i9d.A08(hAy);
        if (A08 != null) {
            HashMap A0u = AnonymousClass001.A0u();
            hashMap.put(hAy, A0u);
            Iterator A0x = AnonymousClass001.A0x(A08);
            while (A0x.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0x);
                ArrayList A0s = AnonymousClass001.A0s();
                A0u.put(A0z.getKey(), A0s);
                Iterator A1D = GOp.A1D(((Huc) A0z.getValue()).A04);
                while (A1D.hasNext()) {
                    HuY huY = (HuY) A1D.next();
                    File file = huY.A04;
                    URL url = huY.A05;
                    if (huY.A01(z)) {
                        IFX.A07(AnonymousClass001.A1T(file), (String) null);
                        jo9.getClass();
                        IFX.A06(file);
                        A00 = JO9.A00(jo9, file);
                    } else {
                        jo92.getClass();
                        if (file != null) {
                            A00 = JO9.A00(jo92, file);
                        } else if (url != null) {
                            A00 = jo92.ARk(url);
                        }
                    }
                    A0s.add(A00);
                }
            }
        }
    }
}
