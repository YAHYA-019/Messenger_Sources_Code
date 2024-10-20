package com.facebook.messaging.business.bmop.plugins.bmopcomposerlifecycle;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1G2;
import X.1NK;
import android.content.Context;
import com.facebook.litho.LithoView;

/* loaded from: BmopComposerLifeCycleImplementation.class */
public final class BmopComposerLifeCycleImplementation {
    public LithoView A00;
    public final Context A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1G2 A05;

    public BmopComposerLifeCycleImplementation(Context context) {
        11T.A0F(context, 1);
        this.A01 = context;
        this.A04 = 1Bu.A01(context, 16428);
        this.A02 = 1Bq.A00(16458);
        this.A03 = 1Bq.A00(33013);
        1G2 A0D = 1NK.A1z.A0D("bmop/red_dot_enabled");
        11T.A0A(A0D);
        this.A05 = A0D;
    }
}
