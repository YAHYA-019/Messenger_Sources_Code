package com.facebook.wearable.common.comms.hera.host.applinks;

import X.04S;
import X.0fH;
import X.C00q;
import X.KOK;
import kotlin.jvm.functions.Function1;

/* loaded from: AppLinksDevice$startConnection$4.class */
public final class AppLinksDevice$startConnection$4 extends C00q implements Function1 {
    public static final AppLinksDevice$startConnection$4 INSTANCE = new AppLinksDevice$startConnection$4();

    public AppLinksDevice$startConnection$4() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((KOK) obj);
        return 04S.A00;
    }

    public final void invoke(KOK kok) {
        0fH.A0j(AppLinksDevice.TAG, "[LinkedDevice]: onLinkSwitchFailure");
    }
}
