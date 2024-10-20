package com.facebook.messaging.communitymessaging.plugins.insights.insightsdashboardentrypointitemsupplier;

import X.11T;
import X.1Br;
import X.1Bu;
import X.2Si;
import X.2Sk;
import X.AbG;
import X.CaE;
import android.content.Context;
import androidx.lifecycle.Observer;
import com.facebook.auth.usersession.FbUserSession;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: InsightsDashboardEntryPointItemSupplierImplementation.class */
public final class InsightsDashboardEntryPointItemSupplierImplementation {
    public final Context A00;
    public final Observer A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 2Si A07;
    public final 2Sk A08;
    public final AtomicReference A09;

    public InsightsDashboardEntryPointItemSupplierImplementation(Context context, FbUserSession fbUserSession, 2Si r304, 2Sk r305) {
        11T.A0F(r304, 4);
        this.A00 = context;
        this.A02 = fbUserSession;
        this.A08 = r305;
        this.A07 = r304;
        this.A05 = 1Bu.A01(context, 82785);
        this.A09 = new AtomicReference(null);
        this.A04 = AbG.A0U();
        this.A06 = 1Bu.A00(16430);
        this.A03 = AbG.A0K();
        this.A01 = CaE.A00(this, 71);
    }
}
