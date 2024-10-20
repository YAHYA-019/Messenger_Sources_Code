package com.facebook.messaging.business.inboxads.plugins.inboxads.itemviewbinder;

import X.06Z;
import X.1Bn;
import X.2YH;
import X.4Zh;
import X.4Zk;
import X.AbR;
import android.content.Context;
import com.facebook.inject.FbInjector;

/* loaded from: InboxAdsItemViewBinderImplementation.class */
public final class InboxAdsItemViewBinderImplementation {
    public final 4Zk A00;

    public InboxAdsItemViewBinderImplementation(Context context, 06Z r303, AbR abR, 4Zh r305, 2YH r306) {
        r305.A00 = r306;
        Context A01 = FbInjector.A01();
        FbInjector.A04(abR.B92().Aqm());
        1Bn.A0M(abR);
        try {
            4Zk r0 = new 4Zk(context, r303, abR, r305);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A00 = r0;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }
}
