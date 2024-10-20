package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: C6j.class */
public final class C6j {
    public final Context A00 = 7zM.A0A();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        if (X.2oI.A06(r302) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        if (r308 != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A00(com.facebook.messaging.model.threads.ThreadSummary r302, boolean r303) {
        /*
            r301 = this;
            r0 = r301
            android.content.Context r0 = r0.A00
            r304 = r0
            r0 = r302
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A0n
            r305 = r0
            r0 = r305
            boolean r0 = r0.A0w()
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L22
            r0 = 2131966960(0x7f133bf0, float:1.9570773E38)
            r306 = r0
        L1b:
            r0 = r304
            r1 = r306
            java.lang.String r0 = X.1BK.A0u(r0, r1)
            return r0
        L22:
            r0 = r302
            boolean r0 = X.2oI.A03(r0)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L80
            r0 = r302
            java.lang.Integer r0 = r0.A1d
            r305 = r0
            r0 = 1
            r307 = r0
            r0 = r305
            if (r0 == 0) goto L7a
            r0 = r305
            int r0 = r0.intValue()
            r306 = r0
            r0 = r306
            r1 = r307
            if (r0 != r1) goto L7a
        L49:
            r0 = r302
            boolean r0 = X.2oI.A04(r0)
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L62
            r0 = r302
            boolean r0 = X.2oI.A06(r0)
            r306 = r0
            r0 = 0
            r308 = r0
            r0 = r306
            if (r0 == 0) goto L65
        L62:
            r0 = 1
            r308 = r0
        L65:
            r0 = r307
            if (r0 != 0) goto L73
            r0 = 2131966962(0x7f133bf2, float:1.9570777E38)
            r306 = r0
            r0 = r308
            if (r0 == 0) goto L1b
        L73:
            r0 = 2131966961(0x7f133bf1, float:1.9570775E38)
            r306 = r0
            goto L1b
        L7a:
            r0 = 0
            r307 = r0
            goto L49
        L80:
            r0 = 2131966959(0x7f133bef, float:1.957077E38)
            r306 = r0
            r0 = r303
            if (r0 == 0) goto L1b
            r0 = 2131966963(0x7f133bf3, float:1.9570779E38)
            r306 = r0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6j.A00(com.facebook.messaging.model.threads.ThreadSummary, boolean):java.lang.String");
    }

    public String A01(ThreadSummary threadSummary, boolean z) {
        int i;
        int i2;
        C6jR A00 = threadSummary.AoK().A00();
        Resources A0C = 4YU.A0C(this.A00);
        if (z) {
            i = 2131966958;
            i2 = 2131966970;
        } else {
            i = 2131966957;
            if (2oI.A04(threadSummary) || 2oI.A06(threadSummary)) {
                i2 = 2131966961;
            } else {
                i2 = 2131966969;
                if (2oI.A03(threadSummary)) {
                    i2 = 2131966962;
                }
            }
        }
        return BU1.A00(A0C, A00, new Object[0], i, i2);
    }
}
