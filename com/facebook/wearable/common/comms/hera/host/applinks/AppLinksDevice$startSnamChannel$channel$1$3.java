package com.facebook.wearable.common.comms.hera.host.applinks;

import X.04S;
import X.0fH;
import X.7zO;
import X.AnonymousClass001;
import X.C00q;
import X.KLm;
import kotlin.jvm.functions.Function1;

/* loaded from: AppLinksDevice$startSnamChannel$channel$1$3.class */
public final class AppLinksDevice$startSnamChannel$channel$1$3 extends C00q implements Function1 {
    public final /* synthetic */ AppLinksDevice this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLinksDevice$startSnamChannel$channel$1$3(AppLinksDevice appLinksDevice) {
        super(1);
        this.this$0 = appLinksDevice;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((KLm) obj);
        return 04S.A00;
    }

    public final void invoke(KLm kLm) {
        StringBuilder A0x = 7zO.A0x(kLm, 0);
        A0x.append("[SNAM DataX] Error: ");
        0fH.A0k(AppLinksDevice.TAG, AnonymousClass001.A0a(kLm.error, A0x));
        AppLinksDevice appLinksDevice = this.this$0;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("SNAM DataX error: ");
        appLinksDevice.teardownAndMaybeScheduleRetry(AnonymousClass001.A0a(kLm.error, A0k));
    }
}
