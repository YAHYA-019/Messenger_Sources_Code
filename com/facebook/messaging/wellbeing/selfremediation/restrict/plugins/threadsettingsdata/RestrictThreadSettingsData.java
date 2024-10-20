package com.facebook.messaging.wellbeing.selfremediation.restrict.plugins.threadsettingsdata;

import X.0CW;
import X.1Br;
import X.1Hv;
import X.1Lm;
import X.1P9;
import X.1PA;
import X.7zS;
import X.AbJ;
import X.C1774As8;
import X.C1x;
import X.C5ws;
import X.D0U;
import X.GOm;
import X.I9B;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.user.model.User;

/* loaded from: RestrictThreadSettingsData.class */
public final class RestrictThreadSettingsData {
    public User A00;
    public boolean A01;
    public final 1PA A02;
    public final 1Br A03;
    public final C1x A04;
    public final Context A05;
    public final FbUserSession A06;

    public RestrictThreadSettingsData(Context context, FbUserSession fbUserSession, C1x c1x) {
        7zS.A16(1, context, c1x, fbUserSession);
        this.A05 = context;
        this.A04 = c1x;
        this.A06 = fbUserSession;
        this.A03 = 1Lm.A00(context, fbUserSession, 82499);
        this.A02 = 1P9.A01(AbJ.A0B(1Hv.A02(context, 65728)), new D0U(this, 33), GOm.A00(227));
        this.A01 = true;
    }

    public static final C1774As8 A00(RestrictThreadSettingsData restrictThreadSettingsData) {
        String str;
        User user = restrictThreadSettingsData.A00;
        Long A0e = (user == null || (str = user.A13) == null) ? null : 0CW.A0e(str);
        return new C1774As8(C5ws.A00(restrictThreadSettingsData.A00), A0e != null ? ((I9B) 1Br.A0B(restrictThreadSettingsData.A03)).A04(A0e.longValue()) : false);
    }
}
