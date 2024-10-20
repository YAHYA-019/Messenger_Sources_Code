package com.facebook.messaging.montage.viewer.endcard.component;

import X.0fH;
import X.11T;
import X.1Bi;
import X.1CO;
import X.2Jf;
import X.5Tn;
import X.5iJ;
import X.5iK;
import X.5iL;
import X.C3t8;
import X.C91k;
import X.F9Q;
import X.RoY;

/* loaded from: MontageMidCardDataFetch.class */
public final class MontageMidCardDataFetch extends 5iK {
    public C91k A00;
    public 5iJ A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.facebook.messaging.montage.viewer.endcard.component.MontageMidCardDataFetch] */
    public static MontageMidCardDataFetch create(5iJ r301, C91k c91k) {
        ?? obj = new Object();
        obj.A01 = r301;
        obj.A00 = c91k;
        return obj;
    }

    public 5Tn A00() {
        5iJ r0 = this.A01;
        11T.A0F(r0, 0);
        C3t8 c3t8 = (C3t8) 1Bi.A03(32817);
        RoY roY = new RoY();
        roY.A01.A01(c3t8.A00(), "nt_context");
        F9Q f9q = new F9Q((2Jf) null, roY);
        if (f9q.A0C) {
            1CO r02 = 5iL.A0N;
            0fH.A0k("GraphServiceEmitter", "No-op! use adaptive graphql portal to set prefetch pacing");
        } else {
            f9q.A03 = 300L;
        }
        f9q.A02 = 300L;
        f9q.A02(300L);
        f9q.A00 = 300L;
        return F9Q.A00(r0, f9q, 1567251216773138L);
    }
}
