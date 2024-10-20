package X;

import java.util.BitSet;

/* renamed from: X.Auc, reason: case insensitive filesystem */
/* loaded from: Auc.class */
public final class C1839Auc extends C1rs {
    public 1Iw A00;
    public B0X A01;
    public final BitSet A02;
    public final String[] A03;

    public C1839Auc(1Iw r302, B0X b0x) {
        super(b0x, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "confirmButtonTextRes", "confirmClickListener", "countrySpinnerStateContainer", "description", "editFieldStateContainer", "logoImage", "notNowButtonTextRes", "notNowClickListener", "title"};
        BitSet A18 = 1BK.A18(10);
        this.A02 = A18;
        this.A01 = b0x;
        this.A00 = r302;
        A18.clear();
    }

    @Override // X.C1rs
    public /* bridge */ /* synthetic */ 1LI A2V() {
        7zP.A19(this, this.A02, this.A03);
        return this.A01;
    }
}
