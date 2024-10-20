package com.facebook.messaging.rtc.incall.plugins.notification.feature.cowatch;

import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.DEy;
import X.GOn;
import X.Gps;
import X.Gq7;
import X.Gyx;
import X.HEt;
import X.HFa;
import X.HVr;
import X.IUn;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: CoWatchNotificationFeature.class */
public final class CoWatchNotificationFeature extends HEt {
    public String A00;
    public final Context A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final DEy A0F;
    public final Gps A0G;
    public final HFa A0H;
    public final HVr A0I;
    public final Gyx A0J;

    public CoWatchNotificationFeature(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A01 = context;
        this.A02 = fbUserSession;
        this.A07 = 1Lm.A00(context, fbUserSession, 115519);
        this.A05 = 1Lm.A00(context, fbUserSession, 115444);
        this.A06 = 1Bu.A01(context, 67593);
        this.A03 = GOn.A0a(context, fbUserSession);
        this.A0C = 1Lm.A00(context, fbUserSession, 83326);
        this.A0E = 1Bu.A00(16430);
        this.A0D = 1Bq.A00(83005);
        this.A0A = 1Lm.A00(context, fbUserSession, 99476);
        this.A09 = 1Bu.A01(context, 114827);
        this.A08 = 1Lm.A00(context, fbUserSession, 84737);
        this.A04 = GOn.A0b(context, fbUserSession);
        this.A0B = GOn.A0U(context, fbUserSession);
        this.A0G = new Gps(this, 10);
        this.A0I = new HVr(this);
        this.A0J = new Gyx(this, 10);
        this.A0H = new Gq7(this, 8);
        this.A0F = new IUn(this);
    }
}
