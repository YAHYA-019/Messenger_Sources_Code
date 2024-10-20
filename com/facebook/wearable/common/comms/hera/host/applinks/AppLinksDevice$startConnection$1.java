package com.facebook.wearable.common.comms.hera.host.applinks;

import X.04S;
import X.0fH;
import X.C00q;
import X.LAJ;
import kotlin.jvm.functions.Function1;

/* loaded from: AppLinksDevice$startConnection$1.class */
public final class AppLinksDevice$startConnection$1 extends C00q implements Function1 {
    public final /* synthetic */ AppLinksDevice this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLinksDevice$startConnection$1(AppLinksDevice appLinksDevice) {
        super(1);
        this.this$0 = appLinksDevice;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LAJ) obj);
        return 04S.A00;
    }

    public final void invoke(LAJ laj) {
        0fH.A0j(AppLinksDevice.TAG, "[LinkedDevice]: onReady");
        this.this$0.handleLinkedDeviceReady();
    }
}
