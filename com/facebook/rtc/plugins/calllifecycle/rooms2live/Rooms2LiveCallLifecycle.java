package com.facebook.rtc.plugins.calllifecycle.rooms2live;

import X.1Br;
import X.1Lm;
import X.2QY;
import X.3Fu;
import X.C01i;
import X.GOn;
import X.Gys;
import X.Gyu;
import X.IYz;
import X.J9p;
import X.JDA;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Rooms2LiveCallLifecycle.class */
public final class Rooms2LiveCallLifecycle {
    public String A00;
    public final Context A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final JDA A09 = new IYz(this, 6);
    public final 2QY A0B = Gys.A00(this, 34);
    public final 3Fu A0A = Gyu.A00(this, 32);
    public final C01i A0D = J9p.A00(this, 42);
    public final C01i A0C = J9p.A00(this, 41);

    public Rooms2LiveCallLifecycle(Context context, FbUserSession fbUserSession) {
        this.A01 = context;
        this.A02 = fbUserSession;
        this.A03 = 1Lm.A00(context, fbUserSession, 85140);
        this.A05 = 1Lm.A00(context, fbUserSession, 114987);
        this.A07 = GOn.A0b(context, fbUserSession);
        this.A08 = GOn.A0Z(context, fbUserSession);
        this.A04 = 1Lm.A00(context, fbUserSession, 84176);
        this.A06 = 1Lm.A00(context, fbUserSession, 84219);
    }
}
