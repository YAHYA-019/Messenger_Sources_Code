package com.facebook.wearable.common.comms.hera.host.applinks;

import X.04S;
import X.0fH;
import X.11T;
import X.AnonymousClass001;
import X.C00q;
import java.util.UUID;
import kotlin.jvm.functions.Function1;

/* loaded from: LinkedDeviceManager$makeLam$1$1.class */
public final class LinkedDeviceManager$makeLam$1$1 extends C00q implements Function1 {
    public final /* synthetic */ LinkedDeviceManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkedDeviceManager$makeLam$1$1(LinkedDeviceManager linkedDeviceManager) {
        super(1);
        this.this$0 = linkedDeviceManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((UUID) obj);
        return 04S.A00;
    }

    public final void invoke(UUID uuid) {
        11T.A0F(uuid, 0);
        this.this$0.debugStat = "App Linked";
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("App Linked uuid=");
        A0k.append(uuid);
        0fH.A0j(LinkedDeviceManager.TAG, AnonymousClass001.A0d(".  Wait for device config", A0k));
    }
}
