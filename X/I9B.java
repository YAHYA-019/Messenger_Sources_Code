package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: I9B.class */
public final class I9B {
    public 8Lr A00;
    public boolean A01;
    public final Context A02;
    public final FbUserSession A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final C5y7 A0C;
    public final Gs9 A0D;
    public final 1De A0E;

    public I9B(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A0E = r303;
        this.A03 = fbUserSession;
        1BY r0 = r303.A00;
        this.A09 = 1Lm.A03(fbUserSession, r0, 114866);
        this.A04 = 1Bu.A03(r0, 82679);
        this.A07 = 1Bu.A03(r0, 114865);
        this.A05 = 7zM.A0Q();
        this.A0B = AbG.A0V();
        this.A06 = 1Bq.A00(16616);
        this.A08 = 1Lm.A03(fbUserSession, r0, 33124);
        Context A00 = FbInjector.A00();
        this.A02 = A00;
        1Bn.A0E((Context) null, r0, 114867);
        this.A0C = new C5y7(A00, fbUserSession);
        this.A0A = 1Lm.A03(fbUserSession, r0, 17061);
        this.A0D = new Gs9(this);
    }

    public static final void A00(8Lr r301, I9B i9b) {
        0D7 A08;
        0DA r315;
        String str;
        0DA r303;
        C2623GjD c2623GjD = (C2623GjD) r301.A00;
        boolean z = r301.A01;
        CQS cqs = (CQS) 1Br.A0B(i9b.A04);
        FbUserSession fbUserSession = i9b.A03;
        String str2 = c2623GjD.A04;
        ThreadKey threadKey = c2623GjD.A02;
        long j = c2623GjD.A00;
        BOp bOp = c2623GjD.A01;
        Long l = c2623GjD.A03;
        1BK.A1K(str2, 1, bOp);
        04J A00 = CQS.A00(cqs);
        if (z) {
            A08 = AbF.A08(1BK.A08(A00, "messenger_wellbeing_restrict_failed"), 221);
            if (4YU.A1X(A08)) {
                r315 = new 0DA();
                String A02 = CQS.A02(threadKey, l);
                str = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
                r315.A07(str, A02);
                r303 = new 0DA();
                AbG.A1L(r303, str, j);
                AbN.A0z(A08, CQS.A01(bOp, fbUserSession, threadKey, cqs, str2), r315, r303);
            }
        } else {
            A08 = AbF.A08(1BK.A08(A00, "messenger_wellbeing_unrestrict_failed"), 229);
            if (4YU.A1X(A08)) {
                r315 = new 0DA();
                String A022 = CQS.A02(threadKey, l);
                str = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
                r315.A07(str, A022);
                r303 = new 0DA();
                AbG.A1L(r303, str, j);
                AbN.A0z(A08, CQS.A01(bOp, fbUserSession, threadKey, cqs, str2), r315, r303);
            }
        }
        A01(i9b);
    }

    public static final void A01(I9B i9b) {
        i9b.A00 = null;
        if (i9b.A01) {
            ((C21N) 1Br.A0B(i9b.A08)).A01(i9b.A0D);
            i9b.A01 = false;
        }
    }

    public final void A02(C2623GjD c2623GjD) {
        CQS cqs = (CQS) 1Br.A0B(this.A04);
        FbUserSession fbUserSession = this.A03;
        String str = c2623GjD.A04;
        ThreadKey threadKey = c2623GjD.A02;
        long j = c2623GjD.A00;
        BOp bOp = c2623GjD.A01;
        Long l = c2623GjD.A03;
        1BK.A1K(str, 1, bOp);
        2R2 A08 = AbF.A08(1BK.A08(CQS.A00(cqs), 1BJ.A00(1734)), 228);
        if (4YU.A1X(A08)) {
            0DA r0 = new 0DA();
            r0.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID, CQS.A02(threadKey, l));
            0DA r02 = new 0DA();
            AbG.A1L(r02, PublicKeyCredentialControllerUtility.JSON_KEY_ID, j);
            AbN.A0z(A08, CQS.A01(bOp, fbUserSession, threadKey, cqs, str), r0, r02);
        }
        8Lr r03 = new 8Lr(c2623GjD, true);
        this.A00 = r03;
        if (!this.A01) {
            ((C21N) 1Br.A0B(this.A08)).A00(this.A0D);
            this.A01 = true;
        }
        I7b.A01(new IaU(r03, this), (I7b) 1Br.A0B(this.A09), c2623GjD, true);
    }

    public final void A03(C2623GjD c2623GjD) {
        CQS cqs = (CQS) 1Br.A0B(this.A04);
        FbUserSession fbUserSession = this.A03;
        String str = c2623GjD.A04;
        ThreadKey threadKey = c2623GjD.A02;
        long j = c2623GjD.A00;
        BOp bOp = c2623GjD.A01;
        Long l = c2623GjD.A03;
        1BK.A1K(str, 1, bOp);
        2R2 A08 = AbF.A08(1BK.A08(CQS.A00(cqs), 1BJ.A00(1736)), 231);
        if (4YU.A1X(A08)) {
            0DA r0 = new 0DA();
            r0.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID, CQS.A02(threadKey, l));
            0DA r02 = new 0DA();
            AbG.A1L(r02, PublicKeyCredentialControllerUtility.JSON_KEY_ID, j);
            AbN.A0z(A08, CQS.A01(bOp, fbUserSession, threadKey, cqs, str), r0, r02);
        }
        8Lr r03 = new 8Lr(c2623GjD, false);
        this.A00 = r03;
        if (!this.A01) {
            ((C21N) 1Br.A0B(this.A08)).A00(this.A0D);
            this.A01 = true;
        }
        I7b.A01(new IaV(r03, this), (I7b) 1Br.A0B(this.A09), c2623GjD, false);
    }

    public final boolean A04(long j) {
        C2623GjD c2623GjD;
        8Lr r0 = this.A00;
        boolean z = false;
        if (r0 != null && (c2623GjD = (C2623GjD) r0.A00) != null && c2623GjD.A00 == j) {
            z = true;
        }
        return z;
    }
}
