package com.facebook.wearable.common.comms.hera.host.applinks;

import X.04S;
import X.0fH;
import X.AnonymousClass001;
import X.C00q;
import kotlin.jvm.functions.Function1;

/* loaded from: LinkedDeviceManager$makeLam$1$2.class */
public final class LinkedDeviceManager$makeLam$1$2 extends C00q implements Function1 {
    public final /* synthetic */ LinkedDeviceManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkedDeviceManager$makeLam$1$2(LinkedDeviceManager linkedDeviceManager) {
        super(1);
        this.this$0 = linkedDeviceManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return 04S.A00;
    }

    public final void invoke(Throwable th) {
        this.this$0.debugStat = "App Disconnected";
        0fH.A0k(LinkedDeviceManager.TAG, AnonymousClass001.A0Z(th, "App Disconnected: ", AnonymousClass001.A0k()));
    }
}
