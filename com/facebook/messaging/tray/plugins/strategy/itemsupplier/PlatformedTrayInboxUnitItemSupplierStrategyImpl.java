package com.facebook.messaging.tray.plugins.strategy.itemsupplier;

import X.11T;
import X.1Br;
import X.1Bu;
import X.C2gv;
import X.C2gw;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.inbox.units.StaticUnitConfig;

/* loaded from: PlatformedTrayInboxUnitItemSupplierStrategyImpl.class */
public final class PlatformedTrayInboxUnitItemSupplierStrategyImpl {
    public C2gv A00;
    public final Context A01;
    public final FbUserSession A02;
    public final 1Br A03;

    public PlatformedTrayInboxUnitItemSupplierStrategyImpl(Context context, FbUserSession fbUserSession) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        this.A01 = context;
        this.A02 = fbUserSession;
        StaticUnitConfig staticUnitConfig = C2gv.A06;
        this.A00 = C2gw.A00();
        this.A03 = 1Bu.A00(67916);
    }
}
