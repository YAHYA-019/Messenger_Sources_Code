package X;

import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: A94.class */
public final class A94 implements AZp {
    public final /* synthetic */ C2sn A00;
    public final /* synthetic */ C8dm A01;
    public final /* synthetic */ C5by A02;
    public final /* synthetic */ 9hK A03;
    public final /* synthetic */ 4iI A04;
    public final /* synthetic */ CQo A05;

    public A94(C2sn c2sn, C8dm c8dm, C5by c5by, 9hK r305, 4iI r306, CQo cQo) {
        this.A02 = c5by;
        this.A05 = cQo;
        this.A03 = r305;
        this.A01 = c8dm;
        this.A04 = r306;
        this.A00 = c2sn;
    }

    @Override // X.AZp
    public void CFN(1Iw r302, String str, String str2, int i, int i2, boolean z) {
        C8dm c8dm;
        Long l;
        Long l2;
        1BL.A1F(str, str2);
        C5by c5by = this.A02;
        if (c5by != null && c5by == C5by.A07) {
            CQo.A09(BOn.A0B, this.A05, 238, 3);
        }
        9hK r0 = this.A03;
        if (r0.A05.A05 != C5by.A07.value || (l = (c8dm = this.A01).A04) == null || (l2 = c8dm.A03) == null) {
            C8dm c8dm2 = this.A01;
            9nH.A05(c8dm2.A01, c8dm2.A02);
        } else {
            ThreadKey A02 = this.A04.A02(l.longValue());
            if (A02 == null) {
                throw 1BK.A0h();
            }
            r0.A01(A02, str, str2, l2.longValue());
        }
    }

    @Override // X.AZp
    public boolean CFP(1Iw r302, String str, String str2, boolean z) {
        2R0 A00 = 7zQ.A0g().A00(3vP.A00(this.A00));
        C8dm c8dm = this.A01;
        HighlightsFeedContent highlightsFeedContent = c8dm.A02;
        synchronized (A00) {
            11T.A0F(highlightsFeedContent, 0);
            2R0.A09(A00, "ReactionExpansion", AVH.A00(highlightsFeedContent, A00, 12), 0, A00.A05);
        }
        9dJ.A01(c8dm.A01, highlightsFeedContent, (String) null, true);
        return true;
    }
}
