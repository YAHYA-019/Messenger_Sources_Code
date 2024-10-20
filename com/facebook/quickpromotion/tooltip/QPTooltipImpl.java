package com.facebook.quickpromotion.tooltip;

import X.0DL;
import X.0DR;
import X.0S2;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.2Zo;
import X.2Zy;
import X.2aH;
import X.2aK;
import X.4YV;
import X.4bQ;
import X.7zO;
import X.AJQ;
import X.AbG;
import X.C0c4;
import X.Efk;
import X.GG7;
import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.interstitial.triggers.InterstitialTrigger;

/* loaded from: QPTooltipImpl.class */
public final class QPTooltipImpl {
    public final 1Br A04 = 1Bq.A00(99717);
    public final 1Br A05 = 1Bq.A00(98768);
    public final 1Br A03 = 1Bq.A00(147913);
    public final 1Br A00 = 1Bu.A00(99619);
    public final 1Br A02 = 1Bq.A00(99631);
    public final 1Br A01 = AbG.A0M();

    /* JADX WARN: Code restructure failed: missing block: B:67:0x042c, code lost:
    
        if (r0.equals("long") != false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0071  */
    /* JADX WARN: Type inference failed for: r322v3, types: [X.RJz, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A00(android.content.Context r302, com.facebook.auth.usersession.FbUserSession r303, com.facebook.interstitial.triggers.InterstitialTrigger r304, X.Efk r305, X.GG7 r306, X.0DR r307, X.2aI r308, boolean r309) {
        /*
            Method dump skipped, instructions count: 1304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.quickpromotion.tooltip.QPTooltipImpl.A00(android.content.Context, com.facebook.auth.usersession.FbUserSession, com.facebook.interstitial.triggers.InterstitialTrigger, X.Efk, X.GG7, X.0DR, X.2aI, boolean):java.lang.Object");
    }

    public void A01(Context context, LifecycleOwner lifecycleOwner, InterstitialTrigger interstitialTrigger, Efk efk, GG7 gg7, boolean z) {
        11T.A0F(lifecycleOwner, 1);
        2aH A16 = 7zO.A16(lifecycleOwner);
        AJQ ajq = new AJQ(this, 4YV.A0E(context), context, interstitialTrigger, A16, efk, gg7, (0DR) null, 2, z);
        2aK.A01(0S2.A00, 0DL.A00, ajq, A16);
    }

    public void A02(Context context, InterstitialTrigger interstitialTrigger, Efk efk, GG7 gg7, boolean z) {
        LifecycleOwner lifecycleOwner;
        4YV.A1N(context, efk);
        ComponentCallbacks2 A00 = 4bQ.A00(context);
        if ((A00 instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) A00) != null) {
            A01(context, lifecycleOwner, interstitialTrigger, efk, gg7, z);
            return;
        }
        1Br.A04(this.A01).Cfx(C0c4.LOGGING, "QpTooltip", "Cannot find lifecycle owner from tooltip context");
        Integer num = 0S2.A00;
        2aH A01 = 2Zy.A01(2Zo.A02(num));
        2aK.A01(num, 0DL.A00, new AJQ(this, 4YV.A0E(context), context, interstitialTrigger, A01, efk, gg7, (0DR) null, 1, z), A01);
    }
}
