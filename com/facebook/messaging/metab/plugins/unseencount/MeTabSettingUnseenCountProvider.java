package com.facebook.messaging.metab.plugins.unseencount;

import X.0BY;
import X.11T;
import X.C0Bx;
import X.C4I3;
import X.C4I4;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import java.util.Map;

/* loaded from: MeTabSettingUnseenCountProvider.class */
public final class MeTabSettingUnseenCountProvider {
    public final Context A00;
    public final FbUserSession A01;
    public final C4I4 A02;
    public final C4I3 A03;
    public final String A04;
    public final Context A05;
    public final FbUserSession A06;
    public final C4I3 A07;

    public MeTabSettingUnseenCountProvider(Context context, FbUserSession fbUserSession, C4I3 c4i3) {
        11T.A0F(context, 1);
        11T.A0F(c4i3, 2);
        11T.A0F(fbUserSession, 3);
        this.A00 = context;
        this.A03 = c4i3;
        this.A01 = fbUserSession;
        Class<?> cls = getClass();
        Map map = 0BY.A03;
        11T.A0F(cls, 1);
        this.A04 = C0Bx.A01(cls);
        this.A02 = C4I4.A00(context, fbUserSession, c4i3);
        this.A05 = context;
        this.A07 = c4i3;
        this.A06 = fbUserSession;
    }
}
