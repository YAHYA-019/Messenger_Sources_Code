package com.facebook.messaging.rtc.incall.plugins.notification.feature.voiceactivity;

import X.1BK;
import X.1BL;
import X.1Br;
import X.1Lm;
import X.GOn;
import X.HEt;
import X.HNu;
import X.IKB;
import X.IY8;
import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: VoiceActivityImplementation.class */
public final class VoiceActivityImplementation extends HEt {
    public long A00;
    public long A01;
    public boolean A02;
    public final Context A03;
    public final View.OnClickListener A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final IY8 A0B;

    public VoiceActivityImplementation(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A03 = context;
        this.A0A = GOn.A0W(context, fbUserSession);
        this.A05 = 1Lm.A00(context, fbUserSession, 115519);
        this.A06 = 1Lm.A00(context, fbUserSession, 99476);
        this.A09 = GOn.A0U(context, fbUserSession);
        this.A08 = GOn.A0Q();
        this.A07 = 1BK.A0C();
        this.A01 = HNu.A01;
        this.A04 = new IKB(this, 29);
        this.A0B = IY8.A01(this, 53);
    }
}
