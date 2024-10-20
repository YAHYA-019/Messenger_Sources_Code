package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9iR, reason: invalid class name */
/* loaded from: 9iR.class */
public abstract class C9iR {
    public static final 2cM A00(1Iw r301) {
        2cM A00 = 2cK.A00(r301);
        A00.A1N(2);
        A00.A0L();
        A00.A0e();
        A00.A0Q();
        A00.A1C(14.0f);
        return A00;
    }

    public static final List A01(String str) {
        List A03 = 0AI.A03(0AI.A08(ATb.A00, new C04t("entity_id=(\\d+)").A04(str, 0)));
        ArrayList A0z = 1BL.A0z(A03);
        Iterator it = A03.iterator();
        while (it.hasNext()) {
            A0z.add(1BK.A0X(AnonymousClass001.A0i(it)));
        }
        return A0z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (X.0CU.A0O(r302) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (X.0CU.A0O(r301) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.List A02(java.lang.String r301, java.lang.String r302) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9iR.A02(java.lang.String, java.lang.String):java.util.List");
    }
}
