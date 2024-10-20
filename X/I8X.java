package X;

import android.content.Context;
import android.content.DialogInterface;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: I8X.class */
public final class I8X {
    public DMV A00;
    public final FbUserSession A01;
    public final 1De A02;
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
    public final 54D A0F;
    public final 2QO A0G;
    public final C01i A0H;
    public final Context A0I;

    public I8X(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A02 = r303;
        this.A01 = fbUserSession;
        1BY r0 = r303.A00;
        this.A07 = 1Lm.A03(fbUserSession, r0, 100046);
        this.A0E = 1Lm.A03(fbUserSession, r0, 99477);
        this.A09 = 1Lm.A03(fbUserSession, r0, 99977);
        this.A08 = GOn.A0j(fbUserSession, r0);
        this.A06 = 1Lm.A03(fbUserSession, r0, 114847);
        this.A03 = 1Lm.A03(fbUserSession, r0, 114931);
        this.A04 = GOo.A0M(r0);
        this.A05 = 1Bu.A03(r0, 114932);
        this.A0B = 1Bu.A03(r0, 67527);
        Context A0A = 7zM.A0A();
        this.A0I = A0A;
        this.A0A = 1Lm.A03(fbUserSession, r0, 84181);
        this.A0F = new 54D(fbUserSession, A0A);
        this.A0H = J9s.A01(this, 20);
        this.A0C = 1Bu.A03(r0, 65862);
        this.A0G = (2QO) 1Lo.A04((Context) null, fbUserSession, r0, 99977);
        this.A0D = 1Lm.A03(fbUserSession, r0, 114833);
    }

    public static final void A00(Context context, HbO hbO, I8X i8x) {
        C00i c00i = i8x.A07.A00;
        if (!GOo.A0T(c00i).A0F() || GOq.A1T(i8x.A09)) {
            if (GOo.A0T(c00i).A0F()) {
                GOo.A0T(c00i).A0A(hbO, (Boolean) null, true);
                return;
            } else {
                ((IDX) 1Br.A0B(i8x.A06)).A05(context, hbO, (Boolean) null, true, true, true, false);
                return;
            }
        }
        C00i c00i2 = i8x.A03.A00;
        if (((I45) c00i2.get()).A02 == null && GOq.A1R(i8x.A04)) {
            ((I45) c00i2.get()).A01();
        }
        GOo.A0T(c00i).A08 = false;
        GOp.A0s(i8x.A08).A0w(false);
        ((CNY) 1Br.A0B(i8x.A0A)).A04("AvatarInRtcPresenteravatar_toggle", false);
    }

    public static final void A01(Context context, HbO hbO, I8X i8x, String str, boolean z) {
        AnonymousClass001.A07().post(new J2s(context, hbO, i8x, str, z));
    }

    public final void A02(Context context, HbO hbO) {
        11T.A0F(context, 0);
        8Lp A06 = GOp.A0T(this.A07).A06();
        boolean z = true;
        if (!A06.A01 || A06.A00) {
            8LW A01 = this.A0F.A01();
            if (A01 == null || !GOo.A1X(A01)) {
                A00(context, hbO, this);
                return;
            }
            DMV dmv = this.A00;
            if (dmv != null) {
                dmv.dismiss();
            }
            C2121Dea c2121Dea = new C2121Dea(context);
            c2121Dea.A06(2131966400);
            c2121Dea.A05(2131966399);
            c2121Dea.A0E(new IGR(context, this, 11), 2131966398);
            c2121Dea.A0D((DialogInterface.OnClickListener) null, 2131966397);
            ((DKS) c2121Dea).A01.A06 = new IGZ(this, 12);
            DMV A0I = c2121Dea.A0I();
            try {
                A0I.show();
            } catch (Throwable unused) {
            }
            this.A00 = A0I;
            return;
        }
        6Ki r0 = (6Ki) 1De.A00(this.A02, 50069);
        if (!r0.A06() || !r0.A07()) {
            z = false;
        }
        Number number = (Number) A06.A03;
        if (number != null) {
            int intValue = number.intValue();
            I7P.A00(this.A01, GOp.A0S(this.A05), "avatar_upgrade_upsell_shown", "");
            DR6 A02 = ((C5ic) 1Br.A0B(this.A0B)).A02(context);
            A02.A06(intValue);
            int i = 2131953147;
            if (z) {
                i = 2131953148;
            }
            A02.A0D(new CR9(1, context, r0, z), i);
            A02.A0H(new IGZ(this, 11));
            A02.A05();
        }
    }
}
