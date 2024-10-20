package com.facebook.wearable.common.comms.hera.host.applinks;

import X.04S;
import X.0fH;
import X.7zO;
import X.AnonymousClass001;
import X.C00q;
import X.LAJ;
import kotlin.jvm.functions.Function1;

/* loaded from: LinkedDeviceManager$makeLam$1$4.class */
public final class LinkedDeviceManager$makeLam$1$4 extends C00q implements Function1 {
    public static final LinkedDeviceManager$makeLam$1$4 INSTANCE = new LinkedDeviceManager$makeLam$1$4();

    public LinkedDeviceManager$makeLam$1$4() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LAJ) obj);
        return 04S.A00;
    }

    public final void invoke(LAJ laj) {
        0fH.A0l(LinkedDeviceManager.TAG, AnonymousClass001.A0Z(laj, "Device removed: ", 7zO.A0x(laj, 0)));
    }
}
