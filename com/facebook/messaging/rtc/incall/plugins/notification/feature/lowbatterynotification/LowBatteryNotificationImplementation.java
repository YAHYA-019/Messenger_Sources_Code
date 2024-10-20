package com.facebook.messaging.rtc.incall.plugins.notification.feature.lowbatterynotification;

import X.1BK;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.2JS;
import X.2yD;
import X.7zO;
import X.C4A7;
import X.GOn;
import X.GOp;
import X.GOq;
import X.HEt;
import X.IQH;
import X.IY8;
import X.Is9;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.rsys.call.gen.CallModel;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: LowBatteryNotificationImplementation.class */
public final class LowBatteryNotificationImplementation extends HEt {
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final IQH A0A;
    public final IY8 A0B;
    public final AtomicBoolean A0C;

    public LowBatteryNotificationImplementation(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A00 = context;
        this.A03 = GOn.A0R(context);
        this.A04 = 1BK.A0C();
        this.A06 = 1Bq.A00(115668);
        this.A01 = 1Bq.A00(99410);
        this.A09 = GOn.A0P();
        this.A08 = 1Bu.A00(115602);
        this.A0C = 7zO.A15();
        this.A05 = GOn.A0U(context, fbUserSession);
        this.A0B = IY8.A01(this, 52);
        this.A07 = GOn.A0W(context, fbUserSession);
        this.A02 = 1Lm.A00(context, fbUserSession, 84181);
        this.A0A = new IQH(this);
    }

    public static final void A00(LowBatteryNotificationImplementation lowBatteryNotificationImplementation, 2JS r302) {
        if (A01(lowBatteryNotificationImplementation, r302) && ((HEt) lowBatteryNotificationImplementation).A00 != null && GOp.A1a(lowBatteryNotificationImplementation.A0C)) {
            GOp.A1H(lowBatteryNotificationImplementation.A09).schedule(new Is9(lowBatteryNotificationImplementation), 1Br.A07(lowBatteryNotificationImplementation.A04).Auy(36599087071826387L), TimeUnit.SECONDS);
        }
    }

    public static final boolean A01(LowBatteryNotificationImplementation lowBatteryNotificationImplementation, 2JS r302) {
        CallModel A0j = GOq.A0j(r302);
        boolean z = false;
        if (A0j != null && A0j.inCallState == 7 && ((C4A7) 1Br.A0B(lowBatteryNotificationImplementation.A01)).A04(2yD.A00(1Br.A07(lowBatteryNotificationImplementation.A04), 36599087071629778L))) {
            z = true;
        }
        return z;
    }
}
