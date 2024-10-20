package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Dfa, reason: case insensitive filesystem */
/* loaded from: Dfa.class */
public final class C2146Dfa extends AbstractC2178Dg6 {
    public int A00;
    public GKV A01;
    public final C1rq A02;
    public final ArrayList A03;

    public C2146Dfa(1Iw r302) {
        super(r302);
        this.A02 = C1rg.A01(r302, "FDSBaselineAlignedRow", 0);
        this.A03 = AnonymousClass001.A0s();
    }

    @Override // X.AbstractC2178Dg6
    public C1rs A0N(EzJ ezJ) {
        C1rq c1rq;
        11T.A0F(ezJ, 0);
        if (this.A01 == null) {
            c1rq = null;
        } else {
            int A02 = this.A05.A02(this.A00);
            GKV gkv = this.A01;
            11T.A0D(gkv);
            int AZ1 = A02 + gkv.AZ1(ezJ);
            c1rq = this.A02;
            GKV gkv2 = this.A01;
            11T.A0D(gkv2);
            C26z c26z = C26z.TOP;
            gkv2.BcJ(c26z, this.A00);
            c1rq.A2e(gkv2.ACp(ezJ));
            Iterator it = this.A03.iterator();
            while (it.hasNext()) {
                GKV gkv3 = (GKV) it.next();
                int AZ12 = gkv3.AZ1(ezJ);
                float f = 0.0f / 0.0f;
                gkv3.BcK(c26z, AZ12 == -1 ? 0 : AZ1 - gkv3.AZ1(ezJ));
                c1rq.A2e(gkv3.ACp(ezJ));
            }
        }
        return c1rq;
    }
}
