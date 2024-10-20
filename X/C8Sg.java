package X;

import java.util.BitSet;

/* renamed from: X.8Sg, reason: invalid class name */
/* loaded from: 8Sg.class */
public final class C8Sg extends C1rs {
    public 1Iw A00;
    public C8n5 A01;
    public final BitSet A02;
    public final String[] A03;

    public C8Sg(1Iw r302, C8n5 c8n5) {
        super(c8n5, r302, 0, 0);
        this.A03 = new String[]{"stickerLayout"};
        BitSet A18 = 1BK.A18(1);
        this.A02 = A18;
        this.A01 = c8n5;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public C8n5 A2V() {
        C1rs.A01(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}
