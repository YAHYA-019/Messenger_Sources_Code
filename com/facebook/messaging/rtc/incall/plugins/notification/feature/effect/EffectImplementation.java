package com.facebook.messaging.rtc.incall.plugins.notification.feature.effect;

import X.11T;
import X.1BK;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.7zL;
import X.7zP;
import X.C0ty;
import X.C1u3;
import X.C1u4;
import X.C2523Gg7;
import X.C9V;
import X.GOn;
import X.GgI;
import X.GgK;
import X.GjI;
import X.HBr;
import X.HEt;
import X.HG5;
import X.HVs;
import X.Hre;
import X.I8a;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.user.model.User;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: EffectImplementation.class */
public final class EffectImplementation extends HEt {
    public final long A00;
    public final Context A01;
    public final FbUserSession A02;
    public final C2523Gg7 A03;
    public final HG5 A04;
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
    public final 1Br A0F;
    public final 1Br A0G;
    public final 1Br A0H;
    public final 1Br A0I;
    public final HVs A0J;
    public final GgK A0K;
    public final Set A0L;

    public EffectImplementation(Context context, FbUserSession fbUserSession) {
        int A05 = 7zP.A05(context, fbUserSession, 1);
        this.A01 = context;
        this.A02 = fbUserSession;
        this.A0E = 1Lm.A00(context, fbUserSession, 114833);
        this.A09 = 1Lm.A00(context, fbUserSession, 98491);
        this.A0F = GOn.A0U(context, fbUserSession);
        this.A07 = 1Bu.A00(114748);
        this.A06 = 1Bu.A01(context, 99980);
        this.A0D = 1Bu.A01(context, 114921);
        this.A0G = 1Bu.A01(context, 115480);
        this.A0I = 1Bu.A01(context, 115459);
        this.A08 = 1Bu.A01(context, 114917);
        this.A05 = 1Lm.A00(context, fbUserSession, 115410);
        this.A0H = 1Bq.A00(83005);
        this.A0B = 1Bu.A01(context, 83156);
        this.A0A = 1BK.A0E();
        this.A0C = 1BK.A0C();
        this.A00 = TimeUnit.SECONDS.toMillis(6);
        this.A0L = 7zL.A15();
        this.A0J = new HVs(this);
        this.A04 = new GgI(this, 18);
        this.A03 = new C2523Gg7(this, A05);
        this.A0K = new GgK(this);
    }

    public static final User A00(EffectImplementation effectImplementation, String str) {
        if (str == null) {
            return null;
        }
        return ((C9V) 1Br.A0B(effectImplementation.A0H)).A01(effectImplementation.A02, 1BK.A0X(str));
    }

    public static final void A01(EffectImplementation effectImplementation, User user) {
        String str;
        I8a i8a = ((HEt) effectImplementation).A00;
        if (i8a != null) {
            HBr hBr = HBr.A0S;
            String string = (user == null || (str = user.A0X.firstName) == null || str.length() == 0) ? effectImplementation.A01.getString(2131964918) : 1BK.A0v(effectImplementation.A01, str, 2131964919);
            11T.A0D(string);
            i8a.A02(new GjI((Uri) null, (View.OnClickListener) null, (View.OnClickListener) null, (C1u3) null, C1u4.SIZE_32, (Hre) null, (Hre) null, hBr, string, (CharSequence) null, C0ty.A00, 0, 0, 0, 3000L, false, true));
        }
    }
}
