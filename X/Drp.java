package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.BitSet;

/* loaded from: Drp.class */
public final class Drp extends C1rs {
    public C2692Gle A00;
    public 1Iw A01;
    public final BitSet A02;
    public final String[] A03;

    public Drp(C2692Gle c2692Gle, 1Iw r303) {
        super(c2692Gle, r303, 0, 0);
        this.A03 = new String[]{"hierarchy", TraceFieldType.Uri};
        BitSet A18 = 1BK.A18(2);
        this.A02 = A18;
        this.A00 = c2692Gle;
        this.A01 = r303;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        C1rs.A00(this.A02, this.A03);
        A0J();
        return this.A00;
    }
}
