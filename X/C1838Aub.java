package X;

import java.util.BitSet;

/* renamed from: X.Aub, reason: case insensitive filesystem */
/* loaded from: Aub.class */
public final class C1838Aub extends C1rs {
    public 1Iw A00;
    public Dyu A01;
    public final BitSet A02;
    public final String[] A03;

    public C1838Aub(1Iw r302, Dyu dyu) {
        super(dyu, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "confirmButtonTextRes", "confirmClickListener", "description", "isContactUploadTurnedOn", "learnMoreClickListener", "logoImage", "notNowButtonTextRes", "notNowClickListener", "title", "turnOffClickListener"};
        BitSet A18 = 1BK.A18(11);
        this.A02 = A18;
        this.A01 = dyu;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A1A(this, this.A02, this.A03);
        return this.A01;
    }
}
