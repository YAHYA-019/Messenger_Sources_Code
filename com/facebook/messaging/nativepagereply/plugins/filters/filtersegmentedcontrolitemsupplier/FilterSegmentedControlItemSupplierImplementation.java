package com.facebook.messaging.nativepagereply.plugins.filters.filtersegmentedcontrolitemsupplier;

import X.1BK;
import X.1BL;
import X.1Br;
import X.1Bu;
import X.2Si;
import X.AKO;
import X.C01g;
import X.C01i;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: FilterSegmentedControlItemSupplierImplementation.class */
public final class FilterSegmentedControlItemSupplierImplementation {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 2Si A05;
    public final C01i A06;
    public final C01i A07;

    public FilterSegmentedControlItemSupplierImplementation(Context context, FbUserSession fbUserSession, 2Si r304) {
        1BL.A1H(context, fbUserSession, r304);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A05 = r304;
        this.A03 = 1BK.A0E();
        this.A04 = 1Bu.A00(68138);
        this.A02 = 1Bu.A00(66610);
        this.A06 = C01g.A01(new AKO(this, 38));
        this.A07 = C01g.A01(new AKO(this, 39));
    }
}
