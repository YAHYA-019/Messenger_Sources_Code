package X;

import java.util.BitSet;

/* renamed from: X.30h, reason: invalid class name */
/* loaded from: 30h.class */
public final class C30h extends C1rs {
    public 1Iw A00;
    public 4LW A01;
    public final BitSet A02;
    public final String[] A03;

    public C30h(1Iw r302, 4LW r303) {
        super(r303, r302, 0, 0);
        this.A03 = new String[]{"clickListener", "colorScheme", "fbUserSession", "impressionTracker", "inboxCloseConnectionItem", "inboxTrayEventLogger"};
        BitSet bitSet = new BitSet(6);
        this.A02 = bitSet;
        this.A01 = r303;
        this.A00 = r302;
        bitSet.clear();
    }
}
