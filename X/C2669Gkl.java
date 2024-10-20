package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.BitSet;

/* renamed from: X.Gkl, reason: case insensitive filesystem */
/* loaded from: Gkl.class */
public final class C2669Gkl extends C1rs {
    public 1Iw A00;
    public C7g4 A01;
    public final BitSet A02;
    public final String[] A03;

    public C2669Gkl(1Iw r302, C7g4 c7g4) {
        super(c7g4, r302, 0, 0);
        this.A03 = new String[]{"onClickEvent", "onImpressionEvent", TraceFieldType.Uri};
        BitSet A18 = 1BK.A18(3);
        this.A02 = A18;
        this.A01 = c7g4;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A03(this.A02, this.A03);
        A0J();
        return this.A01;
    }
}
