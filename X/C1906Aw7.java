package X;

import java.util.BitSet;

/* renamed from: X.Aw7, reason: case insensitive filesystem */
/* loaded from: Aw7.class */
public final class C1906Aw7 extends C1rs {
    public 1Iw A00;
    public B05 A01;
    public final BitSet A02;
    public final String[] A03;

    public C1906Aw7(1Iw r302, B05 b05) {
        super(b05, r302, 0, 0);
        this.A03 = new String[]{"contactName", "endTimestampSec", "pageTimeZone", "shouldShowContactInfo", "shouldShowFollowUpSection", "startTimestampSec"};
        BitSet A18 = 1BK.A18(6);
        this.A02 = A18;
        this.A01 = b05;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A15(this, this.A02, this.A03);
        return this.A01;
    }
}
