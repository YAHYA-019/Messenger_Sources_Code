package com.facebook.quickpromotion.bottomsheet;

import X.0DE;
import X.0fH;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Iw;
import X.2Zo;
import X.2Zy;
import X.2aH;
import X.2aK;
import X.2vS;
import X.4bQ;
import X.AJS;
import X.C2t1;
import X.InterfaceC06574hb;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.DialogInterface;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.interstitial.triggers.InterstitialTrigger;

/* loaded from: QPBottomSheet.class */
public final class QPBottomSheet {
    public final 1Br A00 = 1Bq.A00(66741);
    public final 1Br A03 = 1Bq.A00(98768);
    public final 1Br A01 = 1Bq.A00(67020);
    public final 1Br A04 = 1Bq.A00(99631);
    public final 1Br A02 = 1Bu.A00(99619);

    public static final 2vS A00(QPBottomSheet qPBottomSheet) {
        qPBottomSheet.A01.A00.get();
        return ((C2t1) qPBottomSheet.A03.A00.get()).A0Q(2vS.class, "10896");
    }

    public static final void A01(DialogInterface.OnShowListener onShowListener, FbUserSession fbUserSession, InterfaceC06574hb interfaceC06574hb, InterstitialTrigger interstitialTrigger, 1Iw r305, QPBottomSheet qPBottomSheet) {
        String str;
        ComponentCallbacks2 A00 = 4bQ.A00(r305.A0D);
        if (A00 == null) {
            str = "Cannot find activity from the given context";
        } else {
            if (A00 instanceof LifecycleOwner) {
                2aH A002 = 2Zy.A00((LifecycleOwner) A00, 2Zo.A01());
                2aK.A03((Integer) null, (0DE) null, new AJS((Activity) A00, onShowListener, fbUserSession, interfaceC06574hb, interstitialTrigger, r305, qPBottomSheet, null, A002), A002, 3);
                return;
            }
            str = "Current activity does not implement LifecycleOwner";
        }
        0fH.A0k("QpBottomSheet", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A02(android.app.Activity r302, android.content.DialogInterface.OnShowListener r303, com.facebook.auth.usersession.FbUserSession r304, X.InterfaceC06574hb r305, com.facebook.interstitial.triggers.InterstitialTrigger r306, X.1Iw r307, X.0DR r308, X.2aI r309) {
        /*
            Method dump skipped, instructions count: 892
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.quickpromotion.bottomsheet.QPBottomSheet.A02(android.app.Activity, android.content.DialogInterface$OnShowListener, com.facebook.auth.usersession.FbUserSession, X.4hb, com.facebook.interstitial.triggers.InterstitialTrigger, X.1Iw, X.0DR, X.2aI):java.lang.Object");
    }
}
