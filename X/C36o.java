package X;

import java.util.BitSet;

/* renamed from: X.36o, reason: invalid class name */
/* loaded from: 36o.class */
public final class C36o extends C1rs {
    public 1Iw A00;
    public AnonymousClass376 A01;
    public final BitSet A02;
    public final String[] A03;

    public C36o(1Iw r302, AnonymousClass376 anonymousClass376) {
        super(anonymousClass376, r302, 0, 0);
        this.A03 = new String[]{"callerContext", "colorScheme", "fbUserSession", "fragmentManager", "threadSummary"};
        BitSet A18 = 1BK.A18(5);
        this.A02 = A18;
        this.A01 = anonymousClass376;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ C1rs A2U(boolean z) {
        A2W(z);
        return this;
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A04(this.A02, this.A03);
        A0J();
        return this.A01;
    }

    public void A2W(boolean z) {
        super.A2U(z);
        this.A01.A05 = z;
    }
}
