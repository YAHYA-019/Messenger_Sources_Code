package com.facebook.messaging.navigation.plugins.drawerfoldersections.morefoldersection;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1Lm;
import X.1qI;
import X.6qM;
import X.C4Nh;
import X.C4Xo;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: MoreDrawerFolderImplementation.class */
public final class MoreDrawerFolderImplementation {
    public boolean A00;
    public final Context A01;
    public final 1Br A02;
    public final 1Br A03;
    public final C4Nh A04;
    public final C4Xo A05;
    public final FbUserSession A06;

    public MoreDrawerFolderImplementation(Context context, FbUserSession fbUserSession, C4Xo c4Xo) {
        11T.A0F(context, 1);
        11T.A0F(c4Xo, 3);
        this.A01 = context;
        this.A06 = fbUserSession;
        this.A05 = c4Xo;
        this.A03 = 1Lm.A01(fbUserSession, 83214);
        this.A02 = 1Lm.A01(fbUserSession, 68927);
        this.A04 = new C4Nh(this);
    }

    public static final int A00() {
        1Br A00 = 1Bq.A00(66409);
        if (6qM.A00().A00() == null) {
            return 0;
        }
        int i = 2131952689;
        if (((1qI) A00.A00.get()).A00.AZk(72340430521372375L)) {
            i = 2131952690;
        }
        return i;
    }
}
