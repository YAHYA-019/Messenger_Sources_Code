package X;

import java.util.BitSet;

/* renamed from: X.88r, reason: invalid class name */
/* loaded from: 88r.class */
public final class C88r extends C1rs {
    public 1Iw A00;
    public C88q A01;
    public final BitSet A02;
    public final String[] A03;

    public C88r(1Iw r302, C88q c88q) {
        super(c88q, r302, 0, 0);
        this.A03 = new String[]{"fragmentManager", "listener", "message", "shouldShowDownloadButton", "videoAttachmentData"};
        BitSet A18 = 1BK.A18(5);
        this.A02 = A18;
        this.A01 = c88q;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A04(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}
