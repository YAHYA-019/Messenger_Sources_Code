package com.facebook.messaging.notify.plugins.mutexapp.threadsettingsaction;

import X.06Z;
import X.11T;
import X.1Br;
import X.1Bu;
import X.2Sh;
import X.7zT;
import X.AbG;
import X.DJX;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: MuteUnmuteAction.class */
public final class MuteUnmuteAction {
    public final 06Z A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final ThreadKey A05;
    public final ThreadSummary A06;
    public final DJX A07;
    public final 2Sh A08;
    public final Context A09;

    public MuteUnmuteAction(Context context, 06Z r303, ThreadKey threadKey, ThreadSummary threadSummary, DJX djx, 2Sh r307) {
        11T.A0F(context, 1);
        7zT.A11(2, threadKey, r307, r303, djx);
        this.A09 = context;
        this.A05 = threadKey;
        this.A06 = threadSummary;
        this.A08 = r307;
        this.A00 = r303;
        this.A07 = djx;
        this.A03 = 1Bu.A01(context, 17005);
        this.A01 = AbG.A0R();
        this.A02 = 1Bu.A00(147585);
        this.A04 = 1Bu.A01(context, 17010);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006d, code lost:
    
        if (r309 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
    
        r310 = new java.lang.Object();
        ((X.COp) r310).A03 = new X.CYu(2, r306, r304, r301, r0);
        X.COp.A01(X.2MQ.A0T, (X.COp) r310);
        ((X.COp) r310).A01 = 2131967134;
        ((X.COp) r310).A00 = 2131967134;
        ((X.COp) r310).A05 = X.AbG.A1b(X.AbL.A0O(r301.A01), 36316233410291540L);
        r310 = r310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e0, code lost:
    
        return new X.C8R(r310);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x01c3, code lost:
    
        r310 = new java.lang.Object();
        ((X.COp) r310).A03 = new X.CYr(18, r306, r304, r301);
        X.COp.A01(X.2MQ.A0S, (X.COp) r310);
        ((X.COp) r310).A01 = 2131967130;
        ((X.COp) r310).A00 = 2131967130;
        r310 = r310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01bd, code lost:
    
        if (r305.booleanValue() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x016e, code lost:
    
        if (r305.booleanValue() != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x020d, code lost:
    
        if (r0 != null) goto L7;
     */
    /* JADX WARN: Type inference failed for: r310v1, types: [X.COp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r310v3, types: [X.COp, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.C8R A00() {
        /*
            Method dump skipped, instructions count: 531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.notify.plugins.mutexapp.threadsettingsaction.MuteUnmuteAction.A00():X.C8R");
    }
}
