package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.1wb, reason: invalid class name */
/* loaded from: 1wb.class */
public final class C1wb {
    public final 1Br A03 = 1Bq.A00(65997);
    public final 1Br A0B = 1Bu.A00(66524);
    public final 1Br A01 = 1Bq.A00(68657);
    public final 1Br A04 = 1Bu.A00(68815);
    public final 1Br A05 = 1Bu.A00(68807);
    public final 1Br A06 = 1Bu.A00(68816);
    public final 1Br A09 = 1Bu.A00(66244);
    public final 1Br A08 = 1Bu.A00(66931);
    public final 1Br A07 = 1Bu.A00(66930);
    public final 1Br A00 = 1Bq.A00(68885);
    public final 1Br A0A = 1Bq.A00(68887);
    public final 1Br A02 = 1Bq.A00(66525);

    public static final C1wk A00(C1wb c1wb) {
        return (C1wk) c1wb.A0B.A00.get();
    }

    private final boolean A01(FbUserSession fbUserSession) {
        return ((1xK) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 68817)).A03(((C1wi) this.A00.A00.get()).A00(), ((83X) this.A0A.A00.get()).A00());
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x022d, code lost:
    
        if (r0 < ((X.C1ud.A00(r0).Av9(r0.A02, 36597901671665462L) * 60000) + r0.longValue())) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x044e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Integer A02(com.facebook.auth.usersession.FbUserSession r302) {
        /*
            Method dump skipped, instructions count: 1653
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1wb.A02(com.facebook.auth.usersession.FbUserSession):java.lang.Integer");
    }

    public final void A03() {
        0fH.A0j("NeueAvailabilityProvider", "mark encrypted backup hsm migration flow finished");
        C1wk A00 = A00(this);
        C1wk.A05(A00);
        1Ql A02 = C1wk.A02(A00);
        1G9 A002 = C1wg.A00(A00, 1NK.A57);
        C1ud c1ud = (C1ud) 1Br.A0B(A00.A00);
        A02.CaH(A002, C1ud.A00(c1ud).Av9(c1ud.A02, 36597901667208999L));
        A02.commitImmediately();
    }

    public final void A04() {
        0fH.A0j("NeueAvailabilityProvider", "mark encrypted backup Nux flow finished");
        A00(this).A0G();
    }

    public final void A05() {
        0fH.A0j("NeueAvailabilityProvider", "Reset encrypted backup Nux flow state");
        ((48X) 1Br.A0B(this.A01)).A00();
        A00(this).A0J();
        C1wk A00 = A00(this);
        1Ql A02 = C1wk.A02(A00);
        1G9 r0 = 1NK.A59;
        boolean A07 = C1wk.A07(A00);
        A02.Cdj(C1wg.A02(r0));
        1Ql.A00(A00, A02, 1NK.A57, A07 ? 1 : 0);
        1Ql.A00(A00, A02, 1NK.A58, A07 ? 1 : 0);
        1Ql.A00(A00, A02, 1NK.A5A, A07 ? 1 : 0);
        A02.commitImmediately();
        C1wk A002 = A00(this);
        1Ql A022 = C1wk.A02(A002);
        1Ql.A00(A002, A022, 1NK.A4m, A07 ? 1 : 0);
        1Ql.A00(A002, A022, 1NK.A4n, A07 ? 1 : 0);
        1Ql.A00(A002, A022, 1NK.A4o, A07 ? 1 : 0);
        A022.commitImmediately();
        C1wh.A01(new C2xg(), (C1wh) 1Br.A0B(this.A02));
    }

    public final boolean A06(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 0);
        Integer A02 = A02(fbUserSession);
        0fH.A0j("NeueAvailabilityProvider", 0Pz.A0W("show nux flow reason: ", 9Bs.A00(A02)));
        boolean z = false;
        if (A02 != 0S2.A1J) {
            z = true;
        }
        return z;
    }
}
