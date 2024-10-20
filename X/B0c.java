package X;

import com.facebook.messaging.integrity.frx.model.FeedbackPage;
import com.facebook.messaging.integrity.frx.model.FeedbackTag;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* loaded from: B0c.class */
public final class B0c extends C1rj {
    public 1LI A00;
    public 1LI A01;
    public CQ2 A02;
    public FeedbackPage A03;
    public MigColorScheme A04;

    public B0c() {
        super("FeedbackComponent");
    }

    public static C8ni A00(1Iw r301, 1Im r302, MigColorScheme migColorScheme, String str, boolean z) {
        AuO auO = new AuO(r301, new C8ni());
        7zO.A1J(auO, 2RH.A05);
        4YU.A1M(auO, 2RH.A04);
        C8ni c8ni = auO.A01;
        c8ni.A01 = str;
        BitSet bitSet = auO.A02;
        bitSet.set(0);
        c8ni.A03 = z;
        c8ni.A02 = true;
        auO.A2T(r302);
        c8ni.A00 = migColorScheme;
        C1rs.A01(bitSet, auO.A03);
        auO.A0J();
        return c8ni;
    }

    public final Object[] A0k() {
        return new Object[]{this.A04, this.A02, this.A03, this.A00, this.A01};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        B0c b0c = (B0c) super.A0l();
        1LI r0 = b0c.A00;
        1LI r304 = null;
        b0c.A00 = r0 != null ? r0.A0l() : null;
        1LI r02 = b0c.A01;
        if (r02 != null) {
            r304 = r02.A0l();
        }
        b0c.A01 = r304;
        return b0c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x08bc, code lost:
    
        if (r319 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x007f, code lost:
    
        if (r0.A05 != X.C5yq.A04) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0639, code lost:
    
        if (X.11T.A0O(r0.A02, "suicide") == false) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v183, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v345, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v371, types: [java.util.List] */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 2242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B0c.A0y(X.1Iw):X.1LI");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != 1032199377) {
            return null;
        }
        1Is r0 = r302.A00.A01;
        FeedbackTag feedbackTag = (FeedbackTag) r302.A03[0];
        B0c b0c = (B0c) r0;
        FeedbackPage feedbackPage = b0c.A03;
        CQ2 cq2 = b0c.A02;
        if (cq2 == null) {
            return null;
        }
        cq2.A06(feedbackTag, feedbackPage.A00);
        return null;
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        ((B1M) r303).A00 = true;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
