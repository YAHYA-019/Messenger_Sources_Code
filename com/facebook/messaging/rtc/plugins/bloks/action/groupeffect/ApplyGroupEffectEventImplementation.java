package com.facebook.messaging.rtc.plugins.bloks.action.groupeffect;

import X.0S2;
import X.11T;
import X.I3c;
import X.I5A;
import X.I5a;
import X.IMJ;
import android.content.Context;
import com.facebook.messaging.montage.model.art.EffectItem;

/* loaded from: ApplyGroupEffectEventImplementation.class */
public final class ApplyGroupEffectEventImplementation {
    public final Context A00;

    public ApplyGroupEffectEventImplementation(Context context) {
        11T.A0F(context, 1);
        this.A00 = context;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.Hff] */
    public static final void A00(Context context, I5a i5a, IMJ imj, EffectItem effectItem) {
        EffectItem effectItem2 = imj.A05;
        if (effectItem2 != null && effectItem2.A03() == effectItem.A03()) {
            effectItem = I5A.A04.A01();
        }
        ?? obj = new Object();
        obj.A00 = effectItem;
        obj.A01 = 0S2.A0u;
        obj.A02 = 0S2.A0C;
        i5a.A01(context, new I3c(obj));
    }
}
