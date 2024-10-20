package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.quicklog.reliability.UserFlowLogger;

/* renamed from: X.9ga, reason: invalid class name */
/* loaded from: 9ga.class */
public final class C9ga {
    public String A00;
    public boolean A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 0Xs A0A;
    public final 0Xs A0B;
    public final C15t A0C;
    public final C15t A0D;
    public final boolean A0E;

    public C9ga(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A07 = 1Bq.A00(49709);
        this.A02 = 7zM.A0d();
        this.A09 = 1Lm.A01(fbUserSession, 131133);
        this.A08 = 1Lm.A01(fbUserSession, 68884);
        this.A04 = 7zM.A0W();
        this.A06 = 1Lm.A01(fbUserSession, 68386);
        this.A05 = 1Lm.A01(fbUserSession, 68797);
        this.A03 = 1Bu.A00(68385);
        C1ud A0a = 7zP.A0a(this.A04);
        this.A0E = AnonymousClass001.A1O((7zM.A06(A0a, C1ud.A00(A0a), 36597901672779577L) > 1L ? 1 : (7zM.A06(A0a, C1ud.A00(A0a), 36597901672779577L) == 1L ? 0 : -1)));
        this.A00 = "";
        0Ro A1A = 7zL.A1A(new 8Kt("", false, false, 0));
        this.A0B = A1A;
        this.A0D = new 0Xr((C2a2) null, A1A);
        0Ro A00 = 0Du.A00(this.A0E ? 96B.A03 : 96B.A05);
        this.A0A = A00;
        this.A0C = new 0Xr((C2a2) null, A00);
        if (((C9c4) 1Br.A0B(this.A08)).A02 == null) {
            0fH.A0j("PinReminderViewData", "hsm virtual device id is null");
            this.A0A.Cvx(96B.A02);
        }
        9hC r0 = (9hC) 1Br.A0B(this.A05);
        int A02 = ((9lI) 1Br.A0B(this.A03)).A02();
        int A03 = ((9lI) 1Br.A0B(this.A03)).A03();
        1Br r02 = r0.A03;
        UserFlowLogger A0Z = 4YV.A0Z(r02);
        long j = r0.A01;
        7zN.A1Z(A0Z, C96q.A0C.toString(), j, false);
        UserFlowLogger A0Z2 = 4YV.A0Z(r02);
        C1ud A0a2 = 7zP.A0a(r0.A02);
        A0Z2.flowAnnotate(j, "VARIANT", 7zM.A06(A0a2, C1ud.A00(A0a2), 36597901672779577L));
        4YV.A0Z(r02).flowAnnotate(j, "TOUCHPOINT", A02 + 1);
        4YV.A0Z(r02).flowAnnotate(j, "DISMISS_COUNT", A03);
        r0.A00 = true;
        C2ax c2ax = (C2ax) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 68386);
        0fH.A0j("PinReminderProvider", "updateFlagWhenPinReminderShown");
        c2ax.A00 = true;
        9lI A002 = C2ax.A00(c2ax);
        1Br r03 = A002.A01;
        FbSharedPreferences A09 = 1Br.A09(r03);
        1G9 r04 = 1NK.A4p;
        int ArU = A09.ArU(C1wg.A03(r04, 9lI.A00(A002)), 0);
        int i = ArU + 1;
        0fH.A0j("PinReminderFlagManager", 0Pz.A0C(ArU, i, "increaseRetryCount from ", " to "));
        1Ql edit = 1Br.A09(r03).edit();
        edit.CaE(C1wg.A03(r04, 9lI.A00(A002)), i);
        edit.commitImmediately();
        9lI A003 = C2ax.A00(c2ax);
        0fH.A0j("PinReminderFlagManager", "updateLastShownTime");
        1Ql edit2 = 1Br.A09(A003.A01).edit();
        edit2.CaH(C1wg.A03(1NK.A4q, 9lI.A00(A003)), 1Br.A00(A003.A00));
        edit2.commitImmediately();
        if (C2ax.A00(c2ax).A02() == 0) {
            long A032 = C2ax.A00(c2ax).A03();
            C1ud A0a3 = 7zP.A0a(c2ax.A05);
            if (A032 == 7zM.A06(A0a3, C1ud.A00(A0a3), 36597901671468852L)) {
                C2ax.A02(c2ax, false);
            }
        }
        0fH.A0j("PinReminderProvider", 0Pz.A0C(C2ax.A00(c2ax).A02(), C2ax.A00(c2ax).A03(), "updated success count to ", ", retry count to "));
    }

    public static final void A00(C9ga c9ga, String str) {
        0Xs r0 = c9ga.A0B;
        r0.getValue();
        r0.Cvx(new 8Kt(str, false, false, ((8Kt) r0.getValue()).A00 + 1));
    }
}
