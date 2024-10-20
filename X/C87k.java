package X;

import java.util.BitSet;

/* renamed from: X.87k, reason: invalid class name */
/* loaded from: 87k.class */
public final class C87k extends C1rs {
    public 1Iw A00;
    public C7Zg A01;
    public final BitSet A02;
    public final String[] A03;

    public C87k(1Iw r302, C7Zg c7Zg) {
        super(c7Zg, r302, 0, 0);
        this.A03 = new String[]{"cacheEfficiencyHelper", "loggingExtras", "messageId", "offlineThreadingId", "photo", "renderableMessage", "vaultContext"};
        BitSet A18 = 1BK.A18(7);
        this.A02 = A18;
        this.A01 = c7Zg;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A16(this, this.A02, this.A03);
        return this.A01;
    }
}
