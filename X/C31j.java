package X;

import java.util.BitSet;

/* renamed from: X.31j, reason: invalid class name */
/* loaded from: 31j.class */
public final class C31j extends C1rs {
    public 1Iw A00;
    public C5bo A01;
    public final BitSet A02;
    public final String[] A03;

    public C31j(1Iw r302, C5bo c5bo) {
        super(c5bo, r302, 0, 0);
        this.A03 = new String[]{"fbUserSession", "impressionTracker", "inboxTrayEventLogger", "item", "migColorScheme"};
        BitSet bitSet = new BitSet(5);
        this.A02 = bitSet;
        this.A01 = c5bo;
        this.A00 = r302;
        bitSet.clear();
    }
}
