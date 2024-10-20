package com.facebook.wearable.common.comms.hera.host.applinks;

import X.04S;
import X.0fH;
import X.C00q;
import X.LAJ;
import kotlin.jvm.functions.Function1;

/* loaded from: AppLinksDevice$startConnection$2.class */
public final class AppLinksDevice$startConnection$2 extends C00q implements Function1 {
    public static final AppLinksDevice$startConnection$2 INSTANCE = new AppLinksDevice$startConnection$2();

    public AppLinksDevice$startConnection$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LAJ) obj);
        return 04S.A00;
    }

    public final void invoke(LAJ laj) {
        0fH.A0j(AppLinksDevice.TAG, "[LinkedDevice]: onDisposed");
    }
}
