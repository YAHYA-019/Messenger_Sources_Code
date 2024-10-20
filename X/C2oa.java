package X;

import java.util.BitSet;

/* renamed from: X.2oa, reason: invalid class name */
/* loaded from: 2oa.class */
public final class C2oa extends C1rs {
    public 1Iw A00;
    public 2oZ A01;
    public final BitSet A02;
    public final String[] A03;

    public C2oa(1Iw r302, 2oZ r303) {
        super(r303, r302, 0, 0);
        this.A03 = new String[]{"callToActionListener", "colorScheme", "fragmentManager", "item", "itemViewBinderNavigation", "threadListRenderConfig", "threadRow"};
        BitSet bitSet = new BitSet(7);
        this.A02 = bitSet;
        this.A01 = r303;
        this.A00 = r302;
        bitSet.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A05(this.A02, this.A03, 7);
        A0J();
        return this.A01;
    }
}
