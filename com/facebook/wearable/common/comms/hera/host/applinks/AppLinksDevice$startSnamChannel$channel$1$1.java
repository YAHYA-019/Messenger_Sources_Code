package com.facebook.wearable.common.comms.hera.host.applinks;

import X.04S;
import X.0fH;
import X.C00m;
import X.C00q;

/* loaded from: AppLinksDevice$startSnamChannel$channel$1$1.class */
public final class AppLinksDevice$startSnamChannel$channel$1$1 extends C00q implements C00m {
    public final /* synthetic */ AppLinksDevice this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLinksDevice$startSnamChannel$channel$1$1(AppLinksDevice appLinksDevice) {
        super(0);
        this.this$0 = appLinksDevice;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        m10245invoke();
        return 04S.A00;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m10245invoke() {
        AppLinksDevice appLinksDevice = this.this$0;
        appLinksDevice.onDebugStats.invoke("SNAM channel closed", appLinksDevice);
        0fH.A0l(AppLinksDevice.TAG, "[SNAM DataX] onClosed");
    }
}
