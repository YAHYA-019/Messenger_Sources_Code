package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import java.util.List;

/* renamed from: X.8rM, reason: invalid class name */
/* loaded from: 8rM.class */
public final class C8rM extends 2QB {
    public boolean A00;
    public C1qM A01;
    public boolean A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final C5bx A08;
    public final FbUserSession A09;
    public final 1HN A0A;

    public C8rM(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A09 = fbUserSession;
        this.A04 = 1Bq.A00(83207);
        this.A06 = 1Bq.A00(68229);
        this.A05 = 1BK.A0E();
        this.A07 = 1Lm.A01(fbUserSession, 16686);
        this.A03 = 1Bq.A00(67765);
        this.A08 = (C5bx) 1Lo.A08(fbUserSession, 67495);
        this.A0A = new A1u(this, 0);
    }

    public static final void A00(C8rM c8rM) {
        2QC r306;
        Integer num;
        0fH.A0j("HighlightsTabV2BadgeController", "updateBadge()");
        boolean A00 = ((2R4) 1Br.A0B(c8rM.A06)).A00();
        if (!c8rM.A00) {
            if (!A00) {
                0fH.A0j("HighlightsTabV2BadgeController", "Show badge due to NUX");
                num = 0S2.A00;
            } else if (c8rM.A02) {
                0fH.A0j("HighlightsTabV2BadgeController", "Show badge due to Badging Flag");
                num = 0S2.A01;
            }
            1Br.A0C(c8rM.A04);
            r306 = new 2QC(num, "RED_DOT", 1);
            c8rM.A04(r306);
        }
        0fH.A0j("HighlightsTabV2BadgeController", 1BJ.A00(255));
        r306 = 2QC.A03;
        c8rM.A04(r306);
    }

    public void A05() {
        0fH.A0j("HighlightsTabV2BadgeController", "onContentSeen()");
        C5bx c5bx = this.A08;
        List A03 = 11T.A03("feed");
        MailboxFeature A0d = 7zP.A0d(c5bx.A0D);
        PrivacyContext A00 = ((AnonymousClass224) 1Br.A0B(c5bx.A0F)).A00("1299289207322385");
        1Um AQV = A0d.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        MailboxFutureImpl A0P2 = 1BK.A0P(AQV);
        1Um.A01(AQV, new A0a(4, A0d, A0P2, A0P, A00, A03), A0P, A0P2);
        A0P.addResultCallback(A1G.A00);
    }

    public void A06() {
        1Br.A09(this.A05).CcV(this.A0A, 1NK.A1U);
        if (this.A01 == null) {
            0fH.A0j("HighlightsTabV2BadgeController", "Build Stored Procedure Listener");
            this.A01 = new C9zx(this, 6);
        }
        0fH.A0j("HighlightsTabV2BadgeController", "Add Stored Procedure Listener");
        1Uj r0 = (1Uj) 1Br.A0B(this.A07);
        C1qM c1qM = this.A01;
        if (c1qM == null) {
            11T.A0L("higlightsTabSprocChangeListener");
            throw 0Q8.createAndThrow();
        }
        C21S.A00(c1qM, r0);
    }

    public void A07() {
        1Br.A09(this.A05).D63(this.A0A, 1NK.A1U);
        if (this.A01 != null) {
            0fH.A0j("HighlightsTabV2BadgeController", "Remove Stored Procedure Listener");
            1Uj r0 = (1Uj) 1Br.A0B(this.A07);
            C1qM c1qM = this.A01;
            if (c1qM == null) {
                11T.A0L("higlightsTabSprocChangeListener");
                throw 0Q8.createAndThrow();
            }
            C21S.A01(c1qM, r0);
        }
    }

    public final void A08(boolean z) {
        if (this.A02 != z) {
            this.A02 = z;
            ((1FP) 1Br.A0B(this.A03)).D3D(3Ds.A04, 0S2.A00, new ADN(this), "RefreshBadgingForHighlightsTab");
        }
    }
}
