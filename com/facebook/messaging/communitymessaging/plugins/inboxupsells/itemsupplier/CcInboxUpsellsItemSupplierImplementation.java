package com.facebook.messaging.communitymessaging.plugins.inboxupsells.itemsupplier;

import X.0S2;
import X.1BL;
import X.1Br;
import X.1Lm;
import X.2Si;
import X.C3Nb;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.inbox.units.StaticUnitConfig;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: CcInboxUpsellsItemSupplierImplementation.class */
public final class CcInboxUpsellsItemSupplierImplementation {
    public static final StaticUnitConfig A06 = new StaticUnitConfig(0S2.A0j, "1674434246165228", null, false);
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final C3Nb A03;
    public final 2Si A04;
    public final AtomicReference A05;

    public CcInboxUpsellsItemSupplierImplementation(Context context, FbUserSession fbUserSession, 2Si r304) {
        1BL.A1H(context, fbUserSession, r304);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A04 = r304;
        this.A02 = 1Lm.A00(context, fbUserSession, 83111);
        this.A05 = new AtomicReference(null);
        this.A03 = new C3Nb(this);
    }
}
