package com.facebook.messaging.settings.plugins.iadrawer.drawerheader;

import X.11T;
import X.1Bq;
import X.1Br;
import X.2OV;
import X.4IA;
import X.4IB;
import X.C4I3;
import X.C4I4;
import X.C4I9;
import X.C4Vr;
import X.C4Xo;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.settings.plugins.iadrawer.drawerheader.MeSettingsDrawerHeaderImplementation;

/* loaded from: MeSettingsDrawerHeaderImplementation.class */
public final class MeSettingsDrawerHeaderImplementation {
    public static final 4IB A09 = new 4IB(C4I9.A01, 4IA.A0M, "ia_drawer");
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 2OV A05;
    public final C4I4 A06;
    public final C4Xo A07;
    public final FbUserSession A08;

    public MeSettingsDrawerHeaderImplementation(Context context, FbUserSession fbUserSession, C4Xo c4Xo) {
        11T.A0F(context, 1);
        11T.A0F(c4Xo, 2);
        11T.A0F(fbUserSession, 3);
        this.A00 = context;
        this.A07 = c4Xo;
        this.A08 = fbUserSession;
        this.A03 = 1Bq.A00(16839);
        this.A02 = 1Bq.A00(82516);
        this.A04 = 1Bq.A00(83657);
        this.A06 = C4I4.A00(context, fbUserSession, new C4I3() { // from class: X.4N9
            @Override // X.C4I3
            public void CSO() {
                ((C4Fm) MeSettingsDrawerHeaderImplementation.this.A07.A01).A1a();
            }
        });
        this.A01 = 1Bq.A00(67028);
        this.A05 = new C4Vr(this, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x024b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.4ND A00(com.facebook.messaging.settings.plugins.iadrawer.drawerheader.MeSettingsDrawerHeaderImplementation r301) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.settings.plugins.iadrawer.drawerheader.MeSettingsDrawerHeaderImplementation.A00(com.facebook.messaging.settings.plugins.iadrawer.drawerheader.MeSettingsDrawerHeaderImplementation):X.4ND");
    }
}
