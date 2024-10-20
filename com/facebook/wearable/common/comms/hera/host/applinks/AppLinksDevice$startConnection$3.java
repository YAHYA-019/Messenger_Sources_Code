package com.facebook.wearable.common.comms.hera.host.applinks;

import X.04S;
import X.0fH;
import X.C00q;
import X.KLm;
import java.util.UUID;
import kotlin.jvm.functions.Function2;

/* loaded from: AppLinksDevice$startConnection$3.class */
public final class AppLinksDevice$startConnection$3 extends C00q implements Function2 {
    public final /* synthetic */ AppLinksDevice this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLinksDevice$startConnection$3(AppLinksDevice appLinksDevice) {
        super(2);
        this.this$0 = appLinksDevice;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((UUID) obj, (KLm) obj2);
        return 04S.A00;
    }

    public final void invoke(UUID uuid, KLm kLm) {
        0fH.A0j(AppLinksDevice.TAG, "[LinkedDevice]: onLinkFailure");
        this.this$0.teardownAndMaybeScheduleRetry("Failed to open linked device");
    }
}
