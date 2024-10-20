package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.integrity.frx.model.AdditionalActionsPage;
import com.facebook.messaging.integrity.frx.model.EvidencePage;
import com.facebook.messaging.integrity.frx.model.EvidenceSearchPage;
import com.facebook.messaging.integrity.frx.model.FeedbackPage;
import com.facebook.messaging.integrity.frx.model.GroupMembersPage;
import com.facebook.messaging.integrity.frx.model.MarketplaceFeedbackPage;
import com.facebook.messaging.integrity.frx.ui.fragment.FeedbackReportFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* loaded from: Clc.class */
public final class Clc implements DIm {
    public final 1Br A00;
    public final 1Iw A01;
    public final CQd A02;
    public final CIN A03;
    public final COr A04;
    public final CQ2 A05;
    public final Byr A06;
    public final C0p A07;
    public final FeedbackReportFragment A08;
    public final MigColorScheme A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public Clc(1Iw r302, CQd cQd, CIN cin, COr cOr, CQ2 cq2, Byr byr, C0p c0p, FeedbackReportFragment feedbackReportFragment, MigColorScheme migColorScheme, boolean z, boolean z2, boolean z3) {
        1BL.A1F(r302, c0p);
        1BL.A1G(cq2, cin);
        7zS.A18(7, cQd, cOr, byr);
        11T.A0F(migColorScheme, 10);
        this.A01 = r302;
        this.A07 = c0p;
        this.A0B = z;
        this.A0A = z2;
        this.A05 = cq2;
        this.A03 = cin;
        this.A02 = cQd;
        this.A04 = cOr;
        this.A06 = byr;
        this.A09 = migColorScheme;
        this.A0C = z3;
        this.A08 = feedbackReportFragment;
        this.A00 = 1Bu.A01(7zL.A0A(r302), 16428);
    }

    private final AxX A00(String str, boolean z) {
        return new AxX(this.A07, this.A09, str, this.A0B, !z);
    }

    @Override // X.DIm
    public /* bridge */ /* synthetic */ Object D9P(AdditionalActionsPage additionalActionsPage) {
        1Iw r0 = this.A01;
        r0.A0D(additionalActionsPage.A00());
        FbUserSession A03 = 1Br.A03(this.A00);
        AuK auK = new AuK(r0, new B1D());
        B1D b1d = auK.A01;
        b1d.A00 = A03;
        BitSet bitSet = auK.A02;
        bitSet.set(2);
        b1d.A01 = A00("", false).A0l();
        bitSet.set(5);
        b1d.A05 = this.A09;
        bitSet.set(0);
        b1d.A03 = additionalActionsPage;
        bitSet.set(4);
        b1d.A04 = this.A08;
        bitSet.set(3);
        b1d.A02 = this.A02;
        bitSet.set(1);
        7zP.A15(auK, bitSet, auK.A03);
        return b1d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x032f, code lost:
    
        if (r0 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0427, code lost:
    
        if (r0.equals(r0) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00bf, code lost:
    
        if (r0 != false) goto L11;
     */
    @Override // X.DIm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ java.lang.Object D9Q(com.facebook.messaging.integrity.frx.model.BlockPage r302) {
        /*
            Method dump skipped, instructions count: 2547
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Clc.D9Q(com.facebook.messaging.integrity.frx.model.BlockPage):java.lang.Object");
    }

    @Override // X.DIm
    public /* bridge */ /* synthetic */ Object D9R(EvidencePage evidencePage) {
        1Iw r0 = this.A01;
        AuL auL = new AuL(r0, new AzB());
        AxX A00 = A00(this.A0A ? "" : r0.A0D(evidencePage.A00()), false);
        AzB azB = auL.A01;
        azB.A00 = A00.A0l();
        BitSet bitSet = auL.A02;
        bitSet.set(3);
        azB.A01 = this.A04;
        bitSet.set(1);
        azB.A02 = evidencePage;
        bitSet.set(2);
        azB.A03 = this.A09;
        bitSet.set(0);
        C1rs.A02(bitSet, auL.A03);
        auL.A0J();
        return azB;
    }

    @Override // X.DIm
    public /* bridge */ /* synthetic */ Object D9S(EvidenceSearchPage evidenceSearchPage) {
        return null;
    }

    @Override // X.DIm
    public /* bridge */ /* synthetic */ Object D9T(FeedbackPage feedbackPage) {
        String str = feedbackPage.A03;
        if (str == null) {
            str = this.A01.A0D(feedbackPage.A00());
        }
        AuN auN = new AuN(this.A01, new B0c());
        AxX A00 = A00(str, false);
        B0c b0c = auN.A01;
        b0c.A00 = A00.A0l();
        BitSet bitSet = auN.A02;
        bitSet.set(2);
        b0c.A01 = A00(str, true).A0l();
        bitSet.set(3);
        b0c.A03 = feedbackPage;
        bitSet.set(1);
        b0c.A02 = this.A05;
        b0c.A04 = this.A09;
        bitSet.set(0);
        C1rs.A02(bitSet, auN.A03);
        auN.A0J();
        return b0c;
    }

    @Override // X.DIm
    public /* bridge */ /* synthetic */ Object D9U(GroupMembersPage groupMembersPage) {
        1Iw r0 = this.A01;
        AuP auP = new AuP(r0, new AzC());
        AxX A00 = A00(r0.A0D(this.A0C ? 2131967096 : groupMembersPage.A00()), false);
        AzC azC = auP.A01;
        azC.A00 = A00.A0l();
        BitSet bitSet = auP.A02;
        bitSet.set(3);
        azC.A03 = this.A09;
        bitSet.set(0);
        azC.A01 = groupMembersPage;
        bitSet.set(1);
        azC.A02 = new RFd(this);
        bitSet.set(2);
        C1rs.A02(bitSet, auP.A03);
        auP.A0J();
        return azC;
    }

    @Override // X.DIm
    public /* bridge */ /* synthetic */ Object D9V(MarketplaceFeedbackPage marketplaceFeedbackPage) {
        String str = marketplaceFeedbackPage.A03;
        if (str == null) {
            str = this.A01.A0D(marketplaceFeedbackPage.A00());
        }
        QCL qcl = new QCL(this.A01, new QMs());
        AxX A00 = A00(str, false);
        QMs qMs = qcl.A01;
        qMs.A00 = A00.A0l();
        BitSet bitSet = qcl.A02;
        bitSet.set(2);
        qMs.A01 = A00(str, true).A0l();
        bitSet.set(3);
        qMs.A03 = marketplaceFeedbackPage;
        bitSet.set(1);
        qMs.A02 = this.A05;
        qMs.A04 = this.A09;
        bitSet.set(0);
        C1rs.A02(bitSet, qcl.A03);
        qcl.A0J();
        return qMs;
    }
}
