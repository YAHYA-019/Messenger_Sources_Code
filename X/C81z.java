package X;

import com.facebook.acra.constants.ActionId;

/* renamed from: X.81z, reason: invalid class name */
/* loaded from: 81z.class */
public final class C81z {
    public final 1Br A00 = 1Bq.A00(16634);

    public static final int A00(5SW r301) {
        switch (r301.ordinal()) {
            case 2:
            case ActionId.ON_START_END /* 47 */:
            case ActionId.QUEUEING_FAIL /* 56 */:
                return 2;
            case 11:
            case ActionId.QUEUEING_SUCCESS /* 55 */:
            case ActionId.MESSAGE_UPDATE_END /* 58 */:
                return 1;
            case ActionId.METHOD_INVOKE /* 88 */:
            case ActionId.FINALLY /* 89 */:
                return 3;
            default:
                return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0056, code lost:
    
        if (r305 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A01(X.C81z r301, com.facebook.messaging.model.threadkey.ThreadKey r302, int r303) {
        /*
            r0 = r301
            X.1Br r0 = r0.A00
            X.00i r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.04J r0 = (X.04J) r0
            r304 = r0
            r0 = 2097(0x831, float:2.939E-42)
            java.lang.String r0 = X.1BJ.A00(r0)
            r305 = r0
            r0 = r304
            X.1UD r0 = (X.1UD) r0
            r304 = r0
            X.1ZG r0 = X.1ZG.A01
            r306 = r0
            r0 = r304
            r1 = r306
            r2 = r305
            X.1UG r0 = X.1UD.A00(r0, r1, r2)
            r301 = r0
            r0 = r301
            boolean r0 = r0.isSampled()
            r307 = r0
            r0 = r307
            if (r0 == 0) goto Lb8
            X.81g r0 = new X.81g
            r308 = r0
            r0 = r308
            r0.<init>()
            java.lang.String r0 = ""
            r304 = r0
            r0 = r302
            if (r0 == 0) goto L59
            r0 = r302
            long r0 = r0.A0r()
            r309 = r0
            r0 = r309
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L5c
        L59:
            r0 = r304
            r305 = r0
        L5c:
            java.lang.String r0 = "id"
            r306 = r0
            r0 = r308
            r1 = r306
            r2 = r305
            r0.A07(r1, r2)
            r0 = r302
            if (r0 == 0) goto L7b
            r0 = r302
            java.lang.String r0 = r0.A0t()
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L7b
            r0 = r306
            r304 = r0
        L7b:
            r0 = r308
            java.lang.String r1 = "key"
            r2 = r304
            r0.A07(r1, r2)
            r0 = r302
            X.3yg r0 = X.AbstractC03573yf.A00(r0)
            r305 = r0
            r0 = r308
            r1 = r305
            java.lang.String r2 = "type"
            r0.A01(r1, r2)
            r0 = r301
            r1 = r308
            java.lang.String r2 = "thread"
            r0.A7T(r1, r2)
            r0 = 1068(0x42c, float:1.497E-42)
            r307 = r0
            r0 = r307
            java.lang.String r0 = X.4YT.A00(r0)
            r305 = r0
            r0 = r303
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r306 = r0
            r0 = r301
            r1 = r305
            r2 = r306
            r0.A5q(r1, r2)
            r0 = r301
            r0.BZL()
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81z.A01(X.81z, com.facebook.messaging.model.threadkey.ThreadKey, int):void");
    }
}
