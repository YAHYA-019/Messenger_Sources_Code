package X;

import java.util.List;

/* renamed from: X.7xs, reason: invalid class name */
/* loaded from: 7xs.class */
public final class C7xs extends C7hs {
    public final List missingFields;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7xs(String str, Throwable th, List list) {
        super(str, th);
        11T.A0F(list, 1);
        this.missingFields = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C7xs(java.lang.String r302, java.util.List r303) {
        /*
            r301 = this;
            r0 = 1
            r304 = r0
            r0 = r302
            r1 = 2
            X.11T.A0F(r0, r1)
            r0 = r303
            int r0 = r0.size()
            r305 = r0
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0k()
            r306 = r0
            r0 = r305
            r1 = r304
            if (r0 != r1) goto L58
            r0 = r306
            java.lang.String r1 = "Field '"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r303
            java.lang.Object r0 = X.1BK.A0r(r0)
            java.lang.String r0 = (java.lang.String) r0
            r307 = r0
            r0 = r306
            r1 = r307
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r306
            java.lang.String r1 = "' is required for type with serial name '"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r306
            r1 = r302
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = "', but it was missing"
            r307 = r0
        L46:
            r0 = r307
            r1 = r306
            java.lang.String r0 = X.AnonymousClass001.A0d(r0, r1)
            r306 = r0
            r0 = r301
            r1 = r306
            r2 = 0
            r3 = r303
            r0.<init>(r1, r2, r3)
            return
        L58:
            r0 = r306
            java.lang.String r1 = "Fields "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r306
            r1 = r303
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r306
            java.lang.String r1 = " are required for type with serial name '"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r306
            r1 = r302
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = "', but they were missing"
            r307 = r0
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7xs.<init>(java.lang.String, java.util.List):void");
    }
}
