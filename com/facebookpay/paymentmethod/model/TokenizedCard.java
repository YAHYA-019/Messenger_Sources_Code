package com.facebookpay.paymentmethod.model;

import X.LGn;
import X.MQ5;
import X.MQV;
import android.os.Parcelable;

/* loaded from: TokenizedCard.class */
public final class TokenizedCard extends CreditCard {
    public static final Parcelable.Creator CREATOR = LGn.A00(8);
    public final MQV A00;
    public final MQ5 A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x003b, code lost:
    
        if (X.0CU.A0O(r306) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TokenizedCard(X.MQV r302, X.MQ5 r303, boolean r304, boolean r305) {
        /*
            r301 = this;
            r0 = r302
            r1 = r303
            X.1BL.A1F(r0, r1)
            r0 = r301
            r1 = r302
            r2 = r304
            r3 = r305
            r0.<init>(r1, r2, r3)
            r0 = r301
            r1 = r302
            r0.A00 = r1
            r0 = r301
            r1 = r303
            r0.A01 = r1
            r0 = r301
            r1 = r304
            r0.A05 = r1
            r0 = r301
            r1 = r305
            r0.A04 = r1
            r0 = r303
            java.lang.String r0 = r0.AsM()
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L3e
            r0 = r306
            boolean r0 = X.0CU.A0O(r0)
            r307 = r0
            r0 = 0
            r308 = r0
            r0 = r307
            if (r0 == 0) goto L41
        L3e:
            r0 = 1
            r308 = r0
        L41:
            r0 = 0
            r309 = r0
            r0 = r308
            if (r0 == 0) goto L4c
            r0 = 0
            r306 = r0
        L4c:
            r0 = r301
            r1 = r306
            r0.A02 = r1
            r0 = r303
            java.lang.String r0 = r0.AsN()
            r310 = r0
            r0 = r310
            if (r0 == 0) goto L6f
            r0 = r310
            boolean r0 = X.0CU.A0O(r0)
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L6f
            r0 = r310
            r309 = r0
        L6f:
            r0 = r301
            r1 = r309
            r0.A03 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.paymentmethod.model.TokenizedCard.<init>(X.MQV, X.MQ5, boolean, boolean):void");
    }
}
