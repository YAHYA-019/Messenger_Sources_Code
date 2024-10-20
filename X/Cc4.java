package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.ImmutableList;

/* loaded from: Cc4.class */
public final class Cc4 implements 2SQ {
    public 2eS A00;
    public 2TV A01;
    public Bh7 A02;
    public final Context A03;
    public final FbUserSession A04;
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
    public final 1Br A0J;
    public final C5T A0K;
    public final COs A0L;
    public final COs A0M;
    public final COs A0N;
    public final CFH A0O;
    public final 1Br A0P;

    public Cc4(Context context, FbUserSession fbUserSession) {
        boolean A1Z = 7zP.A1Z(fbUserSession);
        this.A03 = context;
        this.A04 = fbUserSession;
        this.A0P = AbG.A0S();
        1Br A01 = 1Bu.A01(context, 148130);
        this.A06 = A01;
        1Br.A0C(A01);
        this.A0K = new C5T(context, fbUserSession);
        this.A0E = 1Lm.A00(context, fbUserSession, 84346);
        this.A0C = 1Bu.A01(context, 148114);
        this.A0A = 1Bu.A01(context, 148115);
        this.A0B = 1Bu.A01(context, 432);
        this.A0I = 1Bu.A01(context, 147991);
        this.A0J = 1Bu.A01(context, 147992);
        this.A0G = 1Bu.A01(context, 147990);
        this.A0H = 1Bu.A01(context, 147997);
        this.A08 = 1Bu.A01(context, 147999);
        this.A07 = 1Bu.A01(context, 147998);
        this.A05 = 1Bu.A01(context, 147996);
        1Br A012 = 1Bu.A01(context, 84390);
        this.A0D = A012;
        1Br.A0C(A012);
        this.A0N = new COs(this.A03, this.A04, new C1c(this));
        1Br.A0C(this.A0D);
        this.A0M = new COs(this.A03, this.A04, new C1c(this));
        1Br.A0C(this.A0D);
        this.A0L = new COs(this.A03, this.A04, new C1c(this));
        1Br A013 = 1Bu.A01(context, 84391);
        this.A0F = A013;
        1Br.A0C(A013);
        this.A0O = new CFH(context, fbUserSession, new CsA(this), A1Z);
        this.A09 = 1Bu.A01(context, 147995);
    }

    public static final ImmutableList A00(DK4 dk4, ImmutableList immutableList) {
        ImmutableList of;
        if (immutableList == null || immutableList.isEmpty()) {
            of = ImmutableList.of();
        } else {
            of = AbH.A0x(D3V.A00, AbJ.A0r(D3J.A01(dk4, 48), immutableList));
        }
        11T.A0D(of);
        return of;
    }

    public final boolean A01(BP5 bp5) {
        COs cOs;
        if (bp5 == null) {
            return false;
        }
        int ordinal = bp5.ordinal();
        if (ordinal == 36) {
            cOs = this.A0N;
        } else if (ordinal == 37) {
            cOs = this.A0M;
        } else {
            if (ordinal != 38) {
                return false;
            }
            cOs = this.A0L;
        }
        return cOs.A09.get();
    }

    public void AEC() {
        2eS r0 = this.A00;
        if (r0 != null) {
            r0.A00(true);
        }
    }

    public void CmR(2TV r302) {
        this.A01 = r302;
    }

    public /* bridge */ /* synthetic */ void D1t(Object obj) {
        throw 0Q8.createAndThrow();
    }
}
