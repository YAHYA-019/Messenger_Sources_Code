package com.facebook.messaging.nativepagereply.plugins.filters.filtersegmentedcontrolviewbinder;

import X.11T;
import X.1BK;
import X.1BL;
import X.1Br;
import X.1Bu;
import X.1Hb;
import X.1Iw;
import X.1Lm;
import X.2SG;
import X.AKO;
import X.AnonymousClass001;
import X.C01g;
import X.C01i;
import X.C2iw;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import java.util.ArrayList;

/* loaded from: FilterSegmentedControlViewBinderImplementation.class */
public final class FilterSegmentedControlViewBinderImplementation {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Iw A04;
    public final C2iw A05;
    public final C01i A06;
    public final Context A07;
    public final FbUserSession A08;

    /* JADX WARN: Type inference failed for: r0v22, types: [X.2iw, java.lang.Object] */
    public FilterSegmentedControlViewBinderImplementation(Context context, 1Iw r303) {
        1BL.A1F(context, r303);
        this.A07 = context;
        this.A04 = r303;
        Context context2 = r303.A0D;
        11T.A0A(context2);
        1Br A01 = 1Bu.A01(context2, 16428);
        this.A03 = A01;
        FbUserSession A03 = 1Br.A03(A01);
        this.A08 = A03;
        this.A01 = 1Lm.A00(context2, A03, 33197);
        this.A02 = 1Bu.A00(68138);
        this.A00 = 1Bu.A00(66610);
        this.A05 = new Object();
        this.A06 = C01g.A01(new AKO(this, 40));
    }

    public static final ArrayList A00(FilterSegmentedControlViewBinderImplementation filterSegmentedControlViewBinderImplementation) {
        1Hb[] values = 1Hb.values();
        ArrayList A0s = AnonymousClass001.A0s();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                11T.A0F(A0s, 0);
                ArrayList A17 = 1BK.A17(A0s);
                A17.add(0, 1Hb.A02);
                return A17;
            }
            1Hb r0 = values[i2];
            if (((2SG) 1Br.A0B(filterSegmentedControlViewBinderImplementation.A01)).A03(r0, "inbox_segmented_control")) {
                A0s.add(r0);
            }
            i = i2 + 1;
        }
    }
}
